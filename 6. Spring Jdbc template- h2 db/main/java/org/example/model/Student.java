package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rollNo;
    private String name;
    private int mark;
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString(){
        return "Roll NO : "+this.getRollNo()+" Name : "+this.getName()+"  Mark : "+this.getMark();
    }


}
