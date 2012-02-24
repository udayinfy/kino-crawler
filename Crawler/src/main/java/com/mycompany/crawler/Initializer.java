package com.mycompany.crawler;

import java.util.StringTokenizer;
import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Initializer 
{
    public static void main( String[] args ) throws IOException
    {
       String newLine;
       URL url = null;
       URLConnection urlConn = null;
       InputStreamReader  inStream = null;
       BufferedReader buffor = null;
        try {
            url = new URL("http://www.wp.pl");
            urlConn = url.openConnection();
            inStream = new InputStreamReader(urlConn.getInputStream());
            buffor= new BufferedReader(inStream);
            while (true){
            newLine =buffor.readLine();  
            if (newLine !=null){
                System.out.println(newLine); 
            }
            else{
               break;
            } 

            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Initializer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
