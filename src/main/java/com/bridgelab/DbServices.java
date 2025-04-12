package com.bridgelab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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
    // map result set to list of employee
    private List<EmployeePayroll> mapSetToObject(ResultSet rs) throws SQLException {
        List<EmployeePayroll> list = new ArrayList<>();

        while (rs.next()) {
            System.out.println(rs.getString("name"));
            LocalDate date = rs.getDate("start_date").toLocalDate();

            list.add(new EmployeePayroll(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getDouble("salary"), date));
        }
        System.out.println(list);
        return list;
    }

}



