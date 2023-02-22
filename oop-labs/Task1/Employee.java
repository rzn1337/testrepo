package com.company;

public abstract class Employee {

    private String fname;
    private String lname;

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public abstract double earnings();

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String toString() {
        return ("First Name: " + getFname() + "\n" + "Last Name: " + getLname());
    }
}
