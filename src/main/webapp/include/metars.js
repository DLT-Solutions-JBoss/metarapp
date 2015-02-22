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
//  6000 BR             6000' mist (TAF only)
//  M1/4 R              less than 1/4 mile rain
//  1 1/2 SN            1 1/2 miles snow
//  P10                 greater than 10 miles
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
//      cruft = buffer.match(/^\S+/);
//      if( abbreviations[cruft[0]] != null )
//          output += abbreviations[cruft[0]] + " ";
//      else {
//          output += cruft[0] + " ";
//      }
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
    [/^P(\d+)/, pcpn],  //              1-hour precip, water equivalent, .01"
    [/^6(\d+)/, p6],    //              1-hour precip, water equivalent, .01"
    [/^7(\d+)/, p7],    //              24-hour precip in .01 inches
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
    [/^WEA:/, 0],       //              additional present weather info
    [/^CITY (M|)(\d+)/, cityTemp],
    [/^SNOINCR (\d+)/, snoincr],
    [/^MOV (\w+)/, oneArg, "moving to"],
    [/^(FEW|SCT|BKN|OVC)(\d+) V (FEW|SCT|BKN|OVC)/, varClouds],
    [/^(BC|BL|DR|FZ|MI|PR|SH|TS|RA|DZ|GR|GS|IC|PE|SG|SN|UP)+(B)(\d+)/, wxBegan],
    [/^(BC|BL|DR|FZ|MI|PR|SH|TS|RA|DZ|GR|GS|IC|PE|SG|SN|UP)+(E)(\d+)/, wxEnded],
//    [/^cloud dir]             standing lenticular, rotor clouds
//    [/^[freq] LTG[ltype] loc] lightning, e.g. "OCNL LTGICCG DSNT W"
//    [/^[dd]ppB[hh]mmE[hh]mm]  precip begin and end, "RAB05E30SNB20E55"
//    [/^pp ccchhh]             obscuration, e.g. "FG SCT000", "FU BKN020"

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
