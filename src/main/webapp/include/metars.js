var buffer;
var output;
var translated;

function metar(stationMetars)
{
    buffer = new SourceBuffer(stationMetars);
    buffer.advance(0);
    var value = ""

    while( buffer.token != "" )
    {
	   metar1();
	   value += "<p>" + output + "</p>\n\n";
	   buffer.match(/^@@@/);
    }

    return value;
}

/**
 * This function reads and translates one metar.  Input comes from the
 * token buffer, output is written to "output".
 */
function metar1()
{
    output = "";

    if( !translate_station() )
    	   return false;

    if( buffer.match(/^NIL/) )
    {
       output += "no report available.";
    }
    else
    {
	   translate_time();
	   translate_auto();
           translate_wind();
	   translate_visibility(false);
	   translate_rvr();
	   translate_weather();
	   translate_sky();
	   translate_tempdew();
	   translate_altimeter();
    }

    translate_remarks();

    output = output.replace(/, *$/, "");

    return true;
}

/**
 * This function is for general translations of items that aren''t
 * metars or tafs.
 */
function general() {
    var i;
    var form = document.raw;
    translated = document.getElementById('translated');
    buffer = new SourceBuffer(form.raw.value);
    buffer.advance(0);
    var value = ""
    for(i=0; i<40 && buffer.token != ""; ++i) {
	if( !general1() )
	    return false;
	value += output + "\n\n";
	buffer.match(/^=/);
    }
    translated.innerHTML = value;
    return false;
}

// translate one general piece of text
function general1() {
    output = "";

    translate_remarks()

    return true;
}

function translate_station()
{
    var result = buffer.match(/^[^ ]*/);
    if( result == null ) {
	output += "no station id? buffer is " + buffer.token + "\n";
	return false;
    }
    else {
	output += result[0] + " ";
	return true;
    }
}

var suffixes = ["th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"];

function date_sfx(date)
{
	// multiply *1 to convert string to int
	date = date*1
	return date >= 10 && date <= 19 ? "th" : suffixes[date%10]
}

function translate_time()
{
    // parse time into dd hhmm Z
    var daytime = buffer.match(/^(\d\d)(\d\d\d\d\w)\b/);
    if( daytime == null )
	output += "time missing, ";
    else {
	date1 = daytime[1]*1
	var sfx = date_sfx(date1)
	output += date1 + sfx + " @ " + daytime[2] + ", ";
    }
}


function translate_valid()
{
    var valid = buffer.match(/^(\d\d)(\d\d)(\d\d)\b/);
    if( valid != null ) {
	date1 = valid[1]*1
	var sfx = date_sfx(date1)
	output += "valid from " + date1 + sfx + " @ " + valid[2] +
		"00Z to " + valid[3] + "00Z, ";
	return
    }
    if( (valid = buffer.match(/^(\d\d)(\d\d)\/(\d\d)(\d\d)\b/)) != null ) {
	date1 = valid[1]*1
	var sfx1 = date_sfx(date1)
	date2 = valid[3]*1
	var sfx2 = date_sfx(date2)
	output += "valid from " + date1 + sfx1 + " @ " + valid[2] +
	  "00Z to " + date2 + sfx2 + " @ " + valid[4] + "00Z, "
	return
    }
    output += "valid time missing, ";
}

function translate_auto()
{
    if( buffer.match(/^AUTO/) )
	output += "automated report, ";
    if( buffer.match(/^COR/) )
	output += "corrected report, ";
}

function translate_wind()
{
    var wind = buffer.match(/^(\d{3})(\d{2,3})(G\d{2,3}|)(\w+)\b/);
    if( wind == null ) {
	wind = buffer.match(/^VRB(\d+)(\w+)/);
	if( wind == null )
	    output += "no wind, ";
	else
	    output += "wind variable at " + parseInt(wind[1],10) + " " +
		wind[2] + ", ";
    }
    else {
	var vrb = buffer.match(/^(VRB|\d\d\dV\d\d\d)/);
	if( wind[1] == 0 && wind[2] == 0 )
	    output += "wind calm, ";
	else {
	    output += "wind from " + wind[1] + " at " + parseInt(wind[2],10);
	    if( wind[3] != "" )
		output += ", gusting to " + wind[3].substring(1);
	    output += " " + wind[4] + ", ";
	}

	if( vrb != null ) {
	    if( vrb[0] == "VRB" )
		output += "winds variable, ";
	    else {
		vrb = vrb[0].match(/^(\d{3})V(\d{3})/);
		output += "winds varying from " + vrb[1]
		    + " to " + vrb[2] + ", ";
	    }
	}
    }
}

// Typical visiblity might look like:
//  6000 BR		6000' mist (TAF only)
//  M1/4 R		less than 1/4 mile rain
//  1 1/2 SN		1 1/2 miles snow
//  P10			greater than 10 miles
function translate_visibility(taf)
{
    var visib = buffer.match(/^(M|P|)(\d+ [\d\/]+|[\d\/]+)([A-Z]{2,})/);
    if( visib != null ) {
	output += "visibility ";
	if( visib[1] == "M" )
	    output += "less than ";
	else if( visib[1] == "P" )
	    output += "more than ";
	units = visib[3]
	if( abbreviations[units] != null )
	  units = abbreviations[units];
	output += visib[2] + " " + units + ", ";
    }
    else if( buffer.match(/^M\b/) ) {
	// The Federal Meteorological Handbook doesn't say you can
	// do this, but I've seen visibility reports coded as simply "M"
	// in non-automated reports, presumably meaning "missing"
	output += "visibility missing, ";
    }
    else if( buffer.match(/^9999\b/) ) {
	// Nothing in the handbook about this either.
	output += "visibility unlimited, ";
    }
    else if( (visib = buffer.match(/^(M|P|)(\d+)/)) ) {
	// Looks like just feet
	output += "visibility ";
	if( visib[1] == "M" )
	    output += "less than ";
	else if( visib[1] == "P" )
	    output += "more than ";
	output += visib[2] + "', ";
    }
}


function translate_rvr()
{
    var rvr;
    while(1) {
	if( (rvr = buffer.match(/^R(\w+)\/(\d+)V(\d+)([A-Z]+)/)) != null )
	    output += "runway visual range " + rvr[1] +
		" varying from " + rvr[2] + " to " + rvr[3] +
		" " + rvr[4] + ", ";
	else if( (rvr = buffer.match(/^R(\w+)\/(\d+)([A-Z]+)/)) != null )
	    output += "runway visual range " + rvr[1] +
		" " + rvr[2] + " " + rvr[3] + ", ";
	else if( (rvr = buffer.match(/^R(\w+)\/M(\d+)([A-Z]+)/)) != null )
	    output += "runway visual range " + rvr[1] +
		" less than " + rvr[2] + " " + rvr[3] + ", ";
	else if( (rvr = buffer.match(/^R(\w+)\/P(\d+)([A-Z]+)/)) != null )
	    output += "runway visual range " + rvr[1] +
		" more than " + rvr[2] + " " + rvr[3] + ", ";
	else
	    return;
    }
}


