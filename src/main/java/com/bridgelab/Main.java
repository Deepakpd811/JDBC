package com.bridgelab;

public class Main {

    public static void main(String[] args) {


        try {
            // set the connection
            DbServices.connection();

            DbServices services = new DbServices();

            // update employee salary
            boolean rowSuccess = services.updateEmployeeSalary("Deepak",150000);
            System.out.println("Update: successfully " + rowSuccess);




        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
