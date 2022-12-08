package com.startjava.lesson_2_3.animal;

public class Wolf {
    
    private String name;
    private String sex;
    private String coatСolor;
    private double weight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCoatСolor() {
        return coatСolor;
    }

    public void setCoatСolor(String coatСolor) {
        this.coatСolor = coatСolor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Задан некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void walk() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}