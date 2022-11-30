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
        System.out.println("Модель робота: " + robot1.getModelName());
        System.out.println("Марк робота: " + robot1.getMark());
        System.out.println("Произведен в: " + robot1.getOrigin());
        System.out.println("Рост робота: " + robot1.getHeight());
        System.out.println("Вес робота: " + robot1.getWeight());
        System.out.println("Мощность робота: " + robot1.getStrength());
        System.out.println("Уровень защиты робота: " + robot1.getArmor());
        robot1.setSpeed(5);
        robot1.setSpeed(0);
        System.out.println("---------------------------------------------");
        // Вывод информации о втором роботе
        System.out.println("\tВторой робот");
        System.out.println("Модель робота: " + robot2.getModelName());
        System.out.println("Марк робота: " + robot2.getMark());
        System.out.println("Произведен в: " + robot2.getOrigin());
        System.out.println("Рост робота: " + robot2.getHeight());
        System.out.println("Вес робота: " + robot2.getWeight());
        System.out.println("Мощность робота: " + robot2.getStrength());
        System.out.println("Уровень защиты робота: " + robot2.getArmor());
        robot2.setSpeed(5);
        robot2.setSpeed(0);
        System.out.println("---------------------------------------------");
        // Сравниваем двух роботов
        Jaeger.toCompare(robot1, robot2);
    }
}