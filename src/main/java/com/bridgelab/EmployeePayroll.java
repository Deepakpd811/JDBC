package com.bridgelab;

import java.time.LocalDate;

public class EmployeePayroll {

    private int id;
    private String name;
    private String gender;
    private double salary;
    private LocalDate date;

    EmployeePayroll(int id, String name, String gender, double salary, LocalDate date){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}