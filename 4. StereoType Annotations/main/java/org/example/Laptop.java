package org.example;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype") //won't create object until it is required, multiple objects possible by prototype.
public class Laptop implements Computer {
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
    @Override
    public void compile(){
        System.out.println("Compile using Laptop");
    }
}
