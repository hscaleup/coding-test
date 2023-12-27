package com.hscale.ln.employee;

public class Employee {

    private String department;
    private double salary;
    private boolean isFullTime;

    public Employee(String department, double salary, boolean isFullTime) {
        this.department = department;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
