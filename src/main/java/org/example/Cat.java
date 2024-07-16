package org.example;

public class Cat {
    private String name;
    private int age;
    private String ownerName;

    // Конструктор, принимающий имя, возраст и имя хозяйки
    public Cat(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
    }

    // Метод для получения имени кота
    public String getName() {
        return name;
    }

    // Метод для получения возраста кота
    public int getAge() {
        return age;
    }

    // Метод для получения имени хозяйки
    public String getOwnerName() {
        return ownerName;
    }

    // Метод для мяуканья
    public void meow() {
        System.out.println(name + " мяукает");
    }

    // Метод для лакания молока
    public void drinkMilk() {
        System.out.println(name + " лакает молоко");
    }

    // Метод для скакания
    public void jump() {
        System.out.println(name + " скачет");
    }
}