var wxterms = [
// descriptor group
    [/^BC/, "patches"], [/^BL/, "blowing"], [/^DR/, "drifting"],
    [/^FZ/, "freezing"], [/^MI/, "shallow"], [/^PR/, "partial"],
    [/^SH/, "shower"], [/^TS/, "thunder storm"],

// precipitation
    [/^RA/, "rain"], [/^DZ/, "drizzle"], [/^GR/, "hail"],
    [/^GS/, "small hail/snow pellets"], [/^IC/, "ice crystals"],
    [/^PE/, "pellet ice"], [/^SG/, "snow grains"], [/^SN/, "snow"],
    [/^UP/, "unknown precipitation"],

// obscuration
    [/^FG/, "fog"], [/^BR/, "mist"], [/^DU/, "widespread dust"],
    [/^FU/, "smoke"], [/^HZ/, "haze"], [/^PY/, "spray"],
    [/^SA/, "sand"], [/^VA/, "volcanic ash"],

// other
    [/^PO/, "dust whirls"], [/^DS/, "dust storm"], [/^FC/, "funnel cloud"],
    [/^\+FC/, "tornado/water spout"], [/^SQ/, "squalls"], [/^SS/, "sand storm"],
// intensity
    [/^\+/, "heavy"], [/^-/, "light"], [/^VC/, "vicinity"]];


function translate_weather()
{
    // OK, this one is ugly.  Weather report essentially consists of
    // repeating groups from the list above, possibly seperated by
    // spaces.  Take brute-force approach and simply translate terms
    // until no more found.
    var found = true;
    var foundany = false;
    while( found ) {
	found = false;
	for( var i = 0; i < wxterms.length; ++i) {
	    if( buffer.match(wxterms[i][0]) ) {
		if( !foundany ) {
		    output += "Weather:";
		    foundany = true;
		}
		output += " " + wxterms[i][1];
		found = true;
	    }
	}
    }
    if( foundany )
	output += ", ";
}

var skypat = /^(FEW|SCT|BKN|OVC|VV)([\d\/]{3})(CU|CB|TCU|CI|)/

var coverage = {"FEW":"few clouds", "SCT":"scattered", "BKN":"broken",
		    "OVC":"overcast", "VV":"indefinate ceiling"};

var skytype = {"CU":"cumulo", "CB":" cumulonimbus",
		"TCU":" towering cumulus", "CI":"cirrus"};

function translate_sky()
{
    var sky;
    var foundany = false;
    while(1) {
	if( buffer.match(/^(SKC|CAVOK)/) )
	    output += "sky clear, ";
	else if( buffer.match(/^CLR/) )
	    output += "sky clear below 12,000, ";
	else if( (sky = buffer.match(skypat)) != null ) {
	    if( !foundany ) {
		output += "Sky: ";
		foundany = true;
	    }
	    output += coverage[sky[1]];
	    if( sky[2] == "///" )
		output += " below station";
	    else {
		sky[2] = sky[2].replace(/^0*/, "");
		output += " at " + sky[2] + "00";
	    }
	    if( sky[3] != "" )
		output += skytype[sky[3]];
	    output += ", ";
	}
	else
	    return;
    }
}

function translate_tempdew()
{
    var temp = buffer.match(/^(M|)(\d+)\/(M|)(\d+)/);
    if( temp == null )
	output += "temperature missing, ";
    else {
	temp[2] *= 1;
	temp[4] *= 1;
	if( temp[1] == "M" ) temp[2] = -temp[2];
	if( temp[3] == "M" ) temp[4] = -temp[4];
	output += "temperature " + temp[2] +
	    ", dewpoint " + temp[4] + ", ";
    }
}

function translate_altimeter()
{
    var alt = buffer.match(/^(A|Q)(\d+)/);
    if( alt == null )
	output += "altimeter missing, ";
    else if( alt[1] == 'A' )
	output += "altimeter " + alt[2]/100. + " inches, ";
    else
	output += "altimeter " + alt[2] + " mb, ";
}


// TAF forecasts often contain cruft that''s not explained in the
// government handbook.  Just dump it out untranslated until we
// encounter the end of a report or the start of another forecast line.
function translate_noise()
{
    var cruft;
    while( !buffer.end() && !buffer.token.match(/^(FM|BECMG|TEMPO|PROB)/) ) {
	translate_remark()
//	cruft = buffer.match(/^\S+/);
//	if( abbreviations[cruft[0]] != null )
//	    output += abbreviations[cruft[0]] + " ";
//	else {
//	    output += cruft[0] + " ";
//	}
    }
    output += ", ";
}


function translate_forecasts()
{
    var i;
    for(i=0; i<100 && translate_forecast(); ++i);
}


function translate_forecast()
{
    if( !translate_from() )
	return false

    translate_wind()
    translate_visibility(1)
    translate_rvr()
    translate_weather()
    translate_sky()
    translate_noise()
    output = output.replace(/[,\s]+$/, ".\n")
    return true
}


/**
 * Translate the timestamp part of a line from a TAF forecast.  There
 * are many forms this can take:  "FMhhmm", "FMddhhmm", "TEMPO ddhh/ddhh",
 * "BECMG ddhh/ddhh", "TEMPO hhhh", "BECMG hhhh", or "PROBpp hhhh".
 */
function translate_from()
{
    var from

    if( (from = buffer.match(/^FM(\d{4})\b/)) != null ) {
	output += "   From " + from[1] + "Z "
	return true
    }
    if( (from = buffer.match(/^FM(\d{2})(\d{4})\b/)) != null ) {
	var date = from[1]*1
	var sfx = date_sfx(date)
	output += "   From " + date + sfx + " @ " + from[2] + "Z "
	return true
    }
    from = buffer.match(/^(BECMG|TEMPO) (\d\d)(\d\d)\/(\d\d)(\d\d)\b/)
    if( from != null ) {
	var date1 = from[2]*1
	var date2 = from[4]*1
	output += "   " + abbreviations[from[1]] + " from "
	if( date1 == date2 )
	    output += from[3] + "00Z to " + from[5] + "00Z: "
	else {
	    sfx1 = date_sfx(date1)
	    sfx2 = date_sfx(date2)
	    output += date1 + sfx1 + " @ " + from[3] + "00Z to " +
		      date2 + sfx2 + " @ " + from[5] + "00Z: "
	}
	return true
    }
    if( (from = buffer.match(/^(BECMG|TEMPO) (\d\d)(\d\d)\b/)) != null ) {
	output += "   " + abbreviations[from[1]] + " from " +
			from[2] + "00Z to " + from[3] + "00Z: "
	return true
    }
    if( (from = buffer.match(/^PROB(\d+) (\d\d)(\d\d)\b/)) != null ) {
	output += "   probability " + from[1] + "% from " +
			from[2] + "00Z to " + from[3] + "00Z: "
	return true
    }
    else
	return false
}


// This is the giant catch-all.  Look for certain standard remarks
// and then look for generic translations.  This is an array of
// arrays of patterns.  Each pattern array contains a regular
// expression to match the string, a function to call if there''s
// a match, and an optional argument to that function.

