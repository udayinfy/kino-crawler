package com.mycompany.crawler;

import java.io.*;
import java.net.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Initializer 
{
    public static void main( String[] args ) throws IOException
    {      

         
         URL url = null;
 	  URLConnection urlConn = null;
 	  InputStreamReader  inStream = null;
 	  BufferedReader buffor = null;
 	  try {
 	    url = new URL("http://www.wp.pl");
            urlConn = url.openConnection();
            inStream = new InputStreamReader(urlConn.getInputStream());
            buffor= new BufferedReader(inStream);
            String newLine;
            int linki=0;
             while (true){
               newLine =buffor.readLine();
               
               if (newLine !=null){
                //System.out.println(newLine); -- samo wypisywanie zawartosci strony
                String a,b;
                
                  StringTokenizer token1 = new StringTokenizer(newLine," "); // - dziele zczytana linie na slowa
                   while(token1.hasMoreTokens()){
                        a=token1.nextToken();
                        if(a.contains("href=")){
                      StringTokenizer token2 = new StringTokenizer(a,"\""); //- jezeli slowo zawiera href dziele po "
                      
                        while(token2.hasMoreTokens()){
                            token2.nextToken();  //-- omijam 1 slowo ( bylo by to "href="
                            System.out.println(token2.nextToken()); //-- wypisuje nastepne slowo ( czyli zawartosc cudzyslowia - link)
                            linki++;
                            break;
                        }
                        }
                   }
               }
               else{
                 System.out.print("\n "+linki);  
                 break;
                    } 

              }
        }catch (IOException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }catch(java.util.NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }
}
