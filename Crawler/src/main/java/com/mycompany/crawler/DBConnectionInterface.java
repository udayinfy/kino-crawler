
package com.mycompany.crawler;

import java.io.IOException;

/**
 * @author Adorian
 * Interface do polaczenia sie z Baza danych
 */
public interface DBConnectionInterface {


    public boolean isConnectionPossible();
    public void Connect(String site);
    public String getActualPage();
    public void ReadPage() throws IOException;


}