var remarktab = [

    [/^QNH(\d{4})(\w*)/, pressure],
    [/^PK WND (\d{3})(\d+)\/(\d+)/, peakWind],
    [/^WSHFT (\d+)/, oneArg, "wind shift at"],
    [/^TWR VIS (\d+ [\d\/]+|[\d\/]+)/, oneArg, "tower visibility"],
    [/^SFC VIS (\d+ [\d\/]+|[\d\/]+)/, oneArg, "surface visibility"],
    [/^VIS (\d+ [\d\/]+|[\d\/]+)V(\d+ [\d\/]+|[\d\/]+)/,
    						variable, "visibility"],
    [/^VIS (\d+ [\d\/]+|[\d\/]+)/, oneArg, "visibility"],
    [/^VIS (NE|NW|SE|SW|N|S|E|W) ([\d \/]+)/, sectorVis],
    [/^TSB (\d+)E(\d+)/, tsBE],
    [/^TS (NE|NW|SE|SW|N|S|E|W)\b/, tsLoc],
    [/^GR (\d+ [\d\/]+|[\d\/]+)/, oneArg, "hailstone diameter"],
//    [/^VIRGA (NE|NW|SE|SW|N|S|E|W)\b/, oneArg, "virga"],
    [/^CIG (\d+)V(\d+)/, variable, "ceiling"],
    [/^TCU (NE|NW|SE|SW|N|S|E|W)\b/, oneArg, "towering cumulus"],
    [/^ACC (NE|NW|SE|SW|N|S|E|W)\b/, oneArg, "altocumulus castellanus"],
    [/^CIG ?(\d+) (\w+)/, cigLoc],
    [/^SLP(\d+)/, slpMb],
    [/^SNINCR (\d+)\/(\d+)/, snincr],
    [/^PCPN (\d+)/, pcpn],
    [/^P(\d+)/, pcpn],	//		1-hour precip, water equivalent, .01"
    [/^6(\d+)/, p6],	//		1-hour precip, water equivalent, .01"
    [/^7(\d+)/, p7],	//		24-hour precip in .01 inches
    [/^4\/(\d+)/, snowDepth, "snow"],
    [/^933(\d+)/, snowDepth, "new snow water equivalent"],
    [/^8\/([\d\/]+)/, cloudType],
    [/^98(\d+)/, sunshine],
    [/^(\d\d)(\d\d\d\d)/, date_time],
    [/^T(\d)(\d{3})(\d)(\d{3})/, tempDew],
    [/^1(\d)(\d{3})/, maxTemp],
    [/^2(\d)(\d{3})/, minTemp],
    [/^4(\d)(\d{3})(\d)(\d{3})/, minMaxTemps],
    [/^5(\d)(\d{3})/, presTendancy],
    [/^OBS TAKEN \+(\d+)/, obsTaken],
    [/^WEA:/, 0],	//		additional present weather info
    [/^CITY (M|)(\d+)/, cityTemp],
    [/^SNOINCR (\d+)/, snoincr],
    [/^MOV (\w+)/, oneArg, "moving to"],
    [/^(FEW|SCT|BKN|OVC)(\d+) V (FEW|SCT|BKN|OVC)/, varClouds],
    [/^(BC|BL|DR|FZ|MI|PR|SH|TS|RA|DZ|GR|GS|IC|PE|SG|SN|UP)+(B)(\d+)/, wxBegan],
    [/^(BC|BL|DR|FZ|MI|PR|SH|TS|RA|DZ|GR|GS|IC|PE|SG|SN|UP)+(E)(\d+)/, wxEnded],
//    [/^cloud dir]		standing lenticular, rotor clouds
//    [/^[freq] LTG[ltype] loc]	lightning, e.g. "OCNL LTGICCG DSNT W"
//    [/^[dd]ppB[hh]mmE[hh]mm]	precip begin and end, "RAB05E30SNB20E55"
//    [/^pp ccchhh]		obscuration, e.g. "FG SCT000", "FU BKN020"

];


// This is a dictionary of general abbreviation.

// TODO: this needs some biasing, e.g. "ptn" sometimes means "portion"
// and sometimes means "procedure turn"

