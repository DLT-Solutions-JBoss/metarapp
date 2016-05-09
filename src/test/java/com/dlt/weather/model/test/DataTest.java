package com.dlt.weather.model.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.dlt.weather.model.METAR;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataTest {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest.test001"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test002"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test003"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test004"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test005"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test006"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test007"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test008"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test009"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list9 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test010"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test011"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test012"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test013"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test014"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test015"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list15 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test016"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test017"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test018"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test019"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test020"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test021"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test022"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test023"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test024"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test025"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test026"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test027"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test028"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test029"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test030"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i20 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test031"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test032"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test033"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = null;
    data0.setNumResults(i15);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test034"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test035"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test036"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test037"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test038"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test039"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test040"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test041"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test042"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test043"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test044"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test045"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test046"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list18 = data0.getMETAR();
    List<METAR> list19 = data0.getMETAR();
    java.lang.Integer i20 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test047"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test048"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test049"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test050"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test051"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test052"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test053"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i13 = null;
    data0.setNumResults(i13);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test054"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test055"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + (-1)+ "'", i4.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test056"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test057"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = null;
    data0.setNumResults(i8);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test058"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test059"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test060"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test061"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test062"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test063"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test064"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test065"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test066"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test067"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test068"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test069"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i20 = data0.getNumResults();
    java.lang.Integer i21 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 100+ "'", i21.equals(100));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test070"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test071"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test072"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test073"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list20 = data0.getMETAR();
    java.lang.Integer i21 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 100+ "'", i21.equals(100));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test074"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test075"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = null;
    data0.setNumResults(i9);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test076"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test077"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test078"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test079"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test080"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test081"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test082"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test083"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test084"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test085"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test086"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = null;
    data0.setNumResults(i12);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test087"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test088"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test089"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test090"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test091"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test092"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i17 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test093"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list19 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test094"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test095"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test096"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test097"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list15 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test098"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test099"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list19 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test100"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test101"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test102"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list18 = data0.getMETAR();
    List<METAR> list19 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test103"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test104"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test105"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test106"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = null;
    data0.setNumResults(i10);
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test107"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test108"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test109"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test110"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test111"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test112"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test113"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test114"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test115"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test116"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test117"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test118"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test119"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test120"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i17 = null;
    data0.setNumResults(i17);
    List<METAR> list19 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test121"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test122"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test123"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test124"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test125"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test126"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test127"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test128"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test129"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test130"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test131"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test132"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test133"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test134"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test135"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test136"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test137"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i11 = null;
    data0.setNumResults(i11);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test138"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test139"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list16 = data0.getMETAR();
    java.lang.Integer i17 = data0.getNumResults();
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test140"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test141"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test142"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list19 = data0.getMETAR();
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test143"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test144"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test145"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test146"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test147"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = null;
    data0.setNumResults(i12);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i17 = data0.getNumResults();
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 10+ "'", i17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test148"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list19 = data0.getMETAR();
    java.lang.Integer i20 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test149"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test150"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = null;
    data0.setNumResults(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test151"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test152"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test153"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test154"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test155"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test156"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = null;
    data0.setNumResults(i13);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test157"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i21 = data0.getNumResults();
    List<METAR> list22 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 100+ "'", i21.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test158"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = null;
    data0.setNumResults(i18);
    java.lang.Integer i20 = data0.getNumResults();
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test159"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test160"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test161"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test162"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test163"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test164"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test165"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test166"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test167"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test168"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test169"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test170"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test171"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test172"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test173"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test174"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test175"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test176"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test177"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test178"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test179"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = null;
    data0.setNumResults(i18);
    java.lang.Integer i20 = data0.getNumResults();
    List<METAR> list21 = data0.getMETAR();
    List<METAR> list22 = data0.getMETAR();
    java.lang.Integer i23 = data0.getNumResults();
    java.lang.Integer i24 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test180"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test181"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test182"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test183"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test184"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i17 = data0.getNumResults();
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test185"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test186"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list19 = data0.getMETAR();
    java.lang.Integer i20 = data0.getNumResults();
    java.lang.Integer i21 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 0+ "'", i21.equals(0));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test187"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test188"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test189"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    List<METAR> list19 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test190"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test191"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test192"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list21 = data0.getMETAR();
    java.lang.Integer i22 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 0+ "'", i22.equals(0));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test193"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test194"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i15 = null;
    data0.setNumResults(i15);
    java.lang.Integer i17 = null;
    data0.setNumResults(i17);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test195"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test196"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i22 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test197"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test198"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i9 = null;
    data0.setNumResults(i9);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test199"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = null;
    data0.setNumResults(i5);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test200"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test201"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test202"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test203"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list20 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list23 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list26 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test204"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i19 = data0.getNumResults();
    java.lang.Integer i20 = data0.getNumResults();
    java.lang.Integer i21 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test205"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test206"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test207"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test208"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test209"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i23 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test210"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test211"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test212"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test213"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test214"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test215"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test216"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test217"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test218"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list20 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i23 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test219"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test220"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test221"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i18 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test222"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test223"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test224"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test225"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test226"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test227"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test228"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test229"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test230"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test231"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = null;
    data0.setNumResults(i12);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list19 = data0.getMETAR();
    List<METAR> list20 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test232"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test233"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list20 = data0.getMETAR();
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test234"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test235"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test236"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test237"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list20 = data0.getMETAR();
    List<METAR> list21 = data0.getMETAR();
    List<METAR> list22 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list25 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test238"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test239"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test240"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list18 = data0.getMETAR();
    java.lang.Integer i19 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test241"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test242"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list21 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test243"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i10 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test244"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list16 = data0.getMETAR();
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test245"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test246"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    java.lang.Integer i20 = data0.getNumResults();
    java.lang.Integer i21 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1+ "'", i21.equals(1));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test247"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test248"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test249"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test250"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test251"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test252"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test253"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test254"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = null;
    data0.setNumResults(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test255"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test256"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test257"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test258"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test259"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i20 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test260"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test261"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i22 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 0+ "'", i22.equals(0));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test262"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test263"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test264"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test265"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list18 = data0.getMETAR();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test266"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test267"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test268"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i17 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list20 = data0.getMETAR();
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test269"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test270"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test271"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = null;
    data0.setNumResults(i12);
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test272"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test273"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i14 = null;
    data0.setNumResults(i14);
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test274"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test275"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test276"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test277"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test278"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test279"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test280"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test281"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test282"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test283"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test284"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test285"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test286"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test287"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test288"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test289"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test290"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list17 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i20 = data0.getNumResults();
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test291"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test292"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test293"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test294"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test295"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test296"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list21 = data0.getMETAR();
    java.lang.Integer i22 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 10+ "'", i22.equals(10));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test297"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list19 = data0.getMETAR();
    List<METAR> list20 = data0.getMETAR();
    List<METAR> list21 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test298"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = null;
    data0.setNumResults(i11);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test299"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test300"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test301"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test302"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = null;
    data0.setNumResults(i16);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i20 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test303"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test304"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test305"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test306"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test307"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test308"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list22 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test309"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test310"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test311"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list18 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test312"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = null;
    data0.setNumResults(i10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test313"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = null;
    data0.setNumResults(i9);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test314"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test315"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test316"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test317"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test318"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test319"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test320"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test321"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test322"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test323"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test324"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list16 = data0.getMETAR();
    java.lang.Integer i17 = null;
    data0.setNumResults(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test325"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test326"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test327"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test328"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = null;
    data0.setNumResults(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test329"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test330"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test331"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i16 = null;
    data0.setNumResults(i16);
    java.lang.Integer i18 = data0.getNumResults();
    List<METAR> list19 = data0.getMETAR();
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test332"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = null;
    data0.setNumResults(i16);
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test333"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test334"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test335"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list19 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test336"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test337"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test338"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test339"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test340"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list18 = data0.getMETAR();
    List<METAR> list19 = data0.getMETAR();
    List<METAR> list20 = data0.getMETAR();
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test341"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i20 = null;
    data0.setNumResults(i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test342"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test343"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test344"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i19 = null;
    data0.setNumResults(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test345"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    java.lang.Integer i17 = data0.getNumResults();
    List<METAR> list18 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test346"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test347"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test348"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test349"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test350"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test351"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test352"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test353"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list22 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i25 = data0.getNumResults();
    List<METAR> list26 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 0+ "'", i25.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test354"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test355"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test356"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = null;
    data0.setNumResults(i11);
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test357"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test358"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test359"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test360"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test361"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test362"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test363"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test364"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test365"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test366"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test367"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test368"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test369"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test370"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test371"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test372"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 10+ "'", i17.equals(10));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test373"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test374"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test375"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test376"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i20 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 10+ "'", i20.equals(10));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test377"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test378"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i16 = null;
    data0.setNumResults(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test379"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test380"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test381"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test382"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test383"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test384"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test385"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test386"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test387"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test388"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test389"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list16 = data0.getMETAR();
    java.lang.Integer i17 = data0.getNumResults();
    List<METAR> list18 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test390"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test391"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test392"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = null;
    data0.setNumResults(i16);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test393"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test394"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test395"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test396"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test397"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test398"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test399"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test400"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test401"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test402"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i13 = null;
    data0.setNumResults(i13);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test403"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test404"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test405"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test406"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list18 = data0.getMETAR();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test407"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test408"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list19 = data0.getMETAR();
    List<METAR> list20 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test409"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test410"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test411"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test412"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test413"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test414"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test415"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test416"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test417"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i15 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test418"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test419"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list18 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i21 = data0.getNumResults();
    List<METAR> list22 = data0.getMETAR();
    List<METAR> list23 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test420"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list20 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list23 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list26 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test421"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test422"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test423"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test424"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test425"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test426"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test427"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test428"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test429"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = null;
    data0.setNumResults(i10);
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test430"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test431"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test432"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test433"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test434"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test435"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test436"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test437"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test438"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test439"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test440"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i19 = data0.getNumResults();
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test441"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test442"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list14 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test443"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list20 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list23 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i26 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 10+ "'", i26.equals(10));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test444"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test445"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    List<METAR> list1 = data0.getMETAR();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test446"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test447"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test448"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test449"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test450"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i18 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test451"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i14 = null;
    data0.setNumResults(i14);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i20 = data0.getNumResults();
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test452"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test453"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i23 = data0.getNumResults();
    java.lang.Integer i24 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 1+ "'", i23.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 1+ "'", i24.equals(1));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test454"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = null;
    data0.setNumResults(i13);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test455"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test456"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i17 = data0.getNumResults();
    java.lang.Integer i18 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test457"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    List<METAR> list17 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test458"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test459"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test460"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i20 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test461"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test462"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test463"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    java.lang.Integer i17 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 1+ "'", i10.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test464"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list22 = data0.getMETAR();
    java.lang.Integer i23 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 10+ "'", i23.equals(10));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test465"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test466"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test467"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test468"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i17 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 10+ "'", i17.equals(10));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test469"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list4 = data0.getMETAR();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test470"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test471"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list20 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i23 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test472"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list7 = data0.getMETAR();
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list14 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test473"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test474"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test475"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i16 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test476"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    List<METAR> list14 = data0.getMETAR();
    List<METAR> list15 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i20 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list23 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test477"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    java.lang.Integer i13 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test478"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i14 = data0.getNumResults();
    java.lang.Integer i15 = data0.getNumResults();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    java.lang.Integer i19 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test479"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list19 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test480"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i15 = null;
    data0.setNumResults(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test481"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list17 = data0.getMETAR();
    List<METAR> list18 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test482"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list12 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i15 = data0.getNumResults();
    List<METAR> list16 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    List<METAR> list19 = data0.getMETAR();
    java.lang.Integer i20 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test483"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test484"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i7 = data0.getNumResults();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test485"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)0);
    java.lang.Integer i10 = data0.getNumResults();
    List<METAR> list11 = data0.getMETAR();
    List<METAR> list12 = data0.getMETAR();
    List<METAR> list13 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test486"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i8 = data0.getNumResults();
    List<METAR> list9 = data0.getMETAR();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test487"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i5 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    java.lang.Integer i11 = data0.getNumResults();
    java.lang.Integer i12 = data0.getNumResults();
    List<METAR> list13 = data0.getMETAR();
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    java.lang.Integer i20 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test488"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    List<METAR> list3 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i15 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test489"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list15 = data0.getMETAR();
    java.lang.Integer i16 = data0.getNumResults();
    List<METAR> list17 = data0.getMETAR();
    java.lang.Integer i18 = data0.getNumResults();
    java.lang.Integer i19 = data0.getNumResults();
    List<METAR> list20 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test490"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test491"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = data0.getNumResults();
    java.lang.Integer i7 = data0.getNumResults();
    List<METAR> list8 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)1);
    List<METAR> list13 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list20 = data0.getMETAR();
    List<METAR> list21 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test492"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = null;
    data0.setNumResults(i2);
    java.lang.Integer i4 = data0.getNumResults();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    List<METAR> list7 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test493"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = null;
    data0.setNumResults(i4);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list9 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test494"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list6 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)(-1));
    data0.setNumResults((java.lang.Integer)100);
    java.lang.Integer i11 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i14 = data0.getNumResults();
    List<METAR> list15 = data0.getMETAR();
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test495"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    List<METAR> list2 = data0.getMETAR();
    java.lang.Integer i3 = data0.getNumResults();
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)100);
    data0.setNumResults((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test496"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    List<METAR> list8 = data0.getMETAR();
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    List<METAR> list12 = data0.getMETAR();
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    data0.setNumResults((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test497"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list4 = data0.getMETAR();
    List<METAR> list5 = data0.getMETAR();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)(-1));
    java.lang.Integer i9 = data0.getNumResults();
    java.lang.Integer i10 = data0.getNumResults();
    java.lang.Integer i11 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 10+ "'", i6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test498"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i4 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)0);
    List<METAR> list7 = data0.getMETAR();
    java.lang.Integer i8 = data0.getNumResults();
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1+ "'", i4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test499"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    java.lang.Integer i2 = data0.getNumResults();
    List<METAR> list3 = data0.getMETAR();
    java.lang.Integer i4 = data0.getNumResults();
    java.lang.Integer i5 = data0.getNumResults();
    java.lang.Integer i6 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    java.lang.Integer i9 = data0.getNumResults();
    List<METAR> list10 = data0.getMETAR();
    List<METAR> list11 = data0.getMETAR();
    java.lang.Integer i12 = data0.getNumResults();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","DataTest0.test500"); }


    com.dlt.weather.model.Data data0 = new com.dlt.weather.model.Data();
    java.lang.Integer i1 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)1);
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i6 = null;
    data0.setNumResults(i6);
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list10 = data0.getMETAR();
    data0.setNumResults((java.lang.Integer)1);
    java.lang.Integer i13 = data0.getNumResults();
    data0.setNumResults((java.lang.Integer)10);
    List<METAR> list16 = data0.getMETAR();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

}
