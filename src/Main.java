import Feedback1.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Crear una pila vacía
        MiPila pila = new MiPila();
        System.out.println("¿Está vacía?: " + pila.IsEmpty());

        // Inserta elementos y muestra si está vacio, el tamaño de la pila y el elemento en la cima
        pila.insertarElementoCima(10);
        pila.insertarElementoCima('2');
        pila.insertarElementoCima(15);
        System.out.println("¿Está vacía después de insertar?: " + pila.IsEmpty());
        System.out.println("Tamaño de la pila: " + pila.getSizePila());
        System.out.println("Elemento en la cima: " + pila.ElementoCima());

        // Elimina un elemento y comprueba que se ha eliminado, despues vacia pila y lo comprueba de nuevo
        pila.EliminarElementoCima();
        System.out.println("Elemento en la cima tras eliminar: " + pila.ElementoCima());
        System.out.println("Tamaño actual: " + pila.getSizePila());
        pila.EliminarElementoCima();
        pila.EliminarElementoCima();

        System.out.println("¿Está vacía después de eliminar todo?: " + pila.IsEmpty());
        System.out.println("Tamaño final: " + pila.getSizePila());
    }
}
