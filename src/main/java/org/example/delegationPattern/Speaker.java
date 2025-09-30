package org.example.delegationPattern;

// Цей патерн Delegation (Делегування) використовується для передачі виконання певних завдань іншому об'єкту.
// Це дозволяє розділити обов'язки або відповідальність між різними класами та уникнути дублювання коду.
// В нашому випадку клас Speaker лише відповідає за відтворення звуку, тоді як клас Computer делегує це завдання об'єкту Speaker.
public class Speaker {
    public void playSound(String sound) {
        System.out.println("Відтворення звуку: " + sound);
    }
}
