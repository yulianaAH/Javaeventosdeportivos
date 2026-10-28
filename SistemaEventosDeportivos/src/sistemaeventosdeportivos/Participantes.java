/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/
// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class Participantes {

    // definicion de los atributos privados
    private String cedula;
    private String nombre;
    private int edad;
    private String equipo;
    private boolean activo; // estado de actividad del participante
    
    // define el constructor vacio
    public Participante(){
        this.cedula = "0-0000-0000";
        this.nombre = "Participante Pendiente";
        this.edad = 0;
        this.equipo = "Sin Delegacion";
        this.activo = true;
    } // final del constructor vacio
    
    // constructor con parametros
    public Participante(String cedula, String nombre, int edad, String equipo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.activo = true;
    } // final del constructor con parametros
    
    public String getCedula() {
        return this.cedula;
    } // final de getCedula
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    } // final de setCedula
    
    public String getNombre() {
        return this.nombre;
    } // final de getNombre
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // final de setNombre
    
    public int getEdad() {
        return this.edad;
    } // final de getEdad
    
    public void setEdad(int edad) {
        this.edad = edad;
    } // final de setEdad
    
    public String getEquipo() {
        return this.equipo;
    } // final de getEquipo
    
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    } // final de setEquipo
    
    public boolean isActivo() {
        return this.activo;
    } // final de isActivo
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    } // final de setActivo
    
    @Override
    public String toString(){
       String estadoTexto = "";
        if (this.activo == true) {
            estadoTexto = "HABILITADO";
        } else {
            estadoTexto = "INACTIVO";
        } // final de if else
        String textoObjeto = "ID: " + this.cedula 
                + " | Atleta: " + this.nombre 
                + " | Edad: " + this.edad + " anos"
                + " | Club/Equipo: " + this.equipo 
                + " | Estado: [" + estadoTexto + "]";
        return textoObjeto;
    } // final de toString
    
} // final de Participante
