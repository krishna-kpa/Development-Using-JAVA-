package org.example;


public class Alien {
    public Alien(){
        System.out.println("object created  Alien!");
    }
    int age =0;
    Computer com;
    public void code(){
        com.compile();
        System.out.println("Coding !");
    }
    public void getAge(){
        System.out.println(this.age);
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setcom(Computer com){
        this.com = com;
    }
    public void getcom(){
        System.out.println(this.com.toString());
    }
}
