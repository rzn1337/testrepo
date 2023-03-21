package Task2;

import Task2.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < authors.length; i++) {
            s += authors[i].toString() + ", ";
        }
        return (name + ", " + s + getPrice() + ", " + getQty());
    }

    public String getAuthorNames() {
        String s = "";
        for (int i = 0; i < authors.length; i++) {
            s += authors[i].getName() + ", ";
        }
        return s;
    }
}
