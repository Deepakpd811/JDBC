package com.bridgelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbServices {

    public static Connection connection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "admin";
        return  DriverManager.getConnection(jdbcUrl, username, password) ;
    }

    








}
