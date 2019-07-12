/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;
/**
 *
 * @author Granda
 */
public class Asignatura {
    private String nombre;
    private String horario;
    private int creditos;
    private Docente docente;
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerHorario(String n){
        horario = n;
    }
    public void establecerCreditos(int n){
        creditos = n;
    }
    public void establecerDocente(Docente d){
        docente = d;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerHorario(){
        return horario;
    }
    public int obtenerCreditos(){
        return creditos;
    }
    public Docente obtenerDocente(){
        return docente;
    }
}
