package com.bridgelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbServices {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "admin";


        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {

            if (conn.isValid(2)) {
                System.out.println("Connection is established");
            } else {
                System.out.println("Connection is not established");

            }

        } catch (Exception e ) {
            e.printStackTrace();
        }

    }

}
