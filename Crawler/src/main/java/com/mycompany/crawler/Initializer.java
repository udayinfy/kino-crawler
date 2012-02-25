package com.mycompany.crawler;

import java.io.IOException;




public class Initializer 
{
    public static void main( String[] args ) throws IOException
    {
       InternetConnection a = new InternetConnection();
       a.Connect("http:\\www.wp.pl");
       //a.ReadPage();
       System.out.println(a.ActualURL());
    }
}
