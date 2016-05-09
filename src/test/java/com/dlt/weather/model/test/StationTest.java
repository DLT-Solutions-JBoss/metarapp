package com.dlt.weather.model.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StationTest {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test001"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude(0.0d);
    station0.setState("");
    double d9 = station0.getLongitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test002"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test003"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    station0.setId("hi!");
    station0.setId("hi!");
    java.lang.String str18 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test004"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setLongitude((-1.0d));
    station0.setLatitude(10.0d);
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test005"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    double d12 = station0.getLatitude();
    station0.setId("");
    station0.setState("");
    double d17 = station0.getLongitude();
    double d18 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str21 = station0.getName();
    double d22 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test006"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setState("hi!");
    station0.setId("");
    station0.setState("");
    double d20 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test007"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getId();
    station0.setLongitude(1.0d);
    station0.setName("");
    double d17 = station0.getLatitude();
    station0.setState("hi!");
    java.lang.String str20 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test008"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getName();
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getId();
    java.lang.String str13 = station0.getId();
    double d14 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str17 = station0.getState();
    java.lang.String str18 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test009"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getId();
    station0.setLongitude(100.0d);
    double d15 = station0.getLatitude();
    station0.setName("");
    station0.setLatitude(0.0d);
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test010"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setState("");
    station0.setName("");
    java.lang.String str15 = station0.getName();
    java.lang.String str16 = station0.getState();
    java.lang.String str17 = station0.getName();
    java.lang.String str18 = station0.getState();
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test011"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setLongitude(0.0d);
    station0.setId("");
    java.lang.String str16 = station0.getState();
    double d17 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test012"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    java.lang.String str6 = station0.getState();
    java.lang.String str7 = station0.getState();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test013"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    station0.setState("");
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test014"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    station0.setLatitude(1.0d);
    station0.setLongitude(0.0d);
    station0.setLatitude(0.0d);
    station0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test015"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    double d8 = station0.getLongitude();
    java.lang.String str9 = station0.getId();
    station0.setName("hi!");
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test016"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    double d13 = station0.getLongitude();
    java.lang.String str14 = station0.getId();
    station0.setId("hi!");
    double d17 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test017"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    java.lang.String str12 = station0.getState();
    station0.setLatitude(10.0d);
    double d15 = station0.getLatitude();
    java.lang.String str16 = station0.getId();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test018"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    station0.setId("hi!");
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test019"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setName("hi!");
    java.lang.String str8 = station0.getId();
    station0.setName("");
    station0.setLongitude(100.0d);
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test020"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setLatitude(10.0d);
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getName();
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test021"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    java.lang.String str24 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test022"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLatitude(1.0d);
    station0.setLongitude(100.0d);
    station0.setLatitude(100.0d);
    java.lang.String str12 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test023"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str9 = station0.getState();
    station0.setLatitude(0.0d);
    double d12 = station0.getLatitude();
    station0.setName("");
    java.lang.String str15 = station0.getName();
    java.lang.String str16 = station0.getState();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test024"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test025"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude((-1.0d));
    station0.setName("hi!");
    station0.setLatitude((-1.0d));
    station0.setName("");
    double d13 = station0.getLongitude();
    station0.setLongitude(100.0d);
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test026"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setState("");
    station0.setLatitude((-1.0d));
    station0.setLongitude(1.0d);
    station0.setName("");
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test027"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    station0.setLongitude(100.0d);
    station0.setName("");
    java.lang.String str11 = station0.getName();
    double d12 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test028"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLatitude();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str9 = station0.getState();
    station0.setState("");
    java.lang.String str12 = station0.getId();
    double d13 = station0.getLongitude();
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test029"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test030"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    station0.setId("");
    double d15 = station0.getLongitude();
    station0.setState("");
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test031"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getId();
    station0.setName("");
    station0.setId("hi!");
    station0.setLatitude(0.0d);
    java.lang.String str17 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test032"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test033"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setId("");
    java.lang.String str7 = station0.getName();
    java.lang.String str8 = station0.getId();
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test034"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getId();
    station0.setState("");
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test035"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getName();
    double d13 = station0.getLatitude();
    station0.setLongitude(1.0d);
    station0.setLongitude(100.0d);
    station0.setState("");
    station0.setLatitude(10.0d);
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test036"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    java.lang.String str10 = station0.getName();
    station0.setLongitude(0.0d);
    double d13 = station0.getLongitude();
    java.lang.String str14 = station0.getId();
    java.lang.String str15 = station0.getName();
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test037"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    java.lang.String str13 = station0.getName();
    double d14 = station0.getLongitude();
    station0.setId("hi!");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test038"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str9 = station0.getName();
    station0.setState("hi!");
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getId();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test039"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    station0.setId("hi!");
    double d9 = station0.getLatitude();
    station0.setLatitude(10.0d);
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test040"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getId();
    station0.setState("");
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test041"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude(0.0d);
    station0.setState("");
    java.lang.String str9 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test042"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    station0.setLatitude(1.0d);
    java.lang.String str10 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test043"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    station0.setLongitude(0.0d);
    station0.setId("");
    double d18 = station0.getLongitude();
    double d19 = station0.getLatitude();
    station0.setId("");
    java.lang.String str22 = station0.getState();
    java.lang.String str23 = station0.getId();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test044"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    station0.setLatitude(1.0d);
    station0.setName("hi!");
    station0.setState("hi!");
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test045"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    station0.setLatitude(0.0d);
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getId();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test046"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    station0.setLatitude((-1.0d));
    double d12 = station0.getLatitude();
    double d13 = station0.getLatitude();
    java.lang.String str14 = station0.getState();
    double d15 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == (-1.0d));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test047"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    station0.setLatitude(0.0d);
    station0.setState("hi!");
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test048"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    station0.setLatitude((-1.0d));
    double d12 = station0.getLatitude();
    double d13 = station0.getLatitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test049"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    java.lang.String str16 = station0.getName();
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test050"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setLongitude(0.0d);
    station0.setLongitude((-1.0d));
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test051"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setLongitude(0.0d);
    java.lang.String str14 = station0.getState();
    station0.setState("");
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test052"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLongitude(10.0d);
    java.lang.String str8 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test053"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setName("");
    java.lang.String str6 = station0.getState();
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test054"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(0.0d);
    double d8 = station0.getLatitude();
    double d9 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test055"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    double d14 = station0.getLatitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str19 = station0.getState();
    double d20 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test056"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    station0.setId("hi!");
    station0.setName("hi!");
    double d11 = station0.getLongitude();
    java.lang.String str12 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test057"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    double d14 = station0.getLatitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    double d19 = station0.getLongitude();
    station0.setLongitude(100.0d);
    double d22 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 100.0d);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test058"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(1.0d);
    double d8 = station0.getLatitude();
    double d9 = station0.getLatitude();
    java.lang.String str10 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test059"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    java.lang.String str10 = station0.getId();
    station0.setLongitude(100.0d);
    java.lang.String str13 = station0.getName();
    station0.setId("");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test060"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    java.lang.String str12 = station0.getId();
    station0.setLongitude((-1.0d));
    station0.setLongitude((-1.0d));
    station0.setName("hi!");
    station0.setName("");
    station0.setLongitude(0.0d);
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test061"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    station0.setLatitude(1.0d);
    station0.setName("hi!");
    double d12 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test062"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setId("hi!");
    java.lang.String str18 = station0.getState();
    station0.setLatitude((-1.0d));
    java.lang.String str21 = station0.getName();
    java.lang.String str22 = station0.getId();
    station0.setId("");
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test063"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setLongitude(10.0d);
    station0.setName("");
    station0.setLatitude((-1.0d));
    double d17 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    double d20 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 10.0d);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test064"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setState("");
    station0.setState("");
    station0.setId("hi!");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test065"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setLongitude(0.0d);
    station0.setLongitude((-1.0d));
    java.lang.String str10 = station0.getName();
    station0.setLongitude(10.0d);
    double d13 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test066"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLatitude();
    station0.setLatitude(1.0d);
    station0.setName("");
    station0.setName("hi!");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test067"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setLatitude(10.0d);
    station0.setName("");
    station0.setName("");
    station0.setLatitude(100.0d);
    double d21 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test068"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLatitude();
    station0.setId("");
    station0.setState("hi!");
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test069"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLatitude(1.0d);
    station0.setLongitude(100.0d);
    station0.setLatitude(100.0d);
    station0.setName("");
    station0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test070"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str13 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test071"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setId("hi!");
    station0.setName("hi!");
    double d17 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 100.0d);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test072"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getState();
    station0.setName("hi!");
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test073"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude((-1.0d));
    station0.setName("hi!");
    station0.setLatitude((-1.0d));
    station0.setName("");
    double d13 = station0.getLongitude();
    station0.setLongitude(100.0d);
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test074"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getName();
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str10 = station0.getId();
    double d11 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test075"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLatitude(100.0d);
    java.lang.String str12 = station0.getId();
    java.lang.String str13 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test076"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    java.lang.String str7 = station0.getId();
    station0.setState("hi!");
    double d10 = station0.getLatitude();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test077"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    java.lang.String str7 = station0.getId();
    station0.setLatitude(10.0d);
    java.lang.String str10 = station0.getState();
    station0.setId("");
    java.lang.String str13 = station0.getName();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test078"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setId("");
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLatitude();
    double d13 = station0.getLongitude();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test079"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getId();
    java.lang.String str15 = station0.getId();
    java.lang.String str16 = station0.getState();
    station0.setName("");
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test080"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    station0.setLatitude((-1.0d));
    java.lang.String str15 = station0.getState();
    java.lang.String str16 = station0.getId();
    station0.setLongitude(1.0d);
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test081"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    station0.setId("hi!");
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test082"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    double d8 = station0.getLongitude();
    java.lang.String str9 = station0.getState();
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getName();
    java.lang.String str14 = station0.getId();
    java.lang.String str15 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test083"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    station0.setName("hi!");
    double d15 = station0.getLongitude();
    double d16 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test084"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getId();
    station0.setId("hi!");
    java.lang.String str9 = station0.getState();
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test085"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    java.lang.String str14 = station0.getId();
    double d15 = station0.getLatitude();
    station0.setId("");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test086"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test087"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLongitude();
    java.lang.String str11 = station0.getName();
    station0.setLatitude(10.0d);
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test088"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setLatitude(0.0d);
    station0.setLongitude(1.0d);
    double d8 = station0.getLatitude();
    station0.setId("");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test089"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    double d11 = station0.getLatitude();
    station0.setState("");
    java.lang.String str14 = station0.getId();
    station0.setName("");
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test090"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getName();
    station0.setLongitude((-1.0d));
    java.lang.String str9 = station0.getState();
    station0.setLongitude(0.0d);
    double d12 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test091"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getName();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test092"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    java.lang.String str10 = station0.getName();
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getName();
    station0.setLongitude(100.0d);
    java.lang.String str15 = station0.getId();
    double d16 = station0.getLongitude();
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 100.0d);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test093"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test094"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    double d11 = station0.getLatitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test095"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setName("");
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getState();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test096"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getName();
    double d7 = station0.getLatitude();
    station0.setLatitude(10.0d);
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test097"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    java.lang.String str9 = station0.getId();
    double d10 = station0.getLatitude();
    station0.setLongitude((-1.0d));
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getName();
    station0.setLatitude(0.0d);
    java.lang.String str17 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test098"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getState();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test099"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setId("");
    station0.setId("");
    double d22 = station0.getLongitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test100"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLatitude(0.0d);
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test101"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    java.lang.String str14 = station0.getName();
    java.lang.String str15 = station0.getState();
    double d16 = station0.getLongitude();
    double d17 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test102"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude((-1.0d));
    java.lang.String str7 = station0.getId();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test103"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getState();
    station0.setId("");
    java.lang.String str16 = station0.getName();
    java.lang.String str17 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test104"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    station0.setLongitude(0.0d);
    station0.setId("");
    double d18 = station0.getLongitude();
    double d19 = station0.getLatitude();
    station0.setId("");
    java.lang.String str22 = station0.getState();
    java.lang.String str23 = station0.getId();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test105"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    station0.setLatitude(1.0d);
    java.lang.String str10 = station0.getId();
    station0.setLongitude(10.0d);
    java.lang.String str13 = station0.getState();
    station0.setLatitude(10.0d);
    java.lang.String str16 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test106"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    java.lang.String str8 = station0.getId();
    station0.setId("hi!");
    java.lang.String str11 = station0.getName();
    station0.setLatitude(0.0d);
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test107"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test108"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str9 = station0.getState();
    station0.setLatitude(0.0d);
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test109"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    station0.setId("hi!");
    double d16 = station0.getLatitude();
    station0.setLongitude(10.0d);
    java.lang.String str19 = station0.getId();
    double d20 = station0.getLatitude();
    double d21 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test110"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    station0.setLongitude(1.0d);
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test111"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setState("");
    java.lang.String str8 = station0.getId();
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test112"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLatitude();
    station0.setState("hi!");
    station0.setName("hi!");
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test113"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    java.lang.String str10 = station0.getName();
    station0.setLongitude(0.0d);
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test114"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLongitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test115"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getState();
    double d15 = station0.getLongitude();
    station0.setState("hi!");
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test116"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLongitude((-1.0d));
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test117"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    java.lang.String str12 = station0.getId();
    double d13 = station0.getLongitude();
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getName();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test118"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getId();
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getId();
    double d9 = station0.getLatitude();
    double d10 = station0.getLongitude();
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test119"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getName();
    double d18 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test120"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getName();
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str10 = station0.getId();
    station0.setState("");
    double d13 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test121"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    java.lang.String str10 = station0.getId();
    double d11 = station0.getLongitude();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test122"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    station0.setName("");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test123"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    double d7 = station0.getLongitude();
    station0.setName("");
    station0.setState("hi!");
    double d12 = station0.getLatitude();
    station0.setState("hi!");
    double d15 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test124"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    java.lang.String str11 = station0.getName();
    double d12 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test125"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    station0.setLongitude(0.0d);
    station0.setId("");
    double d18 = station0.getLongitude();
    double d19 = station0.getLatitude();
    station0.setLatitude(0.0d);
    java.lang.String str22 = station0.getId();
    station0.setLongitude(0.0d);
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test126"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setId("");
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLatitude();
    double d13 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test127"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setState("hi!");
    java.lang.String str10 = station0.getId();
    station0.setLatitude(0.0d);
    java.lang.String str13 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test128"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setId("");
    java.lang.String str10 = station0.getName();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test129"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getState();
    station0.setState("hi!");
    station0.setState("hi!");
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getState();
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test130"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getId();
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test131"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setLatitude(10.0d);
    station0.setLongitude(0.0d);
    station0.setState("");
    java.lang.String str13 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test132"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    station0.setId("hi!");
    java.lang.String str16 = station0.getId();
    station0.setState("");
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test133"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setName("hi!");
    station0.setState("");
    java.lang.String str11 = station0.getState();
    station0.setName("");
    java.lang.String str14 = station0.getId();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test134"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    java.lang.String str7 = station0.getName();
    double d8 = station0.getLongitude();
    station0.setState("hi!");
    double d11 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test135"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    station0.setName("hi!");
    double d16 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test136"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getName();
    double d9 = station0.getLatitude();
    station0.setId("");
    java.lang.String str12 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test137"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("");
    station0.setId("");
    station0.setName("hi!");
    double d16 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test138"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setLatitude(0.0d);
    java.lang.String str6 = station0.getState();
    station0.setId("hi!");
    java.lang.String str9 = station0.getName();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test139"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    java.lang.String str9 = station0.getId();
    double d10 = station0.getLatitude();
    station0.setLongitude((-1.0d));
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test140"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    java.lang.String str10 = station0.getName();
    station0.setLongitude(0.0d);
    double d13 = station0.getLongitude();
    java.lang.String str14 = station0.getName();
    java.lang.String str15 = station0.getName();
    station0.setState("");
    double d18 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test141"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getName();
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    double d14 = station0.getLongitude();
    java.lang.String str15 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test142"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLongitude(0.0d);
    station0.setId("hi!");
    station0.setId("hi!");
    double d7 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test143"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setLongitude(10.0d);
    station0.setLatitude(10.0d);
    station0.setLatitude(1.0d);
    double d17 = station0.getLatitude();
    double d18 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    java.lang.String str21 = station0.getId();
    station0.setName("");
    double d24 = station0.getLatitude();
    double d25 = station0.getLongitude();
    java.lang.String str26 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test144"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    double d14 = station0.getLatitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str19 = station0.getName();
    java.lang.String str20 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test145"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    java.lang.String str6 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setLatitude(0.0d);
    station0.setLongitude(1.0d);
    java.lang.String str13 = station0.getName();
    double d14 = station0.getLongitude();
    java.lang.String str15 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test146"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str10 = station0.getId();
    double d11 = station0.getLongitude();
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getName();
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test147"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setName("hi!");
    station0.setId("hi!");
    double d12 = station0.getLatitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test148"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setLongitude(10.0d);
    station0.setLatitude(10.0d);
    station0.setLatitude(1.0d);
    double d17 = station0.getLatitude();
    station0.setLongitude(0.0d);
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test149"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test150"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setId("hi!");
    java.lang.String str12 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setName("hi!");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test151"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getState();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test152"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setLongitude(0.0d);
    station0.setState("");
    java.lang.String str20 = station0.getName();
    java.lang.String str21 = station0.getName();
    java.lang.String str22 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test153"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    java.lang.String str5 = station0.getId();
    java.lang.String str6 = station0.getId();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getState();
    java.lang.String str10 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test154"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    java.lang.String str5 = station0.getState();
    station0.setLongitude(10.0d);
    java.lang.String str8 = station0.getName();
    double d9 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str12 = station0.getName();
    station0.setId("hi!");
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test155"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    double d8 = station0.getLongitude();
    java.lang.String str9 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test156"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setState("hi!");
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test157"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setId("hi!");
    java.lang.String str11 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test158"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test159"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    double d14 = station0.getLatitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setId("");
    station0.setLatitude(1.0d);
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test160"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    double d9 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setLongitude(0.0d);
    double d14 = station0.getLongitude();
    station0.setName("hi!");
    double d17 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 100.0d);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test161"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setId("hi!");
    java.lang.String str15 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test162"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setState("hi!");
    station0.setState("hi!");
    station0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test163"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    station0.setLongitude(100.0d);
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test164"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    java.lang.String str8 = station0.getId();
    station0.setId("hi!");
    java.lang.String str11 = station0.getName();
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test165"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLongitude(10.0d);
    double d8 = station0.getLatitude();
    double d9 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test166"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setLongitude(0.0d);
    station0.setLongitude((-1.0d));
    double d10 = station0.getLongitude();
    java.lang.String str11 = station0.getId();
    double d12 = station0.getLatitude();
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test167"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getName();
    double d11 = station0.getLatitude();
    station0.setName("");
    station0.setState("");
    station0.setName("");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test168"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    station0.setId("");
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test169"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    java.lang.String str7 = station0.getName();
    java.lang.String str8 = station0.getState();
    java.lang.String str9 = station0.getId();
    double d10 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test170"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str8 = station0.getState();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test171"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setLatitude(10.0d);
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getName();
    station0.setState("hi!");
    station0.setId("");
    java.lang.String str16 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test172"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getId();
    java.lang.String str15 = station0.getId();
    station0.setName("hi!");
    double d18 = station0.getLatitude();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test173"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test174"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    station0.setLongitude(1.0d);
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test175"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setLatitude(0.0d);
    station0.setId("hi!");
    java.lang.String str8 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test176"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test177"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    double d9 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setId("");
    station0.setState("");
    double d16 = station0.getLongitude();
    station0.setState("");
    station0.setId("hi!");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test178"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getName();
    station0.setLongitude(10.0d);
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test179"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    java.lang.String str10 = station0.getName();
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getName();
    station0.setLongitude(100.0d);
    java.lang.String str15 = station0.getId();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test180"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    station0.setLatitude(100.0d);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test181"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test182"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    station0.setId("hi!");
    java.lang.String str16 = station0.getId();
    double d17 = station0.getLongitude();
    station0.setState("hi!");
    java.lang.String str20 = station0.getName();
    double d21 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 100.0d);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test183"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setState("");
    station0.setState("hi!");
    double d10 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test184"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    station0.setLatitude((-1.0d));
    double d13 = station0.getLatitude();
    station0.setState("hi!");
    double d16 = station0.getLatitude();
    double d17 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test185"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getState();
    station0.setState("");
    station0.setState("hi!");
    java.lang.String str11 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test186"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setLatitude(10.0d);
    station0.setName("");
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getState();
    station0.setId("hi!");
    java.lang.String str16 = station0.getState();
    double d17 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 10.0d);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test187"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLatitude();
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test188"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    double d10 = station0.getLatitude();
    double d11 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test189"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setName("hi!");
    station0.setState("");
    java.lang.String str11 = station0.getState();
    station0.setName("");
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test190"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    double d8 = station0.getLongitude();
    station0.setName("");
    java.lang.String str11 = station0.getState();
    station0.setName("");
    station0.setLatitude(10.0d);
    station0.setName("");
    station0.setLatitude(10.0d);
    double d20 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 10.0d);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test191"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(100.0d);
    station0.setState("hi!");
    station0.setLatitude((-1.0d));
    double d12 = station0.getLatitude();
    double d13 = station0.getLatitude();
    java.lang.String str14 = station0.getId();
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test192"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getId();
    double d14 = station0.getLongitude();
    station0.setLatitude(100.0d);
    java.lang.String str17 = station0.getId();
    java.lang.String str18 = station0.getState();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test193"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    station0.setLongitude(100.0d);
    station0.setId("hi!");
    double d16 = station0.getLongitude();
    java.lang.String str17 = station0.getName();
    java.lang.String str18 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test194"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str8 = station0.getState();
    station0.setName("");
    station0.setLongitude(1.0d);
    station0.setLongitude(0.0d);
    station0.setLongitude(100.0d);
    java.lang.String str17 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test195"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLatitude();
    java.lang.String str10 = station0.getName();
    station0.setState("");
    station0.setLatitude(10.0d);
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test196"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    double d8 = station0.getLongitude();
    station0.setName("");
    java.lang.String str11 = station0.getState();
    station0.setName("");
    station0.setId("hi!");
    java.lang.String str16 = station0.getId();
    station0.setLatitude(1.0d);
    double d19 = station0.getLatitude();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test197"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setLatitude(10.0d);
    station0.setName("");
    station0.setLongitude(100.0d);
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test198"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    java.lang.String str8 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test199"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLatitude();
    java.lang.String str10 = station0.getName();
    station0.setState("");
    station0.setLatitude(1.0d);
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test200"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setName("");
    station0.setLatitude((-1.0d));
    java.lang.String str17 = station0.getState();
    station0.setLongitude(10.0d);
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test201"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLongitude((-1.0d));
    station0.setId("");
    station0.setId("hi!");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test202"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    station0.setLongitude((-1.0d));
    java.lang.String str12 = station0.getState();
    station0.setState("");
    station0.setLongitude(0.0d);
    java.lang.String str17 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test203"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setState("hi!");
    station0.setState("");
    java.lang.String str9 = station0.getState();
    station0.setId("");
    double d12 = station0.getLatitude();
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test204"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setState("");
    station0.setName("");
    double d15 = station0.getLongitude();
    double d16 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test205"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    double d11 = station0.getLongitude();
    station0.setName("");
    double d14 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str17 = station0.getId();
    double d18 = station0.getLatitude();
    station0.setLongitude(100.0d);
    station0.setLongitude((-1.0d));
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test206"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setName("hi!");
    station0.setId("hi!");
    station0.setName("");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test207"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test208"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    java.lang.String str12 = station0.getState();
    station0.setLatitude(10.0d);
    java.lang.String str15 = station0.getId();
    double d16 = station0.getLatitude();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test209"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    java.lang.String str6 = station0.getId();
    station0.setState("hi!");
    station0.setName("hi!");
    java.lang.String str11 = station0.getName();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test210"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setLongitude(0.0d);
    station0.setLongitude((-1.0d));
    station0.setName("hi!");
    java.lang.String str18 = station0.getName();
    station0.setState("");
    double d21 = station0.getLatitude();
    java.lang.String str22 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test211"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getName();
    java.lang.String str18 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test212"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    java.lang.String str9 = station0.getId();
    double d10 = station0.getLatitude();
    station0.setLongitude((-1.0d));
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getName();
    station0.setLatitude(0.0d);
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test213"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setName("");
    station0.setState("");
    double d5 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test214"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("hi!");
    station0.setState("");
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getName();
    java.lang.String str16 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test215"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setLongitude((-1.0d));
    double d15 = station0.getLatitude();
    station0.setLatitude((-1.0d));
    double d18 = station0.getLongitude();
    double d19 = station0.getLatitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-1.0d));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test216"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setState("hi!");
    java.lang.String str7 = station0.getId();
    java.lang.String str8 = station0.getState();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test217"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    java.lang.String str12 = station0.getId();
    double d13 = station0.getLongitude();
    station0.setName("");
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test218"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setLatitude(10.0d);
    station0.setName("");
    station0.setName("");
    java.lang.String str19 = station0.getId();
    station0.setId("hi!");
    java.lang.String str22 = station0.getState();
    station0.setLatitude(10.0d);
    station0.setLongitude(100.0d);
    java.lang.String str27 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test219"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    double d10 = station0.getLongitude();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getId();
    station0.setName("hi!");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test220"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setLatitude((-1.0d));
    station0.setId("");
    java.lang.String str18 = station0.getState();
    double d19 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-1.0d));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test221"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    double d13 = station0.getLatitude();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test222"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setState("");
    double d11 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test223"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setLongitude(10.0d);
    java.lang.String str10 = station0.getName();
    station0.setState("");
    java.lang.String str13 = station0.getName();
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test224"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setId("hi!");
    java.lang.String str18 = station0.getState();
    station0.setLatitude((-1.0d));
    station0.setLatitude(10.0d);
    double d23 = station0.getLatitude();
    java.lang.String str24 = station0.getState();
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test225"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setId("");
    station0.setLatitude((-1.0d));
    double d12 = station0.getLatitude();
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test226"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setName("");
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test227"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLongitude();
    java.lang.String str11 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test228"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    java.lang.String str7 = station0.getName();
    station0.setName("hi!");
    java.lang.String str10 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test229"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    double d9 = station0.getLongitude();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test230"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setLatitude(10.0d);
    java.lang.String str10 = station0.getId();
    station0.setLongitude(10.0d);
    java.lang.String str13 = station0.getId();
    station0.setId("hi!");
    station0.setLongitude(0.0d);
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test231"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("");
    station0.setLatitude(0.0d);
    double d11 = station0.getLongitude();
    double d12 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test232"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str9 = station0.getName();
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test233"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    station0.setLatitude((-1.0d));
    double d13 = station0.getLatitude();
    station0.setState("");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test234"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLongitude(0.0d);
    station0.setId("hi!");
    station0.setLatitude(1.0d);
    station0.setName("");
    station0.setLatitude(1.0d);
    java.lang.String str11 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test235"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test236"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("");
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test237"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getName();
    station0.setName("hi!");
    double d12 = station0.getLongitude();
    double d13 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test238"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setLongitude(10.0d);
    station0.setLatitude(10.0d);
    station0.setLatitude(1.0d);
    double d17 = station0.getLatitude();
    station0.setLatitude(0.0d);
    java.lang.String str20 = station0.getId();
    station0.setLatitude(10.0d);
    java.lang.String str23 = station0.getId();
    station0.setLatitude(0.0d);
    java.lang.String str26 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test239"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    double d7 = station0.getLongitude();
    double d8 = station0.getLatitude();
    station0.setLatitude((-1.0d));
    java.lang.String str11 = station0.getState();
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test240"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str12 = station0.getName();
    station0.setState("hi!");
    double d15 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test241"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    java.lang.String str6 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setLatitude(0.0d);
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test242"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test243"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLatitude(0.0d);
    double d6 = station0.getLatitude();
    station0.setState("");
    station0.setLongitude(0.0d);
    double d11 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test244"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    station0.setLongitude((-1.0d));
    double d7 = station0.getLatitude();
    double d8 = station0.getLongitude();
    java.lang.String str9 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test245"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    double d10 = station0.getLatitude();
    station0.setName("");
    station0.setName("hi!");
    java.lang.String str15 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test246"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setState("");
    double d13 = station0.getLatitude();
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test247"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    double d8 = station0.getLongitude();
    double d9 = station0.getLatitude();
    station0.setLongitude(100.0d);
    double d12 = station0.getLongitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test248"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setLatitude(0.0d);
    station0.setLongitude(1.0d);
    double d8 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str11 = station0.getState();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test249"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    station0.setName("");
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test250"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str14 = station0.getId();
    double d15 = station0.getLatitude();
    station0.setLongitude((-1.0d));
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test251"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    double d9 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setId("");
    station0.setState("");
    double d16 = station0.getLongitude();
    station0.setLatitude(10.0d);
    station0.setState("");
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test252"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test253"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setState("");
    java.lang.String str11 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test254"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setName("");
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    double d12 = station0.getLongitude();
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test255"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setState("");
    station0.setState("hi!");
    double d10 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str13 = station0.getState();
    double d14 = station0.getLongitude();
    station0.setLatitude(10.0d);
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test256"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    double d6 = station0.getLongitude();
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test257"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLongitude();
    station0.setLatitude(0.0d);
    double d13 = station0.getLatitude();
    station0.setLatitude(1.0d);
    java.lang.String str16 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test258"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLongitude((-1.0d));
    double d10 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test259"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    double d14 = station0.getLatitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    double d19 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test260"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getName();
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getId();
    java.lang.String str13 = station0.getId();
    double d14 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str17 = station0.getState();
    java.lang.String str18 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test261"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    double d8 = station0.getLongitude();
    double d9 = station0.getLatitude();
    station0.setLatitude(1.0d);
    station0.setLatitude((-1.0d));
    java.lang.String str14 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test262"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getId();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test263"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setName("hi!");
    station0.setState("");
    station0.setName("hi!");
    station0.setLatitude((-1.0d));
    station0.setLatitude((-1.0d));
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test264"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setLongitude(0.0d);
    station0.setLongitude((-1.0d));
    double d10 = station0.getLongitude();
    station0.setName("");
    java.lang.String str13 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test265"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getId();
    station0.setName("");
    java.lang.String str11 = station0.getId();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test266"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test267"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test268"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    java.lang.String str9 = station0.getId();
    java.lang.String str10 = station0.getId();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test269"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getName();
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test270"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    double d14 = station0.getLatitude();
    station0.setId("");
    double d17 = station0.getLatitude();
    double d18 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test271"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    double d10 = station0.getLongitude();
    double d11 = station0.getLatitude();
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getId();
    station0.setState("hi!");
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test272"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getName();
    java.lang.String str4 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test273"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    double d8 = station0.getLatitude();
    station0.setName("hi!");
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test274"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getId();
    station0.setId("hi!");
    station0.setLongitude(0.0d);
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test275"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLongitude(0.0d);
    station0.setId("hi!");
    station0.setLatitude(1.0d);
    double d7 = station0.getLongitude();
    double d8 = station0.getLongitude();
    double d9 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test276"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    station0.setLongitude((-1.0d));
    java.lang.String str12 = station0.getState();
    double d13 = station0.getLongitude();
    station0.setName("");
    station0.setId("");
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test277"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getId();
    station0.setState("");
    station0.setName("");
    java.lang.String str11 = station0.getId();
    station0.setId("");
    station0.setState("");
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test278"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setLatitude(10.0d);
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getState();
    station0.setId("");
    java.lang.String str20 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test279"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setState("hi!");
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getName();
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test280"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getId();
    station0.setState("");
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getState();
    station0.setState("");
    station0.setName("");
    java.lang.String str18 = station0.getName();
    double d19 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test281"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    double d7 = station0.getLongitude();
    station0.setState("");
    double d10 = station0.getLatitude();
    station0.setLongitude(1.0d);
    double d13 = station0.getLatitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test282"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setLongitude(10.0d);
    station0.setLatitude(10.0d);
    station0.setLatitude(1.0d);
    double d17 = station0.getLatitude();
    double d18 = station0.getLongitude();
    java.lang.String str19 = station0.getId();
    station0.setLatitude(1.0d);
    double d22 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 1.0d);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test283"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLatitude(0.0d);
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLongitude();
    station0.setLatitude(1.0d);
    java.lang.String str15 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test284"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    station0.setLatitude((-1.0d));
    double d13 = station0.getLatitude();
    station0.setState("hi!");
    java.lang.String str16 = station0.getName();
    java.lang.String str17 = station0.getName();
    java.lang.String str18 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test285"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    station0.setLongitude(100.0d);
    station0.setLatitude(1.0d);
    java.lang.String str14 = station0.getState();
    double d15 = station0.getLatitude();
    station0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test286"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setLongitude(0.0d);
    station0.setLongitude((-1.0d));
    double d10 = station0.getLongitude();
    station0.setName("");
    station0.setState("");
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test287"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str6 = station0.getName();
    station0.setLatitude(100.0d);
    double d9 = station0.getLatitude();
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getId();
    double d13 = station0.getLatitude();
    double d14 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test288"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    station0.setLatitude((-1.0d));
    station0.setState("");
    java.lang.String str17 = station0.getState();
    double d18 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == (-1.0d));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test289"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    double d9 = station0.getLongitude();
    station0.setId("");
    java.lang.String str12 = station0.getId();
    java.lang.String str13 = station0.getId();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test290"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setLatitude(10.0d);
    java.lang.String str10 = station0.getId();
    station0.setName("hi!");
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test291"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    java.lang.String str7 = station0.getName();
    double d8 = station0.getLongitude();
    station0.setState("hi!");
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test292"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setLongitude(0.0d);
    station0.setLongitude((-1.0d));
    double d16 = station0.getLongitude();
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-1.0d));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test293"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setLongitude(10.0d);
    double d11 = station0.getLatitude();
    station0.setLatitude((-1.0d));
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test294"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setName("hi!");
    station0.setState("");
    station0.setLatitude((-1.0d));
    java.lang.String str17 = station0.getName();
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test295"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setId("");
    java.lang.String str7 = station0.getName();
    station0.setName("hi!");
    station0.setLatitude(1.0d);
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test296"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    java.lang.String str14 = station0.getId();
    station0.setLatitude((-1.0d));
    java.lang.String str17 = station0.getState();
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test297"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude((-1.0d));
    station0.setLongitude(0.0d);
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test298"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setState("hi!");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test299"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setId("");
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLatitude();
    double d13 = station0.getLongitude();
    station0.setState("");
    java.lang.String str16 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test300"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setName("");
    station0.setState("");
    java.lang.String str8 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test301"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    double d12 = station0.getLongitude();
    station0.setId("");
    station0.setId("");
    station0.setLongitude((-1.0d));
    java.lang.String str19 = station0.getId();
    java.lang.String str20 = station0.getName();
    station0.setLatitude(1.0d);
    java.lang.String str23 = station0.getName();
    double d24 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == (-1.0d));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test302"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    station0.setLongitude((-1.0d));
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test303"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setName("");
    station0.setName("hi!");
    java.lang.String str16 = station0.getName();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test304"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude((-1.0d));
    station0.setName("hi!");
    station0.setName("");
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test305"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setId("hi!");
    station0.setLatitude(1.0d);
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test306"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude((-1.0d));
    station0.setName("hi!");
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getState();
    station0.setId("");
    station0.setName("hi!");
    java.lang.String str15 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test307"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setLatitude(0.0d);
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test308"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    double d7 = station0.getLongitude();
    station0.setState("");
    station0.setName("");
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test309"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getName();
    station0.setId("");
    station0.setId("");
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test310"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    java.lang.String str6 = station0.getState();
    double d7 = station0.getLongitude();
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test311"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    station0.setId("hi!");
    java.lang.String str16 = station0.getId();
    station0.setState("");
    java.lang.String str19 = station0.getState();
    double d20 = station0.getLongitude();
    double d21 = station0.getLongitude();
    java.lang.String str22 = station0.getId();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test312"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str8 = station0.getState();
    station0.setName("");
    station0.setLongitude(1.0d);
    station0.setLongitude(0.0d);
    station0.setLongitude(100.0d);
    java.lang.String str17 = station0.getName();
    java.lang.String str18 = station0.getId();
    java.lang.String str19 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test313"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    java.lang.String str6 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setName("");
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test314"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getName();
    station0.setLongitude((-1.0d));
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test315"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    double d10 = station0.getLongitude();
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getId();
    double d13 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test316"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setName("");
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test317"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    station0.setId("");
    java.lang.String str14 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test318"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setLongitude((-1.0d));
    double d15 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == (-1.0d));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test319"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(0.0d);
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test320"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setLongitude(10.0d);
    java.lang.String str10 = station0.getName();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test321"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLatitude(0.0d);
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getName();
    station0.setState("hi!");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test322"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setName("hi!");
    station0.setLatitude(1.0d);
    double d5 = station0.getLatitude();
    double d6 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test323"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    station0.setState("hi!");
    java.lang.String str14 = station0.getId();
    java.lang.String str15 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test324"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLongitude(0.0d);
    station0.setId("hi!");
    java.lang.String str5 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test325"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("hi!");
    double d12 = station0.getLatitude();
    station0.setId("");
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test326"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setId("hi!");
    station0.setState("hi!");
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test327"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    station0.setName("hi!");
    double d9 = station0.getLongitude();
    double d10 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test328"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    station0.setId("");
    double d15 = station0.getLongitude();
    java.lang.String str16 = station0.getState();
    station0.setState("");
    double d19 = station0.getLatitude();
    station0.setName("");
    station0.setId("hi!");
    java.lang.String str24 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test329"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    double d12 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str17 = station0.getState();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test330"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getId();
    station0.setLongitude(100.0d);
    double d15 = station0.getLatitude();
    station0.setName("");
    station0.setLatitude(0.0d);
    double d20 = station0.getLatitude();
    java.lang.String str21 = station0.getState();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test331"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setId("hi!");
    station0.setState("hi!");
    double d13 = station0.getLongitude();
    double d14 = station0.getLatitude();
    java.lang.String str15 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test332"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setState("");
    station0.setName("");
    java.lang.String str15 = station0.getName();
    java.lang.String str16 = station0.getState();
    java.lang.String str17 = station0.getName();
    double d18 = station0.getLatitude();
    double d19 = station0.getLatitude();
    java.lang.String str20 = station0.getId();
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test333"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setLatitude(10.0d);
    station0.setName("");
    java.lang.String str17 = station0.getId();
    java.lang.String str18 = station0.getId();
    java.lang.String str19 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test334"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(100.0d);
    station0.setId("hi!");
    station0.setState("hi!");
    java.lang.String str12 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test335"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    double d11 = station0.getLatitude();
    station0.setLongitude(100.0d);
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test336"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setState("hi!");
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getState();
    station0.setName("");
    station0.setState("hi!");
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test337"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str8 = station0.getState();
    station0.setName("");
    station0.setState("hi!");
    station0.setState("hi!");
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test338"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    double d9 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setLatitude(100.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    station0.setLongitude(1.0d);
    double d18 = station0.getLongitude();
    java.lang.String str19 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test339"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    java.lang.String str5 = station0.getId();
    java.lang.String str6 = station0.getId();
    double d7 = station0.getLatitude();
    station0.setState("");
    java.lang.String str10 = station0.getState();
    double d11 = station0.getLongitude();
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test340"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    double d11 = station0.getLatitude();
    station0.setLatitude(10.0d);
    java.lang.String str14 = station0.getState();
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test341"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    station0.setLongitude(1.0d);
    java.lang.String str9 = station0.getState();
    station0.setId("");
    java.lang.String str12 = station0.getName();
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test342"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setId("");
    station0.setLatitude((-1.0d));
    double d12 = station0.getLatitude();
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getId();
    double d15 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == (-1.0d));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test343"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    double d8 = station0.getLongitude();
    java.lang.String str9 = station0.getState();
    java.lang.String str10 = station0.getState();
    java.lang.String str11 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test344"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    java.lang.String str7 = station0.getName();
    station0.setState("hi!");
    station0.setId("");
    java.lang.String str12 = station0.getName();
    double d13 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test345"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setLatitude((-1.0d));
    station0.setId("");
    double d18 = station0.getLatitude();
    double d19 = station0.getLatitude();
    double d20 = station0.getLatitude();
    double d21 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test346"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    double d8 = station0.getLongitude();
    java.lang.String str9 = station0.getState();
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    double d12 = station0.getLatitude();
    double d13 = station0.getLatitude();
    double d14 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test347"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    double d12 = station0.getLatitude();
    station0.setId("");
    station0.setState("");
    station0.setName("hi!");
    java.lang.String str19 = station0.getState();
    station0.setLatitude(100.0d);
    java.lang.String str22 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test348"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setState("hi!");
    java.lang.String str11 = station0.getName();
    double d12 = station0.getLongitude();
    station0.setState("");
    java.lang.String str15 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test349"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("");
    station0.setLatitude(100.0d);
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test350"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    station0.setLongitude(100.0d);
    station0.setLatitude(1.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getId();
    station0.setLongitude(1.0d);
    double d18 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test351"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(1.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    station0.setId("");
    java.lang.String str13 = station0.getName();
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test352"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    double d12 = station0.getLatitude();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test353"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    station0.setId("");
    java.lang.String str10 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test354"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getId();
    station0.setLongitude(100.0d);
    double d15 = station0.getLatitude();
    java.lang.String str16 = station0.getName();
    double d17 = station0.getLongitude();
    double d18 = station0.getLongitude();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 100.0d);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test355"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    station0.setState("hi!");
    station0.setId("hi!");
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test356"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setId("");
    station0.setId("");
    double d22 = station0.getLongitude();
    java.lang.String str23 = station0.getId();
    java.lang.String str24 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test357"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    java.lang.String str14 = station0.getId();
    station0.setId("");
    station0.setId("hi!");
    station0.setId("hi!");
    java.lang.String str21 = station0.getState();
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test358"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setName("hi!");
    station0.setState("");
    station0.setLongitude(1.0d);
    java.lang.String str13 = station0.getName();
    station0.setId("");
    double d16 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test359"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setLatitude(0.0d);
    station0.setLongitude(100.0d);
    station0.setId("");
    java.lang.String str15 = station0.getState();
    station0.setLongitude(10.0d);
    java.lang.String str18 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test360"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setId("");
    java.lang.String str10 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test361"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getState();
    station0.setName("");
    double d9 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test362"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    station0.setId("");
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test363"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude((-1.0d));
    station0.setLongitude(0.0d);
    double d9 = station0.getLongitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test364"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    java.lang.String str5 = station0.getState();
    station0.setLongitude(10.0d);
    java.lang.String str8 = station0.getName();
    station0.setId("hi!");
    java.lang.String str11 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test365"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getState();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test366"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    double d14 = station0.getLatitude();
    java.lang.String str15 = station0.getName();
    java.lang.String str16 = station0.getId();
    double d17 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test367"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getId();
    station0.setState("");
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getState();
    station0.setState("");
    station0.setName("");
    station0.setName("");
    station0.setName("hi!");
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test368"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test369"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test370"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    java.lang.String str8 = station0.getId();
    station0.setState("hi!");
    double d11 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test371"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setName("");
    station0.setLongitude(0.0d);
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test372"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setId("");
    java.lang.String str7 = station0.getName();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test373"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setName("hi!");
    java.lang.String str14 = station0.getId();
    station0.setLatitude(100.0d);
    station0.setId("");
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test374"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setLatitude(10.0d);
    station0.setLongitude(0.0d);
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLatitude();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test375"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setName("hi!");
    station0.setState("");
    station0.setName("");
    station0.setState("");
    station0.setLongitude(10.0d);
    double d17 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test376"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    java.lang.String str12 = station0.getState();
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test377"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude((-1.0d));
    station0.setLatitude(1.0d);
    java.lang.String str14 = station0.getName();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test378"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getName();
    station0.setLongitude(0.0d);
    double d6 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test379"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getId();
    station0.setLongitude(100.0d);
    java.lang.String str9 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test380"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setName("");
    station0.setLatitude(0.0d);
    station0.setLatitude((-1.0d));
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test381"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setName("hi!");
    station0.setState("");
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test382"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLatitude((-1.0d));
    double d11 = station0.getLongitude();
    station0.setId("");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test383"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    double d7 = station0.getLongitude();
    station0.setState("");
    station0.setName("");
    double d12 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test384"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    double d14 = station0.getLatitude();
    station0.setId("hi!");
    double d17 = station0.getLongitude();
    station0.setLongitude(0.0d);
    java.lang.String str20 = station0.getState();
    station0.setName("");
    double d23 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test385"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str6 = station0.getState();
    station0.setLatitude(0.0d);
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test386"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    java.lang.String str12 = station0.getId();
    station0.setLongitude((-1.0d));
    java.lang.String str15 = station0.getId();
    station0.setId("hi!");
    java.lang.String str18 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test387"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    double d11 = station0.getLongitude();
    station0.setName("");
    double d14 = station0.getLongitude();
    station0.setName("hi!");
    station0.setName("hi!");
    double d19 = station0.getLongitude();
    java.lang.String str20 = station0.getState();
    double d21 = station0.getLongitude();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 100.0d);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test388"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setLatitude(0.0d);
    java.lang.String str24 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test389"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getState();
    java.lang.String str10 = station0.getId();
    station0.setId("hi!");
    java.lang.String str13 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test390"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLongitude();
    station0.setLongitude(10.0d);
    java.lang.String str14 = station0.getId();
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test391"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLatitude();
    double d11 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    station0.setLongitude(0.0d);
    java.lang.String str18 = station0.getState();
    double d19 = station0.getLongitude();
    station0.setId("");
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test392"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(100.0d);
    station0.setState("");
    java.lang.String str10 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test393"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getId();
    station0.setLongitude(100.0d);
    double d15 = station0.getLongitude();
    station0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test394"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLongitude(100.0d);
    station0.setState("hi!");
    double d13 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test395"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setState("hi!");
    station0.setId("");
    station0.setLatitude(100.0d);
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test396"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setLatitude(0.0d);
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test397"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    double d10 = station0.getLongitude();
    station0.setLatitude(1.0d);
    station0.setState("");
    java.lang.String str15 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test398"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setLatitude(0.0d);
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test399"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setName("hi!");
    station0.setState("");
    station0.setLongitude(1.0d);
    station0.setName("");
    java.lang.String str15 = station0.getId();
    java.lang.String str16 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test400"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setName("");
    station0.setName("hi!");
    java.lang.String str13 = station0.getName();
    double d14 = station0.getLatitude();
    double d15 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test401"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setState("hi!");
    station0.setLatitude(10.0d);
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test402"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getName();
    double d9 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test403"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    java.lang.String str8 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test404"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getState();
    station0.setState("hi!");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test405"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getName();
    double d13 = station0.getLatitude();
    double d14 = station0.getLongitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test406"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    double d9 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getName();
    double d14 = station0.getLatitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test407"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getName();
    station0.setLatitude(1.0d);
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test408"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str10 = station0.getId();
    station0.setState("hi!");
    station0.setLatitude(100.0d);
    double d15 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test409"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    station0.setLatitude((-1.0d));
    double d13 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test410"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setLatitude(10.0d);
    station0.setLongitude(0.0d);
    java.lang.String str11 = station0.getState();
    double d12 = station0.getLongitude();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test411"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test412"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setLatitude(10.0d);
    double d16 = station0.getLatitude();
    station0.setLongitude(10.0d);
    java.lang.String str19 = station0.getId();
    java.lang.String str20 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test413"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getId();
    station0.setState("");
    java.lang.String str11 = station0.getState();
    station0.setLatitude(1.0d);
    java.lang.String str14 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test414"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    station0.setId("");
    java.lang.String str11 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test415"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getName();
    java.lang.String str8 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test416"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setId("");
    double d7 = station0.getLongitude();
    station0.setId("");
    double d10 = station0.getLongitude();
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test417"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str10 = station0.getId();
    double d11 = station0.getLongitude();
    double d12 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str15 = station0.getId();
    station0.setState("hi!");
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test418"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setState("");
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getState();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test419"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    double d8 = station0.getLongitude();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    java.lang.String str11 = station0.getId();
    station0.setLatitude(0.0d);
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test420"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test421"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLatitude();
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    double d10 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(0.0d);
    java.lang.String str15 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test422"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getId();
    station0.setLongitude(1.0d);
    station0.setName("");
    double d17 = station0.getLatitude();
    java.lang.String str18 = station0.getState();
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test423"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    station0.setLatitude(10.0d);
    double d16 = station0.getLatitude();
    station0.setLongitude(10.0d);
    station0.setLatitude(1.0d);
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test424"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getName();
    double d10 = station0.getLatitude();
    double d11 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test425"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    double d14 = station0.getLatitude();
    station0.setId("hi!");
    double d17 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("hi!");
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test426"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLatitude(100.0d);
    java.lang.String str12 = station0.getId();
    station0.setLatitude(100.0d);
    station0.setLatitude((-1.0d));
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test427"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setLatitude((-1.0d));
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test428"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getId();
    station0.setState("");
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getState();
    double d14 = station0.getLongitude();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test429"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    station0.setLongitude(0.0d);
    station0.setLongitude(1.0d);
    java.lang.String str20 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test430"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getId();
    double d16 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test431"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getName();
    station0.setLatitude((-1.0d));
    double d10 = station0.getLongitude();
    double d11 = station0.getLatitude();
    station0.setLongitude((-1.0d));
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test432"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    java.lang.String str7 = station0.getState();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test433"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getState();
    station0.setState("");
    java.lang.String str9 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test434"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("");
    station0.setLongitude(0.0d);
    station0.setLatitude(10.0d);
    java.lang.String str13 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test435"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLongitude();
    double d11 = station0.getLatitude();
    double d12 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str15 = station0.getState();
    double d16 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test436"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str10 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test437"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str10 = station0.getId();
    double d11 = station0.getLongitude();
    double d12 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str15 = station0.getId();
    double d16 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test438"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str11 = station0.getName();
    java.lang.String str12 = station0.getState();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    double d16 = station0.getLatitude();
    java.lang.String str17 = station0.getId();
    double d18 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test439"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setLongitude(0.0d);
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test440"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setName("hi!");
    station0.setState("");
    java.lang.String str11 = station0.getState();
    station0.setName("");
    station0.setLongitude(0.0d);
    java.lang.String str16 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test441"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    java.lang.String str6 = station0.getState();
    java.lang.String str7 = station0.getName();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test442"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    java.lang.String str5 = station0.getState();
    double d6 = station0.getLatitude();
    station0.setLongitude(1.0d);
    java.lang.String str9 = station0.getState();
    station0.setId("");
    java.lang.String str12 = station0.getName();
    station0.setId("");
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test443"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setId("");
    station0.setLatitude((-1.0d));
    double d12 = station0.getLatitude();
    station0.setName("hi!");
    station0.setName("");
    java.lang.String str17 = station0.getState();
    station0.setLatitude(0.0d);
    double d20 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test444"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLatitude();
    station0.setState("");
    station0.setLatitude((-1.0d));
    station0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test445"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLongitude();
    java.lang.String str11 = station0.getName();
    station0.setId("hi!");
    double d14 = station0.getLatitude();
    double d15 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test446"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setId("");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getId();
    station0.setId("hi!");
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test447"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    double d10 = station0.getLatitude();
    station0.setId("hi!");
    station0.setId("");
    java.lang.String str15 = station0.getName();
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test448"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setState("hi!");
    java.lang.String str10 = station0.getId();
    double d11 = station0.getLatitude();
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getState();
    station0.setLatitude((-1.0d));
    java.lang.String str16 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test449"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setId("hi!");
    java.lang.String str11 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test450"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    java.lang.String str6 = station0.getState();
    double d7 = station0.getLongitude();
    station0.setLongitude(100.0d);
    station0.setId("hi!");
    java.lang.String str12 = station0.getName();
    station0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test451"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setName("");
    java.lang.String str10 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test452"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    java.lang.String str7 = station0.getName();
    double d8 = station0.getLongitude();
    double d9 = station0.getLongitude();
    java.lang.String str10 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test453"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test454"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setLongitude((-1.0d));
    station0.setLatitude(10.0d);
    station0.setState("hi!");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test455"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setName("");
    station0.setName("hi!");
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getId();
    station0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test456"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    double d12 = station0.getLatitude();
    station0.setId("");
    double d15 = station0.getLongitude();
    java.lang.String str16 = station0.getId();
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test457"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    double d8 = station0.getLatitude();
    station0.setName("");
    double d11 = station0.getLatitude();
    java.lang.String str12 = station0.getName();
    double d13 = station0.getLatitude();
    station0.setLongitude(1.0d);
    station0.setLongitude(100.0d);
    station0.setState("");
    station0.setLatitude(10.0d);
    java.lang.String str22 = station0.getId();
    double d23 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 10.0d);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test458"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    double d6 = station0.getLongitude();
    java.lang.String str7 = station0.getId();
    station0.setState("hi!");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test459"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setLongitude(10.0d);
    double d8 = station0.getLongitude();
    station0.setId("");
    double d11 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test460"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getState();
    station0.setState("hi!");
    station0.setState("hi!");
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test461"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setId("hi!");
    double d9 = station0.getLongitude();
    station0.setLatitude(100.0d);
    station0.setLatitude(100.0d);
    java.lang.String str14 = station0.getState();
    double d15 = station0.getLatitude();
    station0.setLongitude(100.0d);
    station0.setLongitude(1.0d);
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test462"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    station0.setLongitude(1.0d);
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setName("hi!");
    double d15 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test463"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    double d7 = station0.getLongitude();
    station0.setLongitude(100.0d);
    station0.setState("");
    station0.setId("");
    station0.setState("");
    java.lang.String str16 = station0.getId();
    station0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test464"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    station0.setName("hi!");
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    double d11 = station0.getLongitude();
    station0.setName("");
    double d14 = station0.getLongitude();
    station0.setName("hi!");
    station0.setName("hi!");
    double d19 = station0.getLongitude();
    station0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 100.0d);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test465"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setState("hi!");
    java.lang.String str11 = station0.getName();
    double d12 = station0.getLatitude();
    station0.setName("hi!");
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test466"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    double d5 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getId();
    station0.setState("");
    java.lang.String str11 = station0.getState();
    java.lang.String str12 = station0.getState();
    station0.setLatitude(1.0d);
    station0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test467"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    double d7 = station0.getLongitude();
    station0.setName("");
    station0.setState("hi!");
    double d12 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test468"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    station0.setLongitude(10.0d);
    double d5 = station0.getLatitude();
    station0.setName("hi!");
    java.lang.String str8 = station0.getState();
    station0.setState("hi!");
    station0.setState("hi!");
    java.lang.String str13 = station0.getState();
    java.lang.String str14 = station0.getState();
    station0.setName("");
    java.lang.String str17 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test469"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getName();
    station0.setLongitude(0.0d);
    station0.setLatitude(0.0d);
    java.lang.String str10 = station0.getState();
    double d11 = station0.getLongitude();
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test470"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getId();
    station0.setLongitude(1.0d);
    java.lang.String str15 = station0.getState();
    double d16 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test471"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLongitude(0.0d);
    station0.setId("hi!");
    java.lang.String str5 = station0.getName();
    station0.setName("hi!");
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test472"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setId("");
    double d7 = station0.getLongitude();
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getId();
    station0.setId("hi!");
    double d12 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test473"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    java.lang.String str4 = station0.getState();
    station0.setId("");
    double d7 = station0.getLongitude();
    station0.setId("");
    station0.setName("");
    station0.setState("");
    station0.setId("hi!");
    java.lang.String str16 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test474"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setState("");
    station0.setState("");
    station0.setState("hi!");

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test475"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setId("");
    java.lang.String str12 = station0.getState();
    station0.setName("hi!");
    double d15 = station0.getLatitude();
    station0.setLongitude(100.0d);
    double d18 = station0.getLongitude();
    station0.setLongitude(10.0d);
    station0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 100.0d);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test476"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    station0.setId("");
    double d11 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    station0.setId("hi!");
    java.lang.String str18 = station0.getState();
    station0.setLatitude((-1.0d));
    java.lang.String str21 = station0.getName();
    java.lang.String str22 = station0.getId();
    station0.setLatitude(1.0d);
    java.lang.String str25 = station0.getId();
    java.lang.String str26 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test477"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    java.lang.String str6 = station0.getId();
    station0.setId("");
    station0.setLatitude(100.0d);
    java.lang.String str11 = station0.getId();
    java.lang.String str12 = station0.getName();
    station0.setLatitude(10.0d);
    station0.setName("");
    station0.setName("");
    java.lang.String str19 = station0.getId();
    station0.setId("hi!");
    java.lang.String str22 = station0.getState();
    station0.setLatitude(10.0d);
    double d25 = station0.getLatitude();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 10.0d);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test478"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    double d14 = station0.getLatitude();
    java.lang.String str15 = station0.getName();
    java.lang.String str16 = station0.getId();
    station0.setId("");
    station0.setState("");
    station0.setState("");
    double d23 = station0.getLongitude();
    java.lang.String str24 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test479"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setName("hi!");
    station0.setId("hi!");
    double d12 = station0.getLatitude();
    double d13 = station0.getLongitude();
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test480"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    double d5 = station0.getLongitude();
    double d6 = station0.getLatitude();
    station0.setName("");
    station0.setName("hi!");
    station0.setId("");
    station0.setId("hi!");
    station0.setLatitude(0.0d);
    java.lang.String str17 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test481"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    java.lang.String str7 = station0.getId();
    station0.setName("hi!");
    station0.setId("hi!");
    station0.setId("hi!");
    java.lang.String str14 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test482"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("hi!");
    java.lang.String str6 = station0.getName();
    station0.setLatitude(100.0d);
    double d9 = station0.getLatitude();
    java.lang.String str10 = station0.getId();
    double d11 = station0.getLatitude();
    station0.setLatitude(1.0d);
    java.lang.String str14 = station0.getState();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test483"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    java.lang.String str12 = station0.getId();
    station0.setLongitude((-1.0d));
    station0.setLongitude((-1.0d));
    double d17 = station0.getLatitude();
    java.lang.String str18 = station0.getId();
    station0.setName("");
    double d21 = station0.getLatitude();
    java.lang.String str22 = station0.getState();
    double d23 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test484"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    double d8 = station0.getLatitude();
    station0.setLatitude(1.0d);
    station0.setLatitude(1.0d);
    double d13 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 1.0d);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test485"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str8 = station0.getState();
    station0.setName("");
    double d11 = station0.getLongitude();
    station0.setLatitude(0.0d);
    station0.setState("hi!");
    double d16 = station0.getLatitude();
    station0.setState("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test486"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    double d6 = station0.getLongitude();
    station0.setLatitude(0.0d);
    java.lang.String str9 = station0.getId();
    station0.setLongitude(100.0d);
    station0.setLatitude(0.0d);
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getState();
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test487"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setLongitude(0.0d);
    station0.setId("");
    double d14 = station0.getLatitude();
    java.lang.String str15 = station0.getName();
    java.lang.String str16 = station0.getId();
    station0.setId("");
    station0.setId("hi!");
    station0.setLatitude(100.0d);
    station0.setState("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test488"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    java.lang.String str6 = station0.getState();
    station0.setState("hi!");
    station0.setLatitude(0.0d);
    station0.setId("hi!");
    station0.setId("");
    station0.setName("hi!");
    double d17 = station0.getLongitude();
    station0.setName("");
    station0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test489"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setName("hi!");
    java.lang.String str8 = station0.getName();
    java.lang.String str9 = station0.getState();
    double d10 = station0.getLatitude();
    station0.setState("");
    double d13 = station0.getLongitude();
    double d14 = station0.getLatitude();
    java.lang.String str15 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test490"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    station0.setId("");
    java.lang.String str5 = station0.getId();
    station0.setId("");
    double d8 = station0.getLatitude();
    station0.setState("hi!");
    station0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test491"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    station0.setId("hi!");
    station0.setLatitude(0.0d);
    double d16 = station0.getLatitude();
    station0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test492"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLongitude(100.0d);
    station0.setName("");
    java.lang.String str14 = station0.getState();
    java.lang.String str15 = station0.getName();
    station0.setId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test493"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    java.lang.String str3 = station0.getId();
    double d4 = station0.getLatitude();
    station0.setLatitude(1.0d);
    station0.setName("");
    station0.setName("hi!");
    java.lang.String str11 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test494"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLongitude(0.0d);
    java.lang.String str8 = station0.getState();
    double d9 = station0.getLongitude();
    station0.setState("hi!");
    station0.setState("hi!");
    java.lang.String str14 = station0.getId();
    double d15 = station0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test495"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    station0.setName("hi!");
    double d7 = station0.getLongitude();
    station0.setId("hi!");
    station0.setLongitude(100.0d);
    java.lang.String str12 = station0.getName();
    java.lang.String str13 = station0.getId();
    java.lang.String str14 = station0.getId();
    station0.setState("");
    java.lang.String str17 = station0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test496"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLatitude(10.0d);
    java.lang.String str8 = station0.getId();
    java.lang.String str9 = station0.getName();
    java.lang.String str10 = station0.getState();
    double d11 = station0.getLongitude();
    station0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test497"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    java.lang.String str10 = station0.getId();
    station0.setLongitude(100.0d);
    java.lang.String str13 = station0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test498"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    station0.setName("hi!");
    station0.setLongitude(1.0d);
    double d8 = station0.getLatitude();
    java.lang.String str9 = station0.getState();
    station0.setLatitude(1.0d);
    double d12 = station0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test499"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setId("");
    double d3 = station0.getLongitude();
    station0.setId("");
    station0.setLongitude(1.0d);
    station0.setName("");
    java.lang.String str10 = station0.getId();
    java.lang.String str11 = station0.getId();
    double d12 = station0.getLongitude();
    java.lang.String str13 = station0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","StationTest.test500"); }


    com.dlt.weather.model.Station station0 = new com.dlt.weather.model.Station();
    station0.setLatitude(0.0d);
    double d3 = station0.getLongitude();
    double d4 = station0.getLongitude();
    java.lang.String str5 = station0.getId();
    station0.setLatitude(10.0d);
    station0.setLatitude(0.0d);
    double d10 = station0.getLatitude();
    java.lang.String str11 = station0.getState();
    station0.setId("hi!");
    java.lang.String str14 = station0.getId();
    station0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

}
