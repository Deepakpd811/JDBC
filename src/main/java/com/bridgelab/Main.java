package com.bridgelab;

public class Main {

    public static void main(String[] args) {


        try {

            DbServices services = new DbServices();

            DbServices.connection();





        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
