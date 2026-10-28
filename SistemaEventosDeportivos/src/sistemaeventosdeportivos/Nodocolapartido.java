/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/

// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class Nodocolapartido {
    
    // definicion de los atributos privados
    private Partido dato;               
    private NodoColaPartidos siguiente; 
    
    // constructor vacio
    public NodoColaPartidos(){
        this.dato = null;
        this.siguiente = null;
    } // final del constructor vacio
    
    // constructor con parametros
    public NodoColaPartidos(Partido dato){
        this.dato = dato;
        this.siguiente = null;
    } // final del constructor con parametros
    
    public Partido getDato() {
        return this.dato;
    } // final de getDato
    
    public void setDato(Partido dato) {
        this.dato = dato;
    } // final de setDato
    
    public NodoColaPartidos getSiguiente() {
        return this.siguiente;
    } // final de getSiguiente
    
    public void setSiguiente(NodoColaPartidos siguiente) {
        this.siguiente = siguiente;
    } // final de setSiguiente
    
} // final de NodoColaPartidos
