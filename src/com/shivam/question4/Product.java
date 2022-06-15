package com.shivam.question4;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private String company;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    public Product(String name, double price, String company, int count) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.count = count;
    }

    public Product() {
    }


    @Override
    public boolean equals(Object o) {

        Product p1 = this;
        Product p=(Product)o;
        return p1.name.equals(p.getName()) && p1.price == p.getPrice() && p1.getCompany().equals(p.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, company);
    }
}

