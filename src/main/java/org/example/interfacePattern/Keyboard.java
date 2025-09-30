package org.example.interfacePattern;

// Цей клас реалізує інтерфейс Peripheral для клавіатури.
// Він надає конкретну реалізацію методів connect() та disconnect(), які визнач ені в інтерфейсі Peripheral.
public class Keyboard implements Peripheral {
    @Override
    public void connect() {
        System.out.println("Клавіатура підключена через USB");
    }

    @Override
    public void disconnect() {
        System.out.println("Клавіатура відключена");
    }
}
