/*****************************************
* universidad fidelitas                  *
* curso: estructura de datos             *
* autor: Yuliana Alvarado Herrera        *
* Nombre: sistemaeventosdeportivos.java  *          
* Fecha:                                 *
******************************************/
// define el paquete al cual pertenece la clase
package sistemaeventosdeportivos;

public class Partido {
    
    // definicion de los atributos privados
    private String codigoPartido;
    private String equipoLocal;
    private String equipoVisitante;
    private String horario;
    
    //constructor vacio
    public Partido(){
        this.codigoPartido = "PARTIDO-000";
        this.equipoLocal = "Equipo Local por Definir";
        this.equipoVisitante = "Equipo Visitante por Definir";
        this.horario = "Horario por Programar";
    } // final del constructor vacio
    
    //constructor con parametros
    public Partido(String codigoPartido, String equipoLocal, String equipoVisitante, String horario){
        this.codigoPartido = codigoPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.horario = horario;
    } // final del constructor con parametros
    
    public String getCodigoPartido() {
        return this.codigoPartido;
    } // final de getCodigoPartido
    
    public void setCodigoPartido(String codigoPartido) {
        this.codigoPartido = codigoPartido;
    } // final de setCodigoPartido
    
    public String getEquipoLocal() {
        return this.equipoLocal;
    } // final de getEquipoLocal
    
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    } // final de setEquipoLocal
    
    public String getEquipoVisitante() {
        return this.equipoVisitante;
    } // final de getEquipoVisitante
    
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    } // final de setEquipoVisitante
    
    public String getHorario() {
        return this.horario;
    } // final de getHorario
    
    public void setHorario(String horario) {
        this.horario = horario;
    } // final de setHorario
    
    @Override
    public String toString(){
        String textoObjeto = "Partido: [" + this.codigoPartido 
                + "] | Enuentro: " + this.equipoLocal 
                + " VS " + this.equipoVisitante 
                + " | Horario: " + this.horario;
        return textoObjeto;
    } // final de tostring
    
} // final de Partido
