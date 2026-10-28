/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/

// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class NodoListaSimple {

    private Evento dato;                   // almacena la informacion del evento
    private NodoListaSimple siguiente;     // referencia al nodo sucesor
    
    // define el constructor vacio
    public NodoListaSimple(){
        this.dato = null;
        this.siguiente = null;
    } // final del constructor vacio
    
    // define el constructor con parametros
    public NodoListaSimple(Evento dato){
        this.dato = dato;
        this.siguiente = null;
    } // final del constructor con parametros
    
    // metodos getters y setters
    public Evento getDato() {
        return this.dato;
    } // final de getDato
    
    public void setDato(Evento dato) {
        this.dato = dato;
    } // final de setDato
    
    public NodoListaSimple getSiguiente() {
        return this.siguiente;
    } // final de getSiguiente
    
    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    } // final de setSiguiente
    
} // final de NodoListaSimple
