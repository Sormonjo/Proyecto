package Feedback1;

//Tipo de dato abstracto que contiene una variable llamada pila que almacena objeto/s en un array y una variable llamda capacidad que da información sobre el numero de objetos que contiene el array
abstract public class Pila {

    Object[] pila;
    int capacidad;

    //Contructor vacío
    public Pila(){
        this.pila= new Object[0];
        this.capacidad = -1;
    }

    //Contructor con capacidad
    public Pila(int arg_tope){
        this.pila = new Object[arg_tope];
        this.capacidad = arg_tope;
    }

    //Get con tamaño de la pila
    public int getSizePila(){
        return this.capacidad;
    }

    //Metodo para saber si la pila esta vacia
    public boolean IsEmpty(){
        return this.capacidad == -1;
    }

    //Metodo para obtener el elemento cima de la pila
    public Object ElementoCima(){
        return this.pila[0];
    }

    //Metodo para insertar un elemento en la cima de la pila
    public void insertarElementoCima(int objeto){
        if (this.capacidad == -1) {
            this.capacidad = 0;
        }
        this.capacidad++;

        Object[] newpila = new Object[this.capacidad];
        newpila[0] = objeto;
        if (this.pila.length - 1 >= 0) System.arraycopy(this.pila, 0, newpila, 1, this.pila.length);
        this.pila = newpila;
    }

    //Metodo para eliminar el elemento cima de la pila
    public void EliminarElementoCima(){
        //Caso que la pila este vacia
        if (this.capacidad == -1) return;
        capacidad--;
        
        //Caso que la pila solo tenga un elemento
        if (this.capacidad == 0) {
            this.capacidad = -1;
            this.pila= new Object[0];
            return;
        }
        
        Object[] newpila = new Object[this.capacidad];
        System.arraycopy(this.pila, 1, newpila, 0, newpila.length  );
        this.pila = newpila;
    }
}