var abbreviations = {
    "=":"",
    "\.":"\n",
    "+FC":"tornado/water spout",
    "A":"absolute",
    "AO1":"automated report w/o precipitation discriminator,",
    "AO2":"automated report w/precipitation discriminator,",
    "AAWF":"auxiliary aviation weather facility",
    "ABN":"airport beacon",
    "ABV":"above",
    "AC":"altocumulus",
    "ACC":"altocumulus castellanus",
    "ACC":"area control center",
    "ACCUM":"accumulate",
    "ACFT":"aircraft",
    "ACR":"air carrier",
    "ACSL":"standing lenticular altocumulus",
    "ACT":"active",
    "ACYC":"anticyclonic",
    "ADJ":"adjacent",
    "ADRNDCK":"adirondack",
    "ADV":"advise",
    "ADVCTN":"advection",
    "ADVY":"advisory",
    "ADZD":"advised",
    "AFC":"area forecast center",
    "AFD":"airport facility directory",
    "AFDK":"after dark",
    "AFSS":"automated flight service station",
    "AGL":"above ground level",
    "ALF":"aloft",
    "ALGHNY":"allegheny",
    "ALQDS":"all quadrants",
    "ALS":"approach light system",
    "ALSEC":"all sectors",
    "ALSTG":"altimeter setting",
    "ALT":"altitude",
    "ALTA":"alberta",
    "ALTM":"altimeter",
    "ALTN":"alternate",
    "ALTNLY":"alternately",
    "ALUTN":"aleutian",
    "ALWF":"actual wind factor",
    "AM":"ante meridiem",
    "AMD":"amended forecast",
    "AMDT":"amendment",
    "AMGR":"airport manager",
    "AMOS":"automatic meteorological observing system",
    "AMPLTD":"amplitude",
    "AMS":"air mass",
    "AMS":"american meteorological society",
    "ANLYS":"analysis",
    "AP LGT":"airport lights",
    "AP":"airport",
    "APCH":"approach",
    "APLCN":"appalachian",
    "APP":"approach control",
    "ARFF":"aircraft rescue & fire fighting",
    "ARR":"arrive, arrival",
    "AS":"altostratus",
    "ASOS":"automated surface observing system",
    "ASPH":"asphalt",
    "ATC":"air traffic control",
    "ATCSCC":"air traffic control system command center",
    "ATIS":"automatic terminal information service",
    "ATLC":"atlantic",
    "AURBO":"aurora borealis",
    "AUTH":"authority",
    "AUTOB":"automatic weather reporting system",
    "AVBL":"available",
    "AWOS":"automatic weather observing/reporting system",
    "AWP":"aviation weather processors",
    "AWY":"airway",
    "AZM":"azimuth",
    "B":"beginning of precipitation",
    "BA FAIR":"braking action fair",
    "BA NIL":"braking action nil",
    "BA POOR":"braking action poor",
    "BACLIN":"baroclinic or baroclinic prognosis",
    "BATROP":"barotropic or barotropic prognosis",
    "BC":"patches",
    "BCFG":"patchy fog",
    "BCH":"beach",
    "BCKG":"backing",
    "BCN":"beacon",
    "BDA":"bermuda",
    "BECMG":"becoming",
    "BERM":"snowbank/s containing earth/gravel",
    "BFDK":"before dark",
    "BINOVC":"breaks in overcast",
    "BKN":"broken",
    "BL":"between layers",
    "BL":"blowing",
    "BLD":"build",
    "BLDUP":"buildup",
    "BLKHLS":"black hills",
    "BLKT":"blanket",
    "BLW":"below",
    "BLZD":"blizzard",
    "BMS":"basic meteorological services",
    "BND":"bound",
    "BNDRY":"boundary",
    "BOVC":"base of overcast",
    "BR":"mist",
    "BRF":"brief",
    "BRG":"bearing",
    "BRKHIC":"breaks in higher overcast",
    "BRKSHR":"berkshire",
    "BRM":"barometer",
    "BTWN":"between",
    "BYD":"beyond",
    "C":"central standard time",
    "CAAS":"class a airspace",
    "CAN":"canada",
    "CARIB":"caribbean",
    "CASCDS":"cascades",
    "CAT":"category",
    "CAVOK":"cloud and visibility ok",
    "CAVU":"clear or scattered clouds and visibility greater than ten miles",
    "CAWS":"common aviation weather sub-system",
    "CB":"cumulonimbus",
    "CBAS":"class b airspace",
    "CBMAM":"cumulonimbus mammatus",
    "CBSA":"class b surface area",
    "CC":"cirrocumulus",
    "CCAS":"class c airspace",
    "CCLKWS":"counterclockwise",
    "CCSA":"class c surface area",
    "CCSL":"standing lenticular cirrocumulus",
    "CD":"clearance delivery",
    "CDAS":"class d airspace",
    "CDFNT":"cold front",
    "CDSA":"class d surface area",
    "CEAS":"class e airspace",
    "CESA":"class e surface area",
    "CFP":"cold front passage",
    "CFR":"code of federal regulations",
    "CGAS":"class g airspace",
    "CHARC":"characteristic",
    "CHG":"change",
    "CHSPK":"chesapeake",
    "CI":"cirrus",
    "CIG":"ceiling",
    "CK":"check",
    "CL":"center line",
    "CLD":"cloud",
    "CLDS":"clouds",
    "CLKWS":"clockwise",
    "CLR":"clear at or below 12,000 feet",
    "CLR":"clear",
    "CLR":"clearance, clear(s), cleared to",
    "CLRS":"clear and smooth",
    "CLSD":"closed",
    "CMB":"climb",
    "CMSND":"commissioned",
    "CNCL":"cancel",
    "CNDN":"canadian",
    "CNL":"cancel",
    "CNVTV":"convective",
    "COM":"communications",
    "CONC":"concrete",
    "COND":"condition",
    "CONDS":"conditions",
    "CONFDC":"confidence",
    "CONTDVD":"continental divide",
    "CONTRAILS":"condensation trails",
    "COR":"correction",
    "CPD":"coupled",
    "CRS":"course",
    "CS":"cirrostratus",
    "CST":"coast",
    "CSTL":"coastal",
    "CTC":"contact",
    "CTGY":"category",
    "CTL":"control",
    "CTSKLS":"catskills",
    "CU":"cumulus",
    "CUFRA":"cumulus fractus",
    "CYC":"cyclonic",
    "CYCLGN":"cyclogenesis",
    "DABRK":"daybreak",
    "DALGT":"daylight",
    "DCAVU":"clear or scattered clouds and visibility greater than ten",
    "DCMSND":"decommissioned",
    "DCT":"direct",
    "DEGS":"degrees",
    "DEP":"depart/departure",
    "DEPPROC":"departure procedures",
    "DH":"decision height",
    "DISABLD":"disabled",
    "DIST":"distance",
    "DKTS":"dakotas",
    "DLA":"delay or delayed",
    "DLT":"delete",
    "DLY":"daily",
    "DME":"distance measuring equipment",
    "DMSH":"diminish",
    "DMSTN":"demonstration",
    "DNS":"dense",
    "DNSLP":"downslope",
    "DNSTRM":"downstream",
    "DP":"deep",
    "DP":"dew point temperature",
    "DPNG":"deepening",
    "DPTH":"depth",
    "DR":"low drifting",
    "DRFT":"drift",
    "DRFT":"snowbank/s caused by wind action",
    "DS":"dust storm",
    "DSIPT":"dissipate",
    "DSPLCD":"displaced",
    "DTLN":"international dateline",
    "DTRT":"deteriorate",
    "DU":"widespread dust",
    "DVV":"downward vertical velocity",
    "DWNDFTS":"downdrafts",
    "DWPNT":"dew point",
    "DZ":"drizzle",
    "E":"east",
    "EB":"eastbound",
    "EFAS":"en route flight advisory service",
    "ELEV":"elevation",
    "ELNGT":"elongate",
    "EMBDD":"embedded",
    "EMSU":"environment meteorological support unit",
    "ENERN":"east-northeastern",
    "ENEWD":"east-northeastward",
    "ENG":"engine",
    "ENRT":"en route",
    "ENTR":"entire",
    "EOF":"expected operations forecast",
    "ESERN":"east-southeastern",
    "ESEWD":"east-southeastward",
    "EXC":"except",
    "EXTRAP":"extrapolate",
    "EXTRM":"extreme",
    "FA":"area forecast",
    "FAC":"facility or facilities",
    "FAF":"final approach fix",
    "FAH":"fahrenheit",
    "FAN MKR":"fan marker",
    "FC":"funnel cloud",
    "FDC":"flight data center",
    "FEW":"few clouds",
    "FG":"fog",
    "FI/P":"flight inspection permanent",
    "FI/T":"flight inspection temporary",
    "FIBI":"filed but impractical to transmit",
    "FILG":"filling",
    "FINO":"weather report will not be filed for transmission",
    "FL":"flash advisory",
    "FLDST":"flood stage",
    "FLG":"falling",
    "FLRY":"flurry",
    "FLWIS":"flood warning issued",
    "FM":"from",
    "FNA":"final approach",
    "FNT":"front",
    "FNTGNS":"frontogenesis",
    "FNTLYS":"frontolysis",
    "FORNN":"forenoon",
    "FPM":"feet per minute",
    "FRQ":"frequent",
    "FREQ":"frequency",
    "FRH":"fly runway heading",
    "FRI":"friday",
    "FRMG":"forming",
    "FROPA":"frontal passage",
    "FROSFC":"frontal surface",
    "FRST":"frost",
    "FRWF":"forecast wind factor",
    "FRZ":"freeze",
    "FRZLVL":"freezing level",
    "FRZN":"frozen",
    "FSS":"automated/flight service station",
    "FT":"foot, feet",
    "FT":"terminal forecast",
    "FU":"smoke",
    "FULYR":"smoke layer aloft",
    "FUOCTY":"smoke over city",
    "FWC":"fleet weather central",
    "FZ":"supercooled/freezing",
    "G":"gusts to",
    "GC":"ground control",
    "GCA":"ground control approach",
    "GLFALSK":"gulf of alaska",
    "GLFCAL":"gulf of california",
    "GLFMEX":"gulf of mexico",
    "GLFSTLAWR":"gulf of st. lawrence",
    "GOVT":"government",
    "GP":"glide path",
    "GPS":"global positioning system",
    "GR":"hail",
    "GRAD":"gradient",
    "GRBNKS":"grand banks",
    "GRDL":"gradual",
    "GRTLKS":"great lakes",
    "GRVL":"gravel",
    "GS":"small hail/snow pellets",
    "GSTS":"gusts",
    "GSTY":"gusty",
    "GTR":"greater",
    "HAA":"height above airport",
    "HAT":"height above touchdown",
    "HCVIS":"high clouds visible",
    "HDFRZ":"hard freeze",
    "HDG":"heading",
    "HDSVLY":"hudson valley",
    "HEL":"helicopter",
    "HELI":"heliport",
    "HGT":"height",
    "HGTS":"heights",
    "HI":"hi",
    "HIEAT":"highest temperature equaled for all time",
    "HIEFM":"highest temperature equaled for the month",
    "HIESE":"highest temperature equaled so early",
    "HIESL":"highest temperature equaled so late",
    "HIFOR":"high level forecast",
    "HIRL":"high intensity runway lights",
    "HITMP":"highest temperature",
    "HIWAS":"hazardous inflight weather advisory service",
    "HIXAT":"highest temperature exceeded for all time",
    "HIXFM":"highest temperature exceeded for the month",
    "HIXSE":"highest temperature exceeded so early",
    "HIXSL":"highest temperature exceeded so late",
    "HLDG":"holding",
    "HLSTO":"hailstones",
    "HLTP":"hilltop",
    "HLYR":"haze layer aloft",
    "HOL":"holiday",
    "HP":"holding pattern",
    "HR":"hour",
    "HURCN":"hurricane",
    "HUREP":"hurricane report",
    "HX":"high index",
    "HZ":"haze",
    "IAF":"initial approach fix",
    "IAP":"instrument approach procedure",
    "IC":"ice crystals",
    "ICG":"icing",
    "ICGIC":"icing in clouds",
    "ICGICIP":"icing in clouds and precipitation",
    "ICGIP":"icing in precipitation",
    "ID":"identification",
    "IDENT":"identify/identifier/identification",
    "IF":"intermediate fix",
    "ILS":"instrument landing system",
    "IM":"inner marker",
    "IMC":"instrument meteorological conditions",
    "IMDT":"immediate",
    "IN":"inch/inches",
    "INBD":"inbound",
    "INDEFLY":"indefinitely",
    "INFO":"information",
    "INLD":"inland",
    "INOP":"inoperative",
    "INSTBY":"instability",
    "INSTR":"instrument",
    "INT":"intersection",
    "INTL":"international",
    "INTR":"interior",
    "INTRMTRGN":"inter-mountain region",
    "INTS":"intense",
    "INTSFY":"intensify",
    "INTST":"intensity",
    "INVRN":"inversion",
    "IOVC":"in overcast",
    "IR":"ice on runway",
    "IR":"ice on runway/s",
    "JTSTR":"jet stream",
    "K":"cold",
    "KFRST":"killing frost",
    "KT":"knots",
    "L":"left",
    "LAA":"local airport advisory",
    "LABRDR":"labrador",
    "LAT":"latitude",
    "LAWRS":"limited aviation weather reporting station",
    "LB":"pound/pounds",
    "LC":"local control",
    "LCTD":"located",
    "LCTMP":"little change in temperature",
    "LDA":"localizer type directional aid",
    "LDG":"landing",
    "LFT":"lift",
    "LGRNG":"long range",
    "LGT":"light or lighting",
    "LGTD":"lighted",
    "LIFR":"low ifr",
    "LIRL":"low intensity runway lights",
    "LK":"lake",
    "LLWS":"low level wind shear",
    "LLWAS":"low level wind shear alert system",
    "LLZ":"localizer",
    "LM":"compass locator at ils middle marker",
    "LO":"compass locator at ils outer marker",
    "LOC":"local/locally/location",
    "LOEAT":"lowest temperature equaled for all time",
    "LOEFM":"lowest temperature equaled for the month",
    "LOESE":"lowest temperature equaled so early",
    "LOESL":"lowest temperature equaled so late",
    "LONG":"longitude",
    "LOTMP":"lowest temperature",
    "LOXAT":"lowest temperature exceeded for all time",
    "LOXFM":"lowest temperature exceeded for the month",
    "LOXSE":"lowest temperature exceeded so early",
    "LOXSL":"lowest temperature exceeded so late",
    "LRN":"loran",
    "LSR":"loose snow on runway",
    "LSR":"loose snow on runway/s",
    "LT":"left turn",
    "LTGCC":"lightning cloud-to-cloud",
    "LTGCCCG":"lightning cloud-to-cloud, cloud-to-ground",
    "LTGCG":"lightning cloud-to-ground",
    "LTGCW":"lightning cloud-to-water",
    "LTGIC":"lightning in clouds",
    "LTLCG":"little change",
    "LTG":"lightning",
    "LTNG":"lightning",
    "LX":"low index",
    "LYR":"layer",
    "M":"missing/minus/less than",
    "MA":"map analysis",
    "MAG":"magnetic",
    "MAINT":"maintain, maintenance",
    "MALS":"medium intensity approach light system",
    "MALSF":"medium intensity approach light system with sequenced flashers",
    "MALSR":"medium intensity approach light system",
    "MAN":"manitoba",
    "MAPT":"missed approach point",
    "MCA":"minimum crossing altitude",
    "MDA":"minimum descent altitude",
    "MEA":"minimum en route altitude",
    "MED":"medium",
    "MEGG":"merging",
    "MEX":"mexico",
    "MHKVLY":"mohawk valley",
    "MI":"shallow",
    "MIDN":"midnight",
    "MIFG":"patches of shallow fog not deeper than two meters",
    "MIN":"minute",
    "MIRL":"medium intensity runway lights",
    "MLS":"microwave landing system",
    "MLTLVL":"melting level",
    "MM":"middle marker",
    "MMO":"main meteorological office",
    "MNLD":"mainland",
    "MNM":"minimum",
    "MNT":"monitor/monitoring/monitored",
    "MOC":"minimum obstruction clearance",
    "MOGR":"moderate or greater",
    "MON":"monday",
    "MONTR":"monitor",
    "MOV":"move",
    "MRA":"minimum reception altitude",
    "MRGL":"marginal",
    "MRNG":"morning",
    "MRTM":"maritime",
    "MS":"minus",
    "MSA":"minimum safe altitude/minimum sector altitude",
    "MSAW":"minimum safe altitude warning",
    "MSG":"message",
    "MSL":"mean sea level",
    "MSTLY":"mostly",
    "MSTR":"moisture",
    "MTN":"mountain",
    "MU":"mu meters",
    "MUD":"mud",
    "MUNI":"municipal",
    "MVFR":"marginal vfr",
    "MXD":"mixed",
    "NA":"not authorized",
    "NAV":"navigation",
    "NB":"new brunswick",
    "NB":"northbound",
    "NCWX":"no change in weather",
    "NDB":"nondirectional radio beacon",
    "NE":"northeast",
    "NELY":"northeasterly",
    "NERN":"northeastern",
    "NEW ENG":"new england",
    "NFLD":"newfoundland",
    "NGT":"night",
    "NL":"no layers",
    "NM":"nautical mile(s)",
    "NMBR":"number",
    "NMR":"nautical mile radius",
    "NNERN":"north-northeastern",
    "NNEWD":"north-northeastward",
    "NNWRN":"north-northwestern",
    "NNWWD":"northwestward",
    "NO":"not available",
    "NONSTD":"nonstandard",
    "NOPT":"no procedure turn required",
    "NORPI":"no pilot balloon observation will be filed next collection unless weather changes significantly",
    "NOSPECI":"no special reports given at this station",
    "NPRS":"nonpersistent",
    "NR":"number",
    "NS":"nimbostratus",
    "NS":"nova scotia",
    "NSCSWD":"no small craft or storm warning are being displayed",
    "NSW":"no significant weather",
    "NTAP":"notice to airmen publication",
    "NVA":"negative vorticity advection",
    "NW":"northwest",
    "NWLY":"northwesterly",
    "NWRN":"northwestern",
    "N":"north",
    "OBS":"observation",
    "OBSC":"obscure",
    "OBSC":"obscured",
    "OBSCN":"obscuration",
    "OBST":"obstruction",
    "OCFNT":"occluded front",
    "OCLD":"occlude",
    "OCLN":"occlusion",
    "OCNL":"occasional",
    "OFP":"occluded frontal passage",
    "OFSHR":"offshore",
    "OM":"outer marker",
    "OMTNS":"over mountains",
    "ONSHR":"on shore",
    "ONT":"ontario",
    "OPR":"operate",
    "OPS":"operation",
    "ORGPHC":"orographic",
    "ORIG":"original",
    "OSV":"ocean station vessel",
    "OTAS":"on top and smooth",
    "OTLK":"outlook",
    "OTS":"out of service",
    "OVC":"overcast",
    "OVR":"over",
    "P":"polar",
    "P6SM":"visibility greater than 6 sm",
    "PAC":"pacific",
    "PAEW":"personnel and equipment working",
    "PAPI":"precision approach path indicator",
    "PAR":"precision approach radar",
    "PARL":"parallel",
    "PAT":"pattern",
    "PAX":"passenger",
    "PBL":"probable",
    "PCL":"pilot controlled lighting",
    "PCPN":"precipitation",
    "PDMT":"predominant",
    "PDMT":"predominate",
    "PDW":"priority delayed weather",
    "PEN":"peninsula",
    "PERM":"permanent/permanently",
    "PGTSND":"puget sound",
    "PIBAL":"pilot balloon observation",
    "PISE":"no pilot balloon observation due to unfavorable sea conditions",
    "PISO":"no pilot balloon observation due to snow",
    "PIWI":"no pilot balloon observation due to high, or gusty, surface wind",
    "PJE":"parachute jumping exercise",
    "PK WND":"peak wind",
    "PL":"ice pellets",
    "PLA":"practice low approach",
    "PLW":"plow",
    "PLW":"plow/plowed",
    "PN":"prior notice required",
    "PNHDL":"panhandle",
    "PO":"dust/sand whirls",
    "PPINA":"radar weather report not available",
    "PPINE":"radar weather report no echoes observed",
    "PPINO":"radar weather report equipment inoperative due to breakdown",
    "PPIOK":"radar weather report equipment operation resumed",
    "PPIOM":"radar weather report equipment inoperative due to maintenance",
    "PPR":"prior permission required",
    "PR":"partial",
    "PRBLTY":"probability",
    "PRESFR":"pressure falling rapidly",
    "PRESRR":"pressure rising rapidly",
    "PREV":"previous",
    "PRJMP":"pressure jump",
    "PRN":"psuedo random noise",
    "PROB40":"probability 40 percent",
    "PROC":"procedure",
    "PROG":"prognosis or prognostic",
    "PROP":"propeller",
    "PRSNT":"present",
    "PS":"plus",
    "PSG":"passage",
    "PSG":"passing",
    "PSR":"packed snow on runway/s",
    "PTCHY":"patchy",
    "PTLY":"partly",
    "PTN":"procedure turn",
    "PTN":"portion",
    "PVA":"positive vorticity advection",
    "PVT":"private",
    "PY":"spray",
    "QSTNRY":"quasi-stationary",
    "QUE":"quebec",
    "R":"runway",
    "RA":"rain",
    "RABA":"no rawin obs., no balloons available",
    "RABAL":"radiosonde balloon wind data",
    "RABAR":"radiosonde balloon release",
    "RACO":"no rawin obs., communications out",
    "RADAT":"radiosonde observation data",
    "RADNO":"report missing account radio failure",
    "RAFI":"radiosonde observation not filed",
    "RAFRZ":"radiosonde observation freezing levels",
    "RAHE":"no rawin obs., no gas available",
    "RAICG":"radiosonde observation icing at",
    "RAIL":"runway alignment indicator lights",
    "RAMOS":"remote automatic meteorological observing system",
    "RAOB":"radiosonde observation",
    "RAREP":"radar weather report",
    "RAVU":"radiosonde analysis and verification unit",
    "RAWE":"no rawin obs., unfavorable weather",
    "RAWI":"no rawin obs., high and gusty winds",
    "RAWIN":"upper winds obs.",
    "RCAG":"remote communication air/ground facility",
    "RCD":"radar cloud detection report",
    "RCDNA":"radar cloud detection report not available",
    "RCDNE":"radar cloud detection report no echoes observed",
    "RCDNO":"radar cloud detector inoperative due to breakdown until",
    "RCDOM":"radar cloud detector inoperative due to maintenance until",
    "RCKY":"rockies",
    "RCL":"runway centerline",
    "RCLL":"runway centerline light system",
    "RCO":"remote communication outlet",
    "RDG":"ridge",
    "RDWND":"radar dome wind",
    "REC":"receive/receiver",
    "REIL":"runway end identifier lights",
    "RELCTD":"relocated",
    "REP":"report",
    "RESTR":"restrict",
    "RGD":"ragged",
    "RH":"relative humidity",
    "RHINO":"radar echo height information not available",
    "RHINO":"radar range height indicator not operating on scan",
    "RIOGD":"rio grande",
    "RLLS":"runway lead-in lights system",
    "RMK":"remark(s)",
    "RMK":"remarks:",
    "RMNDR":"remainder",
    "RNAV":"area navigation",
    "RNFL":"rainfall",
    "ROBEPS":"radar operating below prescribed standard",
    "RPD":"rapid",
    "RPLC":"replace",
    "RQRD":"required",
    "RRL":"runway remaining lights",
    "RSG":"rising",
    "RSR":"en route surveillance radar",
    "RSVN":"reservation",
    "RT":"right turn",
    "RTE":"route",
    "RTR":"remote transmitter/receiver",
    "RTS":"return to service",
    "RUF":"rough",
    "RVR":"runway visual range",
    "RVRM":"runway visual range midpoint",
    "RVRR":"runway visual range rollout",
    "RVRT":"runway visual range touchdown",
    "RWY":"runway",
    "RY/RWY":"runway",
    "S":"south",
    "SA":"sand",
    "SASK":"saskatchewan",
    "SAT":"saturday",
    "SAWR":"supplementary aviation weather reporting station",
    "SB":"southbound",
    "SBSD":"subside",
    "SC":"stratocumulus",
    "SCSL":"standing lenticular stratocumulus",
    "SCT":"scattered",
    "SDF":"simplified directional facility",
    "SE":"southeast",
    "SELS":"severe local storms",
    "SELY":"southeasterly",
    "SERN":"southeastern",
    "SEV":"severe",
    "SFERICS":"atmospherics",
    "SFL":"sequence flashing lights",
    "SG":"snow grains",
    "SGD":"solar-geophysical data",
    "SH":"showers",
    "SHFT":"shift",
    "SHLW":"shallow",
    "SHRTLY":"shortly",
    "SHWR":"shower",
    "SID":"standard instrument departure",
    "SIERNEV":"sierra nevada",
    "SIMUL":"simultaneous",
    "SIR":"packed or compacted snow and ice on runway/s",
    "SIR":"snow and ice on runway",
    "SKC":"sky clear",
    "SKED":"scheduled",
    "SLD":"solid",
    "SLP":"sea level pressure",
    "SLR":"slush on runway",
    "SLR":"slush on runway/s",
    "SLT":"sleet",
    "SM":"statute mile(s)",
    "SM":"statute miles",
    "SMK":"smoke",
    "SMTH":"smooth",
    "SN":"snow",
    "SNBNK":"snowbank",
    "SNBNK":"snowbank/s caused by plowing",
    "SNFLK":"snowflake",
    "SNGL":"single",
    "SNOINCR":"snow depth increase in past hour",
    "SNW":"snow",
    "SNWFL":"snowfall",
    "SP":"station pressure",
    "SPD":"speed",
    "SPECI":"special report",
    "SPKL":"sprinkle",
    "SPLNS":"south plains",
    "SPRD":"spread",
    "SQ":"squall",
    "SQAL":"squall",
    "SQLN":"squall line",
    "SS":"sandstorm",
    "SSALF":"simplified short approach lighting system with sequenced flashers",
    "SSALR":"simplified short approach lighting system with runway alignment indicator lights",
    "SSALS":"simplified short approach lighting system",
    "SSERN":"south-southeastern",
    "SSEWD":"south-southeastward",
    "SSR":"secondary surveillance radar",
    "SSWRN":"south-southwestern",
    "SSWWD":"south-southwestward",
    "ST":"stratus",
    "STA":"straight-in approach",
    "STAGN":"stagnation",
    "STAR":"standard terminal arrival",
    "STFR":"stratus fractus",
    "STFRM":"stratiform",
    "STG":"strong",
    "STM":"storm",
    "STNRY":"stationary",
    "SUN":"sunday",
    "SVC":"service",
    "SW":"southwest",
    "SWEPT":"swept or broom/broomed",
    "SWLG":"swelling",
    "SWLY":"southwesterly",
    "SWRN":"southwestern",
    "SX":"stability index",
    "SXN":"section",
    "SYNOP":"synoptic",
    "SYNS":"synopsis",
    "T":"temperature",
    "T":"trace",
    "T":"tropical",
    "TAA":"terminal arrival area",
    "TACAN":"tactical air navigational aid",
    "TAR":"terminal area surveillance radar",
    "TCU":"towering cumulus",
    "TDZ LG":"touchdown zone lights",
    "TDZ":"touchdown zone",
    "TEMPO":"temporary",
    "TFC":"traffic",
    "TFR":"temporary flight restriction",
    "TGL":"touch and go landings",
    "THD":"thunderhead",
    "THDR":"thunder",
    "THK":"thick",
    "THN":"thin",
    "THR":"threshold",
    "THRU":"through",
    "THU":"thursday",
    "TIL":"until",
    "TKOF":"takeoff",
    "TM":"traffic management",
    "TMPA":"traffic management program alert",
    "TOP":"cloud top",
    "TOVC":"top of overcast",
    "TPG":"topping",
    "TRIB":"tributary",
    "TRML":"terminal",
    "TRNG":"training",
    "TROF":"trough",
    "TROP":"tropopause",
    "TRPCD":"tropical continental",
    "TRPCL":"tropical",
    "TRPLYR":"trapping layer",
    "TRSN":"transition",
    "TS":"thunderstorm",
    "TSHWR":"thundershower",
    "TSNT":"transient",
    "TSQLS":"thundersqualls",
    "TSTM":"thunderstorm",
    "TUE":"tuesday",
    "TURB":"turbulence",
    "TURBC":"turbulence",
    "TURBT":"turbulent",
    "TWR":"tower",
    "TWRG":"towering",
    "TWY":"taxiway",
    "UAG":"upper atmosphere geophysics",
    "UDDF":"up and down drafts",
    "UFN ":"until further notice",
    "UNAVBL":"unavailable",
    "UNLGTD":"unlighted",
    "UNMKD":"unmarked",
    "UNMNT":"unmonitored",
    "UNREL":"unreliable",
    "UNSBL":"unseasonable",
    "UNSTBL":"unstable",
    "UNSTDY":"unsteady",
    "UNSTL":"unsettle",
    "UNUSBL":"unusable",
    "UP":"unknown precipitation",
    "UPDFTS":"updrafts",
    "UPR":"upper",
    "UPSLP":"upslope",
    "UPSTRM":"upstream",
    "UVV":"upward vertical velocity",
    "UWNDS":"upper winds",
    "V":"varies",
    "VA":"volcanic ash",
    "VASI":"visual approach slope indicator",
    "VC":"vicinity",
    "VDP":"visual descent point",
    "VGSI":"visual glide slope indicator",
    "VIA":"by way of",
    "VICE":"instead/versus",
    "VIRGA":"virga",
    "VIS":"visibility",
    "VLCTY":"velocity",
    "VLNT":"violent",
    "VLY":"valley",
    "VMC":"visual meteorological conditions",
    "VOL":"volume",
    "VOR":"vhf omni-directional radio range",
    "VR":"veer",
    "VRB":"variable wind direction when speed is less than or equal to 6 knots",
    "VRB":"variable",
    "VRISL":"vancouver island, bc",
    "VRT MOTN":"vertical motion",
    "VSBY":"visibility",
    "VSBYDR":"visibility decreasing rapidly",
    "VSBYIR":"visibility increasing rapidly",
    "VV":"vertical visibility",
    "W":"west/warm",
    "WA":"airmet",
    "WB":"westbound",
    "WDC-1":"world data centers in western europe",
    "WDC-2":"world data centers throughout rest of world",
    "WDLY":"widely",
    "WDSPRD":"widespread",
    "WEA":"weather",
    "WED":"wednesday",
    "WEF":"with effect from or effective from",
    "WFP":"warm front passage",
    "WI":"within",
    "WIE ":"with immediate effect or effective immediately",
    "WINT":"winter",
    "WKDAYS":"monday through friday",
    "WKEND":"saturday and sunday",
    "WND":"wind",
    "WNWRN":"west-northwestern",
    "WNWWD":"west-northwestward",
    "WPLTO":"western plateau",
    "WPT":"waypoint",
    "WR":"wet runway",
    "WRM":"warm",
    "WRMFNT":"warm front",
    "WRNG":"warning",
    "WS":"sigmet",
    "WS":"wind shear",
    "WSHFT":"wind shift",
    "WSOM":"weather service operations manual",
    "WSR":"wet snow on runway",
    "WSR":"wet snow on runway/s",
    "WSWRN":"west-southwestern",
    "WSWWD":"west-southwestward",
    "WTR":"water on runway/s",
    "WTR":"water",
    "WTSPT":"waterspout",
    "WV":"wave",
    "WW":"severe weather forecast",
    "WX":"weather",
    "WXCON":"weather reconnaissance flight pilot report",
    "XCP":"except",
    "XPC":"expect",
    "Y":"yukon standard time",
    "YKN":"yukon",
    "YLSTN":"yellowstone",
    "ZI":"zonal index",
    "ZI":"zone of interior",
};

