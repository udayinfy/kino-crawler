/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crawler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kacper
 */
public class InternetConnection implements DBConnectionInterface{
    
       URL url ;
       URLConnection urlConn;


       
       
    public boolean isConnectionPossible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void Connect(String site) {
        
        try {
            url = new URL(site);
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public URL ActualURL(){
        return url;
    }

    public Object find() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void ReadPage() {
        String newLine;
        InputStreamReader  inStream ;
        BufferedReader buffor ;
        try {
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
        } catch (IOException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public String getActualPage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
