package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        // Создаем волка
        Wolf wolf1 = new Wolf();
        // Присваиваем поля с помощью setter новому волку
        wolf1.setName("Белый клык");
        wolf1.setSex("Самец");
        wolf1.setCoatСolor("Белый");
        wolf1.setWeight(33.5);
        wolf1.setAge(9);
        // Выводим информацию о волке с помощью getter
        System.out.println("Имя волка: " + wolf1.getName());
        System.out.println("Пол волка: " + wolf1.getSex());
        System.out.println("Окрас волка: " + wolf1.getCoatСolor());
        System.out.println("Вес волка: " + wolf1.getWeight());
        System.out.println("Возраст волка: " + wolf1.getAge());
        // Методы волка
        wolf1.sit();
        wolf1.walk();
        wolf1.run();
        wolf1.hunt();
        wolf1.howl();
    }
}