function translate_remarks()
{
    var i, j;
    var tokens;
    for(j=0; j<400 && buffer.token != null && !buffer.end(); ++j) {
	translate_remark()
    }
}

/**
 * General translation function.  Read one token from the buffer, see
 * if it''s in the remark table or the abbreviation dictionary.  If
 * not found in either, just write it out to output.
 */
function translate_remark()
{
    var i, j;
    var found;
    var tokens;

    found = false;

    // First, look for a pattern in remarktab, call the special
    // handler.
    for( var i = 0; i < remarktab.length; ++i) {
	if( (tokens = buffer.match(remarktab[i][0])) != null ) {
	    found = true;
	    if( remarktab[i][1] != 0 )
		remarktab[i][1](tokens, remarktab[i][2]);
	    else
		output += "remarktab["+i+"] <" + tokens[0] + ">";
	    output += ", ";
	    break;
	}
    }

    // If not found, look for an alphanumaric token.  If not found,
    // look for a non-alphanumeric token.  Whatever turns up, see if
    // it''s in the abbreviation list.
    if( !found ) {
	var tok = buffer.match(/^[+\w]+/);
	if( tok == null )
	    tok = buffer.match(/[^\w\s]+/);
	if( abbreviations[tok[0]] != null )
	    output += abbreviations[tok] + " ";
	else {
	    output += tok[0].toLowerCase() + " ";
	}
    }

}


