package org.example.delegationPattern;

// Цей клас Computer використовує патерн Delegation (Делегування) для передачі завдання відтворення музики об'єкту Speaker.
// Клас Computer не реалізує самостійно логіку відтворення звуку, а делегує це завдання класу Speaker.
public class Computer {
    private Speaker speaker = new Speaker(); // Створення об'єкту Speaker для подальшого делегування

    public void playMusic(String music) {
        // Делегування відтворення музики об'єкту Speaker
        speaker.playSound(music);
    }
}
