/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/
// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class Nodolistadoble {
    
    private Participante dato;   
    private NodoListaDoble siguiente; 
    private NodoListaDoble anterior;   
    
    // define el constructor vacio
    public NodoListaDoble(){
        this.dato = null;
        this.siguiente = null;
        this.anterior = null;
    } // final del constructor vacio
    
    // define el constructor con parametros
    public NodoListaDoble(Participante dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    } // final del constructor con parametros
    
    // metodos getters y setters
    public Participante getDato() {
        return this.dato;
    } // final de getDato
    
    public void setDato(Participante dato) {
        this.dato = dato;
    } // final de setDato
    
    public NodoListaDoble getSiguiente() {
        return this.siguiente;
    } // final de getSiguiente
    
    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    } // final de setSiguiente
    
    public NodoListaDoble getAnterior() {
        return this.anterior;
    } // final de getAnterior
    
    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    } // final de setAnterior
    
} // final de NodoListaDoble
