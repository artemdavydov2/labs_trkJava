package org.example.abstractSuperClass;

// Цей клас є конкретною реалізацією абстрактного класу AbstractPrinter.
// Він реалізує абстрактний метод print(), надаючи конкретну поведінку для друку тексту за допомогою лазерного принтера.
public class ModernPrinter extends AbstractPrinter {
    @Override
    public void print(String text) {
        System.out.println("Лазерний друк: " + text);
    }
}