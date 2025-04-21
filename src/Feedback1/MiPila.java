package Feedback1;

// Clase concreta que extiende de la clase abstracta Pila
public class MiPila extends Pila {
    public MiPila() {
        super(); // Llama al constructor vacío de Pila
    }

    public MiPila(int capacidadInicial) {
        super(capacidadInicial); // Llama al constructor con capacidad
    }
}
