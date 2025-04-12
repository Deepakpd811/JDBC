package com.bridgelab;

import java.sql.*;

public class DbServices {

    public static Connection connection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "admin";
        return  DriverManager.getConnection(jdbcUrl, username, password) ;
    }

    // method to update employee salary
    public boolean updateEmployeeSalary(String name, double newSalary) throws SQLException {
        String updateSQL = "UPDATE employee_payroll SET salary = " +newSalary+ "WHERE name =" + name;

        try (Connection conn = connection()){
            Statement stmt = conn.createStatement();

            int rowsAffected = stmt.executeUpdate(updateSQL);
            return rowsAffected == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }








}
