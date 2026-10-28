/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/

// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class Evento {
    
    // definicion de los atributos privados de la clase
    private String codigoEvento;
    private String nombre;
    private String fecha;
    private String ubicacion;
    private int contadorModificaciones; 
    
    //constructor vacio
    public Evento(){
        this.codigoEvento = "EVENTO-000";
        this.nombre = "Por Asignar";
        this.fecha = "01/01/2026";
        this.ubicacion = "Sede Central";
        this.contadorModificaciones = 0;
    } //final de constructor vacio
    
    //constructor con parametros
    public Evento(String codigoEvento, String nombre, String fecha, String ubicacion){
        this.codigoEvento = codigoEvento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.contadorModificaciones = 0;
    } //final de constructor con parametros
    
    public String getCodigoEvento() {
        return this.codigoEvento;
    } //final de getCodigoEvento
    
    public void setCodigoEvento(String codigoEvento) {
        this.codigoEvento = codigoEvento;
        this.contadorModificaciones++;
    } //final de setCodigoEvento
    
    public String getNombre() {
        return this.nombre;
    } // final de getNombre
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.contadorModificaciones++;
    } //final de setNombre
    
    public String getFecha() {
        return this.fecha;
    } // final de getFecha
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
        this.contadorModificaciones++;
    } // final de setFecha
    
    public String getUbicacion() {
        return this.ubicacion;
    } // final de getUbicacion
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        this.contadorModificaciones++;
    } // final de setUbicacion
    
    public int getContadorModificaciones() {
        return this.contadorModificaciones;
    } // final de getContadorModificaciones
    
    @Override
    public String toString(){
        String textoObjeto = "Referencia: [" + this.codigoEvento 
                + "] | Torneo: " + this.nombre 
                + " | Fecha: " + this.fecha 
                + " | Complejo: " + this.ubicacion 
                + " | Cambios: " + this.contadorModificaciones;
        return textoObjeto;
    } //final de tostring
    
} // final de Evento
