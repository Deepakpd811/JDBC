package com.bridgelab;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void printlist(List<EmployeePayroll> list) {
        System.out.println(list.size());
        for (EmployeePayroll x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {


        try {
            // set-up connection
            DbServices db = DbServices.getInstance();

            //List of employee by range
            List<EmployeePayroll> employeesByDateRange = db.getEmployeesByDateRange("2018-01-01", "2025-01-01");

            printlist(employeesByDateRange);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
