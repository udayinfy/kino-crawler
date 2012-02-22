
package com.mycompany.crawler;

/**
 * @author Adorian
 * Interface do polaczenia sie z Baza danych
 */
public interface DBConnectionInterface {


    public boolean isConnectionPossible();
    public boolean connect(String URL);
    public String getActualPage();


}
