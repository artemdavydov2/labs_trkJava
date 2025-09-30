package org.example.interfacePattern;

// Цей патерн Interface (Інтерфейс) використовується для визначення набору методів, які повинні бути реалізовані класами, що імплементують цей інтерфейс.
// Патерн визначає саме що має робити клас, але не визначає як саме це має бути зроблено.
// Наприклад, інтерфейс Peripheral визначає методи connect() та disconnect(), які повинні бути реалізовані класами Keyboard та Headset.
public interface Peripheral {
    void connect();
    void disconnect();
}
