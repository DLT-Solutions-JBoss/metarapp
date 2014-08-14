package com.dlt.weather.rest;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.dlt.weather.model.METAR;
import com.dlt.weather.model.Response;
import com.dlt.weather.model.Station;


//Dummy comment
@Path("/METAR")
public class MetarService implements WeatherService{

  //      @WebServiceRef(wsdlLocation="http://aviationweather.gov/adds/schema/metar1_2.xsd")
  //      static AviationService service;

        @WeatherService(ServiceType.METAR)
        @PersistenceContext(unitName="metarapp", type=PersistenceContextType.EXTENDED)
        private EntityManager emStation;

        @GET()
        @Path("{stationId}")
        @Produces("application/json")
        @WeatherService(ServiceType.METAR)
        public List<METAR> listMetars(@PathParam("stationId") String sStationId)
        {
                List <METAR> metar = null;

           	    try
           	    {

           	       URL myURL = new URL("http://www.aviationweather.gov/adds/dataserver_current/httpparam?dataSource=metars&requestType=retrieve&format=xml&hoursBeforeNow=4&stationString="+sStationId);
           	       HttpURLConnection myURLConnection = (HttpURLConnection) myURL.openConnection();

           	       // just want to do an HTTP GET here
           	       myURLConnection.setRequestMethod("GET");

           	       // uncomment this if you want to write output to this url
           	       myURLConnection.setDoOutput(true);

           	       // give it 15 seconds to respond
           	       myURLConnection.setReadTimeout(15*1000);
           	       myURLConnection.connect();

           	       // wrap the urlconnection in a bufferedReader
           	       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
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
        @Produces("application/json")
        @WeatherService(ServiceType.METAR)
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
        @Produces("application/json")
        @WeatherService(ServiceType.METAR)
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
        @Produces("application/json")
        @WeatherService(ServiceType.METAR)
        public List<Station> getStations()
        {

                Query query = emStation.createQuery("FROM com.dlt.weather.model.Station order by name");
                @SuppressWarnings("unchecked")
                List <Station> station = query.getResultList();

                return station;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
                return null;
        }
        @Override
        public ServiceType value() {
                return null;
        }
}