/**
 * Special handler for pressure remark.
 */
function pressure(tokens)
{
    output += "pressure "
    if( tokens[2] == "INS" ) {
	output += tokens[1]/100 + '" ';
    }
    else {
	output += tokens[1] + tokens[2] + " ";
    }
}

/**
 * Special handler for peak wind remark.
 */
function peakWind(tokens)
{
    output += "peak wind from " + tokens[1] + " at " + tokens[2] +
	" at " + tokens[3] + "Z";
}

/**
 * Special handler for sector visibility remark.
 */
function sectorVis(tokens)
{
    output += "sector visiblity " + tokens[1] + " " + tokens[2];
}

/**
 * Special handler for general "X variable from Y to Z" remarks.
 */
function variable(tokens, caption)
{
    output += caption + " variable from " + tokens[1] +
	" to " + tokens[2];
}

/**
 * Special handler for "thunderstorm began at" remark.
 */
function tsBE(tokens)
{
    output += "thunderstorm began at " + tokens[1] +
	", ended at " + tokens[2];
}

/**
 * Special handler for "thunderstorms <where> moving to <where>" remark.
 */
function tsLoc(tokens)
{
    output += "thunderstorms " + tokens[1];
    var moving = buffer.match(/MOV ([A-Z]+)/);
    if( moving != null )
	output += " moving to " + moving[1];
}

