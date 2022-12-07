package com.dongtaidaili.bin;

public class Student implements Person{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void wakeup() {
//        Person.super.wakeup();
        System.out.println("student类");
    }

    @Override
    public void sleep() {
//        Person.super.sleep();
        System.out.println("student");

    }

}
