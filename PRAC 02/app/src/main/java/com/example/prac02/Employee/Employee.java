package com.example.prac02.Employee;

public class Employee {
    private int id;
    private String fullName;
    private String birthDate;
    private double salary;

    public Employee(int id, String fullName, String birthDate, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Họ và tên: " + fullName + ", Ngày sinh: " + birthDate + ", Lương: " + salary;
    }
}