/**
 * Special handler for "<what> <amount>" remarks.
 */
function oneArg(tokens, caption)
{
    output += caption + " " + tokens[1];
}

function cigLoc(tokens)
{
    output += "ceiling " + tokens[1]*100 + " " + tokens[2];
}

function slpMb(tokens)
{
    var pres = tokens[1] * .1;
    if( pres < 50.0 ) pres += 1000;
    else pres += 900;
    output += "sea level pressure " + pres + " Mb";
}

function snincr(tokens)
{
    output += "snow increasing rapdily: " + tokens[1] +
	" in last hour, " + tokens[2] + " on ground";
}

function pcpn(tokens)
{
    output += "1-hour precip water equivalent " +
	tokens[1]*.01 + " inches";
}

function p6(tokens)
{
    output += "6-hour precip water equivalent " +
	tokens[1]*.01 + " inches";
}

function p7(tokens)
{
    output += "24-hour precip water equivalent " +
	tokens[1]*.01 + " inches";
}

function snowDepth(tokens, caption)
{
    output += caption + " " + tokens[1] + " inches";
}


var cloudTypes = {"0":"none", "/":"obscured", "6":"stratus"};

function cloudType(tokens)
{
    cloudType2("low clouds: ", tokens[1][0]);
    output += ", ";
    cloudType2("middle clouds: ", tokens[1][1]);
    output += ", ";
    cloudType2("high clouds: ", tokens[1][2]);
}

