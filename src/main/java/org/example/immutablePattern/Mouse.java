package org.example.immutablePattern;

// Цей паттерн Immutable (Незмінний) використовується для створення об'єктів, які не можуть бути змінені після їх створення.
// Це забезпечує безпеку та передбачуваність поведінки об'єктів цього класу.
// Наприклад, клас Mouse є незмінним, оскільки всі його поля є приватними та фінальними, і не існує методів для їх зміни після створення об'єкта.
public class Mouse {
    private final String model;
    private final int dpi;

    public Mouse(String model, int dpi) {
        this.model = model;
        this.dpi = dpi;
    }

    public String getModel() {
        return model;
    }

    public int getDpi() {
        return dpi;
    }
}
