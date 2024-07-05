package org.example.service;

import org.example.model.Laptop;
import org.example.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository lapRepo;
    public void addLaptop(Laptop lap){
        System.out.println("add service invoked");
        // calling repository
        lapRepo.save(lap);
    }
}
