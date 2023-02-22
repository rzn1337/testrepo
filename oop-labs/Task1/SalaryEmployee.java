package com.company;

public class SalaryEmployee extends Employee {
    private double weeklySalary;

    public SalaryEmployee(String fname, String lname, double weeklySalary) {
        super(fname, lname);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double earnings() {

        return (weeklySalary * 4);
    }

    public String toString() {
        return ( super.toString() + "\n" + "Weekly Salary: " + getWeeklySalary() + "\n" + "Earnings: " + earnings());
    }
}
