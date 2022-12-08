package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger();
        robot1.setModelName("Striker Eureka");
        robot1.setMark("Mark-5");
        robot1.setOrigin("Australia");
        robot1.setHeight(76.2F);
        robot1.setWeight(1.850F);
        robot1.setStrength(10);
        robot1.setArmor(9);

        Jaeger robot2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2F, 1.722F, 8, 6);
        // Вывод информации о первом роботе
        System.out.println("\tПервый робот");
        robot1.showInfo();
        robot1.setSpeed(5);
        robot1.setSpeed(0);
        System.out.println("---------------------------------------------");
        // Вывод информации о втором роботе
        System.out.println("\tВторой робот");
        robot2.showInfo();
        robot2.setSpeed(5);
        robot2.setSpeed(0);
        System.out.println("---------------------------------------------");
        // Сравниваем двух роботов
        Jaeger.toCompare(robot1, robot2);
    }
}