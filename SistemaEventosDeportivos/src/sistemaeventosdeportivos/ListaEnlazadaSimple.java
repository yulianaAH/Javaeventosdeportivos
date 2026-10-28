/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/
package sistemaeventosdeportivos;

public class ListaEnlazadaSimple {

    private NodoListaSimple cabeza; // puntero al inicio de la lista
    private int totalEventos;       // contador unico de elementos
    
    // define el constructor vacio
    public ListaEnlazadaSimpleEventos(){
        this.cabeza = null;
        this.totalEventos = 0;
    } // final del constructor vacio
    
    // metodo para verificar si la lista esta vacia
    public boolean isEmpty(){
        return (this.cabeza == null);
    } // final de isEmpty
    
    // metodo para insertar un nuevo evento al final de la estructura
    public void insertar(Evento nuevoEvento){
        NodoListaSimple nuevoNodo = new NodoListaSimple(nuevoEvento);
        
        if(isEmpty()){
            this.cabeza = nuevoNodo; 
        } else {
            NodoListaSimple actual = this.cabeza;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente(); 
            } // final de while
            actual.setSiguiente(nuevoNodo); 
        } // final de if else
        
        this.totalEventos++; // incrementa el contador de control
        System.out.println("CONTROL OPERATIVO: Evento registrado exitosamente en la lista simple.");
    } 
    
    // metodo para desplegar la lista de eventos
    public void mostrarEventos(){
        if(isEmpty()){
            System.out.println("¡ALERTA DE SISTEMA!: No se registran eventos deportivos activos en la lista.");
        } else {
            NodoListaSimple actual = this.cabeza;
            int indice = 1;
            System.out.println("******REGISTRO GENERAL DE EVENTOS DEPORTIVOS******");
            while(actual != null){
                System.out.println(indice + ". " + actual.getDato());
                actual = actual.getSiguiente();
                indice++;
            } // final de while
            System.out.println("=======================================================");
        } // final de if else
    } // final de mostrarEventos
    
    public int getTotalEventos() {
        return this.totalEventos;
    } // final de getTotalEventos
    
} // final de ListaEnlazadaSimpleEventos
