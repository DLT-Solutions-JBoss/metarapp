package com.dlt.weather.rest;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import javax.net.ssl.HttpsURLConnection;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.dlt.weather.model.METAR;
import com.dlt.weather.model.Response;
import com.dlt.weather.model.Station;


@Provider
@Path("")
public class MetarService  {

  //      @WebServiceRef(wsdlLocation="http://aviationweather.gov/adds/schema/metar1_2.xsd")
  //      static AviationService service;

        @PersistenceContext(unitName="metarapp", type=PersistenceContextType.EXTENDED)
        private EntityManager emStation;

        @GET()
        @Path("{stationId}")
        @Produces(MediaType.APPLICATION_JSON)
        public List<METAR> listMetars(@PathParam("stationId") String sStationId)
        {
                List <METAR> metar = null;

           	    try
           	    {
           	       Date now = new Date();
           	       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
           	       String sEndTime = formatter.format(now);
           	       System.out.println("Current time ="+sEndTime);
           	       
           	       Calendar cal = Calendar.getInstance();
           	       cal.setTime(now);
           	       cal.add(Calendar.HOUR, -4);
           	       Date oneHourBack = cal.getTime();
           	       
           	       String sStartTime = formatter.format(oneHourBack);
        	       System.out.println("An hour ago ="+sStartTime);

           	       //URL myURL = new URL("https://aviationweather.gov/api/data/dataserver?requestType=retrieve&dataSource=metars&mostRecent=true&format=xml&startTime=2023-11-06T18:20:21Z&endTime=2023-11-07T18:46:21Z&stationString="+sStationId);
        	       URL myURL = new URL("https://aviationweather.gov/api/data/dataserver?requestType=retrieve&dataSource=metars&mostRecent=true&format=xml&startTime="+sStartTime+"&endTime="+sEndTime+"&stationString="+sStationId);
           	       HttpsURLConnection myURLConnection = (HttpsURLConnection) myURL.openConnection();

           	       // just want to do an HTTP GET here
           	       myURLConnection.setRequestMethod("GET");
                                               
           	       // uncomment this if you want to write output to this url
           	       myURLConnection.setDoOutput(true);

           	       // give it 15 seconds to respond
           	       myURLConnection.setReadTimeout(15*1000);
           	       myURLConnection.connect();
                  
                   if (myURLConnection.getResponseCode() == 200) 
		   {

           	     // wrap the urlconnection in a bufferedReader
           	     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream(), StandardCharsets.UTF_8));
                     StringBuffer responseXmlString = new StringBuffer();
                     String xmlString;

                     while ((xmlString = bufferedReader.readLine()) != null)
                     {
                  	   responseXmlString.append(xmlString);
                     }
                     bufferedReader.close();

                     System.out.println("Returned XML String = "+responseXmlString.toString());

         	     JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);

         	     Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                  
         	     StringReader reader = new StringReader(responseXmlString.toString());
                  
         	     Response metarResponse = (Response) jaxbUnmarshaller.unmarshal(reader);
         	     metar = metarResponse.getData().getMETAR();
	           }
		   else
		   {
		      System.out.println("Call to www.aviationweather.gov failed with response code = "+myURLConnection.getResponseCode());
		      return metar;
		   }

         	  }
           	  catch (JAXBException e)
         	  {
         	     e.printStackTrace();
           	  }
           	  catch (Exception e)
         	  {
         	     e.printStackTrace();
         	  }

                return metar;
        }

        @GET()
        @Path("station/{stationId}")
        @Produces(MediaType.APPLICATION_JSON)
        public List<Station> getStation(@PathParam("stationId") String sStationId)
        {

                Query query = emStation.createQuery("FROM com.dlt.weather.model.Station where id = ?1 order by name");
                query.setParameter(1,sStationId);
                @SuppressWarnings("unchecked")
                List <Station> station = query.getResultList();

                return station;
        }

        @GET()
        @Path("station/state/{stateCode}")
        @Produces(MediaType.APPLICATION_JSON)
        public List<Station> getStationsByState(@PathParam("stateCode") String sStateCode)
        {

                Query query = emStation.createQuery("FROM com.dlt.weather.model.Station where state = ?1 order by name");
                query.setParameter(1,sStateCode);
                @SuppressWarnings("unchecked")
                List <Station> station = query.getResultList();

                return station;
        }

        @GET()
        @Path("stations")
        @Produces(MediaType.APPLICATION_JSON)
        public List<Station> getStations()
        {

                Query query = emStation.createQuery("FROM com.dlt.weather.model.Station order by name");
                @SuppressWarnings("unchecked")
                List <Station> station = query.getResultList();

                return station;
        }
        
}

