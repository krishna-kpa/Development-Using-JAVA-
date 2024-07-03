package org.example;

public class Alien {
    public Alien(){
        System.out.println("object created  Alien!");
    }
    int age =0;
    public void code(){
        System.out.println("Coding !");
    }
    public void getAge(){
        System.out.println(this.age);
    }
    public void setAge(int age){
        this.age = age;
    }
}
