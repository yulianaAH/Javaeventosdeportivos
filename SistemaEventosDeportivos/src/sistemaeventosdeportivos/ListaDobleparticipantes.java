/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/
// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class ListaDobleparticipantes {
    
    // definicion de los atributos privados
    private NodoListaDoble cabeza; // puntero al primer elemento de la lista
    private NodoListaDoble cola;   // puntero al ultimo elemento de la lista
    private int contadorRegistros; // registro interno de participantes almacenados
    
    // define el constructor vacio
    public ListaDobleParticipantes(){
        this.cabeza = null;
        this.cola = null;
        this.contadorRegistros = 0;
    } // final del constructor vacio
    
    // valida si la lista carece de inscripciones
    public boolean isEmpty(){
        return (this.cabeza == null);
    } // final de isEmpty
    
    // inserta un nuevo participante al final de la lista doble
    public void insertar(Participante nuevoAtleta){
    NodoListaDoble nuevoNodo = new NodoListaDoble(nuevoAtleta);
        
        if(isEmpty()){
            this.cabeza = nuevoNodo;
            this.cola = nuevoNodo;   
        } else {
            this.cola.setSiguiente(nuevoNodo); 
            nuevoNodo.setAnterior(this.cola);  
            this.cola = nuevoNodo;             
        } // final de if else
        
        this.contadorRegistros++; // incrementa la cantidad de registros
        System.out.println("[REGISTRO EXITOSO]: Atleta " + nuevoAtleta.getNombre() + " incorporado a la lista.");
    } 
    
    // lista de participantes en orden directo 
    public void mostrarHaciaAdelante(){
        if(isEmpty()){
            System.out.println("!ALERTA¡: No existen participantes inscritos en este evento.");
        } else {
            NodoListaDoble actual = this.cabeza;
            int posicion = 1;
            System.out.println("\n=*****LISTA DE PARTICIPANTES*****");
            while(actual != null){
                System.out.println(posicion + ". " + actual.getDato());
                actual = actual.getSiguiente(); 
                posicion++;
            } // final de while
        } // final de if else
    } // final de mostrarHaciaAdelante
    
    // cantidad total de registros guardados
    public int getContadorRegistros() {
        return this.contadorRegistros;
    } // final de getContadorRegistros
    
} // final de ListaDobleParticipantes