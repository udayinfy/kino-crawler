/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crawler;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kacper
 */
public class InternetConnection implements DBConnectionInterface{
       String newLine;
       URL url = null;
       URLConnection urlConn = null;
       InputStreamReader  inStream = null;
       BufferedReader buffor = null;

    public boolean isConnectionPossible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void Connect(String site) {
        
        try {
            url = new URL(site);
            urlConn = url.openConnection();
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(InternetConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    public Object find() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void ReadPage() throws IOException{
        while (true){
            newLine =buffor.readLine();  
            if (newLine !=null){
                System.out.println(newLine); 
            }
            else{
               break;
            } 

            }
    
}

    public String getActualPage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
