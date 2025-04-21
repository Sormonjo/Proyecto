package Feedback1;

public class Pieza {
    String tipo;
    String color;

    public Pieza(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    @Override
    public String toString() {
        return tipo + " " + color;
    }

    /**public boolean PuedeMoverse(String movimiento){
        //Ca2-c3
    }**/
}
