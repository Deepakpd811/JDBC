package com.bridgelab;

public class Main {

        public static void main(String[] args) {


        try {
            // set the connection
            DbServices.connection();

            DbServices db = new DbServices();

            // update terisa salary
            db.updateEmployeeSalary("Terisa",300000);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}