package org.example;

public class Laptop {
    public Laptop() {
        System.out.println("Object created for Laptop !");
    }
    int price = 0;

    public void getPrice() {
        System.out.println(this.price);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
