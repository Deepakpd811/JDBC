package com.bridgelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbServices {

    // method to set up connection to database
    public static Connection connection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "admin";
        return  DriverManager.getConnection(jdbcUrl, username, password) ;
    }

    // method to update employee salary
    public boolean updateEmployeeSalary(String name, double newSalary) {
        String updateSQL = "UPDATE employee_payroll SET salary = ? WHERE name = ?";
        try (Connection conn = connection();
             PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

            pstmt.setDouble(1, newSalary);
            pstmt.setString(2, name);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }











}
