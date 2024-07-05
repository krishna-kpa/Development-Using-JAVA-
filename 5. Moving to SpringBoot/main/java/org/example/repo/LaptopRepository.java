package org.example.repo;

import org.example.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved the object lap : "+lap.toString());
    }
}
