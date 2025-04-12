package com.bridgelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// singleton class to get instance of db
public class DbServices {

    // instance of db
    private static DbServices instance;
    private Connection conn;

    // constructor
    private DbServices() {
        try {
            conn = DbConnection.connection();
            System.out.println("Db connected:");

        } catch (Exception e) {
            System.out.println("Error: occur while connecting database");
        }
    }

    // public get instance method
    public static DbServices getInstance() {

        if (instance == null) {
            return new DbServices();
        }
        return instance;

    }


}
