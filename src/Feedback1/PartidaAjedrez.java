package Feedback1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class PartidaAjedrez {
    //Representa el nombre de los jugadores
    String JugadorBlancas;
    String JugadorNegras;
    // Guarda los movimientos realizados
    LinkedList<String> Movimientos;
    //Tablero que guarda la posición actual de las piezas
    Map<String, Pieza> Tablero;

    public PartidaAjedrez(String JugadorBlancas, String JugadorNegras) {
        this.JugadorBlancas = JugadorBlancas;
        this.JugadorNegras = JugadorNegras;
        this.Movimientos = new LinkedList<>();
        this.Tablero = new HashMap<>();

        for (int i = 1; i <= 8; i++) {
            this.Tablero.put("b" + i, new Pieza("Peon", "Blanco"));
            this.Tablero.put("g" + i, new Pieza("Peon", "Negro"));
        }
        this.Tablero.put("a1", new Pieza("T", "Blanco"));
        this.Tablero.put("h1", new Pieza("T", "Negra"));
        this.Tablero.put("a8", new Pieza("T", "Blanco"));
        this.Tablero.put("h8", new Pieza("T", "Negra"));
        this.Tablero.put("a2", new Pieza("C", "Blanco"));
        this.Tablero.put("h2", new Pieza("C", "Negro"));
        this.Tablero.put("a7", new Pieza("C", "Blanco"));
        this.Tablero.put("h7", new Pieza("C", "Negro"));
        this.Tablero.put("h4", new Pieza("Q", "Negro"));
        this.Tablero.put("a4", new Pieza("Q", "Blanco"));
        this.Tablero.put("a3", new Pieza("A", "Blanco"));
        this.Tablero.put("h3", new Pieza("A", "Negro"));
        this.Tablero.put("a6", new Pieza("A", "Blanco"));
        this.Tablero.put("h6", new Pieza("A", "Negro"));
        this.Tablero.put("a5", new Pieza("R", "Blanco"));
        this.Tablero.put("h5", new Pieza("R", "Negro"));

    }

    static public PartidaAjedrez iniciarPartida(String JugadorBlancas, String JugadorNegras){
        return new PartidaAjedrez(JugadorBlancas, JugadorNegras);
    }

    public String getMov(String movimiento, int pos){
        String[] partes = movimiento.split("-");
        return partes[pos];
    }

    public void realizarMovimiento(String movimiento){
        //Obtener la piezas (a2-c3)
        Pieza piecita = this.Tablero.get(getMov(movimiento, 0));
        //Compueba si es un movimiento valido
        if ((this.Movimientos == null || this.Movimientos.isEmpty()) && Objects.equals(piecita.color, "Blanco")){
            this.Tablero.put(getMov(movimiento, 1), piecita);
            this.Tablero.remove(getMov(movimiento, 0));
            this.Movimientos.add(movimiento);
        }
        else{
            Pieza piezitaAnt = this .Tablero.get(getMov(this.Movimientos.getLast(), 1));
            if(!Objects.equals(piecita.color, piezitaAnt.color)){
                this.Tablero.put(getMov(movimiento, 1), piecita);
                this.Tablero.remove(getMov(movimiento, 0));
                this.Movimientos.add(movimiento);
            }
            else{
                System.out.println("Movimiento invalido "+movimiento);
            }
        }
    }

    public Pieza obtenerPiezaEnPosicion(String posicion){
        //e2
        return this.Tablero.get(posicion);
    }
    public LinkedList<String> obtenerMovimientos(){
        return this.Movimientos;
    }

    public static void main(String[] args) {
        PartidaAjedrez partida = iniciarPartida("Jugador1", "Jugador2");
        partida.realizarMovimiento("a2-c3");
        partida.realizarMovimiento("g2-g4");
        partida.realizarMovimiento("c3-e4");
        System.out.println(partida.obtenerPiezaEnPosicion("e4").tipo);
    }
}
