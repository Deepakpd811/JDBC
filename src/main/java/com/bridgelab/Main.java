package com.bridgelab;

public class Main {

    public static void main(String[] args) {


        try {

            DbServices db = DbServices.getInstance();







        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
