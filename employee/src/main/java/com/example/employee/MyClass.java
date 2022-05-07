package com.example.employee;

public class MyClass {

    private int employeeNo;
    private String employeeName;
    private int employeeSalary;

    public MyClass(int employeeNo, String employeeName, int employeeSalary) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String toString() {
        return employeeNo+" "+employeeName+" "+employeeSalary;
    }
}