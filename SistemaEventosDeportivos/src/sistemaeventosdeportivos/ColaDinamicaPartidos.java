/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/

// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class ColaDinamicaPartidos {
    
    // definicion de los atributos privados
    private NodoColaPartidos frente; // puntero al inicio de la cola (primer partido a jugar)
    private NodoColaPartidos fin;    // puntero al final de la cola (ultimo partido ingresado)
    private int tamanioCola;         // contador interno de partidos programados
    
    // constructor vacio
    public ColaDinamicaPartidos(){
        this.frente = null;
        this.fin = null;
        this.tamanioCola = 0;
    } // final del constructor vacio
    
    // metodo para verificar si la cola se encuentra vacia
    public boolean isEmpty(){
        boolean resultado = false;
        if (this.frente == null) {
            resultado = true;
        } else {
            resultado = false;
        } // final de if else
        return resultado;
    } // final de isEmpty
    
    public void encolar(Partido nuevoPartido){
        NodoColaPartidos nuevoNodo = new NodoColaPartidos(nuevoPartido);
        
        if (isEmpty() == true) {
            this.frente = nuevoNodo;
            this.fin = nuevoNodo;
        } else {
            this.fin.setSiguiente(nuevoNodo);
            this.fin = nuevoNodo;
        } // final de if else
        
        this.tamanioCola++;
        System.out.println("PROGRAMACION DE PARTIDO EXITOSA: Partido " + nuevoPartido.getCodigoPartido() + " agregado a la cola.");
    } // final de encolar
    
    public Partido desencolar(){
        Partido partidoAtendido = null;
        
        if (isEmpty() == true) {
            System.out.println("!ALERTA¡: La cola de partidos esta vacia. No hay eventos por atender.");
        } else {
            partidoAtendido = this.frente.getDato();
            this.frente = this.frente.getSiguiente();
            
            if (this.frente == null) {
                this.fin = null;
            } // final de if
            
            this.tamanioCola--;
            System.out.println("PARTIDO ATENDIDO: Se ha procesado el evento.");
        } // final de if else
        
        return partidoAtendido;
    } // final de desencolar
    
    // metodo tradicional para mostrar el calendario de partidos sin alterar la cola
    public void mostrarCalendario(){
        if (isEmpty() == true) {
            System.out.println("[ALERTA]: No hay partidos programados en el calendario actual.");
        } else {
            NodoColaPartidos actual = this.frente;
            int posicion = 1;
            System.out.println("*****CALENDARIO DE PARTIDOS*****");
            while (actual != null) {
                System.out.println(posicion + ". " + actual.getDato());
                actual = actual.getSiguiente();
                posicion++;
            } // final de while
        } // final de if else
    } // final de mostrarCalendario
    
    public int getTamanioCola() {
        return this.tamanioCola;
    } //final de getTamanioCola
    
} // final de ColaDinamicaPartidos
