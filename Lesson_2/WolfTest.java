public class WolfTest {
    public static void main(String[] args) {
        // Создаем волка
        Wolf wolf1 = new Wolf();
        // Присваиваем поля новому волку
        wolf1.name = "Белый клык";
        wolf1.sex = "Самец";
        wolf1.coatСolor = "Белый";
        wolf1.weight = 33.5;
        wolf1.age = 5;
        // Методы волка
        System.out.println("Имя волка: " + wolf1.name);
        System.out.println("Пол волка: " + wolf1.sex);
        System.out.println("Окрас волка: " + wolf1.coatСolor);
        System.out.println("Вес волка: " + wolf1.weight);
        System.out.println("Возраст волка: " + wolf1.age);

        wolf1.sit();
        wolf1.walk();
        wolf1.run();
        wolf1.hunt();
        wolf1.howl();
    }
}