package com.infobasic.restapitemplate.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe specializzata nella gestione della connessione
 * al Database (Driver, User, Password ....)
 */
public class ConnectionManager {
    
    static Connection connection; 
    private static String dbAddress = "jdbc:postgresql://localhost:5432/databasename";
    private static String userName = "postgresql"; 
    private static String password = "postgresql"; 

    public static Connection getConnetion(){

        if(connection != null)
            return connection; 

        String driverClassName = "org.postgresql.Driver"; 

        try {
            Class.forName(driverClassName); //carico il Driver nella JVM
            
            connection = DriverManager.getConnection(dbAddress, userName, password); 
            
            if( connection == null)
                System.out.println("Connection null"); 

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }


        return connection; 

    }

}
