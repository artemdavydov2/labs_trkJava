package org.example.abstractSuperClass;

// Цей патерн Abstract Class (Абстрактний клас) використовується для створення базового класу, який не може бути напряму використаний для створення об'єктів, але служить для успадкування іншими класами.
// Він може містити як абстрактні методи (без реалізації), так і методи з реалізацією.
// Наприклад, клас AbstractPrinter є абстрактним класом, який визначає загальні методи для всіх принтерів, такі як turnOn() та turnOff(), але залишає метод print() абстрактним, щоб конкретніні класи могли реалізувати його по-своєму.
public abstract class AbstractPrinter {
    public void turnOn() {
        System.out.println("Принтер увімкнено");
    }

    public void turnOff() {
        System.out.println("Принтер вимкнено");
    }

    public abstract void print(String text);
}