function cloudType2(caption, key)
{
    output += caption;
    if( cloudTypes[key] == null )
	output += key;
    else
	output += cloudTypes[key];
}

function sunshine(tokens)
{
    output += "equivalent sunshine: " + tokens[1] + " minutes";
}

function date_time(tokens)
{
    var date = tokens[1]*1
    output += date + date_sfx(date) + " @ " + tokens[2];
}

function tempDew(tokens)
{
    output += "temp " + signedNum(tokens[1],tokens[2]) +
    	" dewpoint " + signedNum(tokens[3],tokens[4]);
}

function signedNum(sign, num)
{
    if( sign == 1 ) num = -num;
    return num/10.;
}

function maxTemp(tokens)
{
    output += "max 6-hour temp " + signedNum(tokens[1],tokens[2]);
}

function minTemp(tokens)
{
    output += "min 6-hour temp " + signedNum(tokens[1],tokens[2]);
}

function minMaxTemps(tokens)
{
    output += "24-hour temp max " + signedNum(tokens[1],tokens[2]) +
    	" min " + signedNum(tokens[3],tokens[4]);
}


var tendancies = [
    "increasing, then decreasing",
    "increasing, steady, then increasing",
    "increasing steadily or unsteadily",
    "decreasing or steady then increasing OR increasing then increasing more rapidly",
    "steady",
    "decreasing then increasing",
    "decreasing then steady OR decreasing then decreasing more slowly",
    "decreasing steadily or unsteadily",
    "steady or increasing then decreasing OR decreasing then decreasing more rapidly" ];

function presTendancy(tokens)
{
    output += "3-hour pressure tendancy: ";
    if( tokens[1] >= 0 && tokens[1] < tendancies.length )
	output += tendancies[tokens[1]] + " ";
    else
	output += "unknown ";
    output += tokens[2]/10. + " Mb";
}

function obsTaken(tokens)
{
    output += "observation taken +" + tokens[1] + " minutes";
}

function cityTemp(tokens)
{
    temp = tokens[2];
    if( tokens[1] == "M" ) temp = -temp;
    output += "city temp " + temp;
}

function snoincr(tokens)
{
    output += "snow increasing rapidly: " +
	tokens[1] + " in last 1/2 hour";
}

function varClouds(tokens)
{
    output += "clouds at " + tokens[2]*100 + " varying from " +
	coverage[tokens[1]] + " to " + coverage[tokens[3]];
}

var wxdict = {
    "NSW":"no significant weather",
    "BC":"patches", "BL":"blowing", "DR":"drifting",
    "FZ":"freezing", "MI":"shallow", "PR":"partial",
    "SH":"shower", "TS":"thunder storm",
    "RA":"rain", "DZ":"drizzle", "GR":"hail",
    "GS":"small hail/snow pellets", "IC":"ice crystals",
    "PE":"pellet ice", "SG":"snow grains", "SN":"snow",
    "UP":"unknown precipitation",
    "FG":"fog", "BR":"mist", "DU":"widespread dust",
    "FU":"smoke", "HZ":"haze", "PY":"spray",
    "SA":"sand", "VA":"volcanic ash",
    "PO":"dust whirls", "DS":"dust storm", "FC":"funnel cloud",
    "+FC":"tornado/water spout", "SQ":"squalls", "SS":"sand storm",
    "+":"heavy", "-":"light", "VC":"vicinity" };

function wxBegan(tokens)
{
    var ended;
    var i;
    for(i=1; tokens[i] != "B"; ++i)
	output += wxdict[tokens[i]] + " ";
    output += "began at " + tokens[i+1];
    if( (ended = buffer.match(/^E(\d+)\b/)) != null )
	output += " and ended at " + ended[1];
}

function wxEnded(tokens)
{
    var began;
    for(i=1; tokens[i] != "E"; ++i)
	output += wxdict[tokens[i]] + " ";
    output += "ended at " + tokens[i+1];
    if( (began = buffer.match(/^B(\d+)\b/)) != null )
	output += " and began at " + began[1];
}

/**
 * This class is the core of the input parser.  The entire input string
 * is copied into the SourceBuffer object when it''s created.  Then the
 * tokenized input is accessed via SBAdvance(), SBMatch(), and SBend()
 * methods.
 */
function SourceBuffer(string)
{
    // convert any sequence of 2 or more newlines to ' = '
    string = string.replace(/\n\s*\n/g, " = ");
    // collapse blanks
    string = string.replace(/\s+/g, " ");
    // collapse any combination of blanks and '='
    string = string.replace(/\s*=[=\s]*/g, " = ");
    this.buffer = string;
    this.token = string;
}

SourceBuffer.prototype.advance = SBAdvance;
SourceBuffer.prototype.match = SBMatch;
SourceBuffer.prototype.end = SBend;

/**
 * Advance the input token by the given number of characters and
 * then remove any leading whitespace.
 */
function SBAdvance(amount)
{
    this.token = this.token.substring(amount);
    this.token = this.token.replace(/^ */, "");
}

/**
 * Check to see if this pattern matches the start of the token buffer.
 * If so, return the result and advance the buffer.
 */
function SBMatch(pat)
{
    var result = this.token.match(pat);
    if( result != null )
	this.advance(result[0].length);
    return result;
}

/**
 * Return true if we are at the end of a report.  This means that
 * the token buffer is now empty or it starts with = which is
 * the delimiter that seperates reports.
 */
function SBend()
{
    return this.token == "" || this.match(/^=/) != null;
}
