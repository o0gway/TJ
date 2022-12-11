package com.startjava.lesson_2_3_4.person;

public class Person {

    String name = "Vasya";
    String sex = "Male";
    double height = 1.75;
    double weight = 80.5;
    int age = 33;

    void walk() {
        System.out.println("Человек гуляет");
    }

    boolean isSit() {
        if (true) {
            System.out.println("Человек сидит");
            return true;
        } else {
            return false;
        }
    }

    void run() {
        System.out.println("Человек бежит");
    }

    void sayHello() {
        System.out.println("Человек говорит - Привет!");
    }

    String learn() {
        return "Java";
    }
}