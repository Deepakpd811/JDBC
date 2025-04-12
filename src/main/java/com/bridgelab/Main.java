package com.bridgelab;

import java.util.List;

public class Main {

    public static void printlist(List<EmployeePayroll> list) {
        for (EmployeePayroll x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {


        try {
            // set the connection
            DbServices.connection();

            DbServices db = new DbServices();

            // get all employee payroll
            List<EmployeePayroll> employees = db.getAllEmployee();
            printlist(employees);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
