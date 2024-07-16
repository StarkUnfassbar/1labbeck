package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Cat
        Cat cat = new Cat("Барсик", 3, "Анастасия");

        // Тестирование методов класса Cat
        System.out.println("Имя кота: " + cat.getName());
        System.out.println("Возраст кота: " + cat.getAge() + " года");
        System.out.println("Имя хозяйки: " + cat.getOwnerName());

        // Вызов методов действий кота
        cat.meow();
        cat.drinkMilk();
        cat.jump();
    }
}