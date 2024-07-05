package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("alien1")
@Scope("prototype")
@Lazy
public class Alien {
    public Alien(){
        System.out.println("object created  Alien!");
    }


    @Value("215")
    int age;


    // @Autowired -- field injection
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

    // setter injection
    @Autowired
    //@Qualifier("name_of_bean") or we can use @Primary on target class
    public void setcom(Computer com){
        this.com = com;
    }
    public void getcom(){
        System.out.println(this.com.toString());
    }
}
