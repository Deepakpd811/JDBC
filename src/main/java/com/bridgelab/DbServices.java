package com.bridgelab;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DbServices {

    public static Connection connection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "admin";
        return  DriverManager.getConnection(jdbcUrl, username, password) ;
    }



    private  List<EmployeePayroll> mapSetToObject(ResultSet rs) throws SQLException {
        List<EmployeePayroll> list = new ArrayList<>();

        while (rs.next()) {

            LocalDate date = rs.getDate("start_date").toLocalDate();

            list.add(new EmployeePayroll(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getDouble("salary"), date));
        }
        return list;
    }


    public List<EmployeePayroll> getAllEmployee(){

        List<EmployeePayroll> emplist = new ArrayList<>();

        String query = "select * from employee_payroll";

        try{
            Connection conn= connection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            emplist = mapSetToObject(rs);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return emplist;

    }




}
