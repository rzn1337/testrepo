package com.company;

public class Main {

    public static void main(String[] args) {

        Employee[] objarr = new Employee[5];

        objarr[0] = new SalaryEmployee("Ali", "Rizwan", 1234.5);
        objarr[1] = new SalaryEmployee("Sakina", "Zoeb", 2234.5);
        objarr[2] = new SalaryEmployee("Simra", "Sheikh", 3234.5);
        objarr[3] = new SalaryEmployee("Hamza", "Asif", 4234.5);
        objarr[4] = new SalaryEmployee("Maria", "Rahim", 5234.5);

        for (int i = 0; i < 5; i++) {
            System.out.println(objarr[i] + "\n");
        }
    }
}
