package org.example.interfacePattern;

// Цей клас реалізує інтерфейс Peripheral для навушників.
// Він надає конкретну реалізацію методів connect() та disconnect(), які визначені в інтерфейсі Peripheral.
public class Headset implements Peripheral {
    @Override
    public void connect() {
        System.out.println("Навушники підключені через роз'єм 3.5мм");
    }

    @Override
    public void disconnect() {
        System.out.println("Навушники відключені");
    }
}
