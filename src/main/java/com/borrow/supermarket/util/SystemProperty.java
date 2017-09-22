package com.borrow.supermarket.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;

public class SystemProperty
{
  public static String getProperty(String property)
  {
    Properties prop = new Properties();
    try {
      InputStream in = SystemProperty.class.getClassLoader().getResourceAsStream("supermarket.properties");
      InputStreamReader sr = new InputStreamReader(in, "utf-8");
      BufferedReader reader = new BufferedReader(sr);
      prop.load(reader);
    } catch (IOException e) {
      System.out.println("IOException:" + e.getMessage());
    }
    return prop.getProperty(property);
  }

  public static void main(String[] args) {
    String s = getProperty("jdbc.url");
    System.out.println(s);
  }
}