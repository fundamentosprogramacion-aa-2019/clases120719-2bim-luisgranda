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
public class Paralelo {
    private String nombre;
    private Asignatura[] listaAsignaturas;
    private double creditosParalelo;
    
    public void establecerCreditosParalelo(){
        double suma = 0;
        for (int i = 0; i < listaAsignaturas.length; i++){
            suma = suma + listaAsignaturas[i].obtenerCreditos();
        }
        creditosParalelo = suma;
    }
    
    public double obtenerCreditosParalelo(){
        return creditosParalelo;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerAsignatura(Asignatura [] lista){
         listaAsignaturas = lista;
    }
    public String obtenerNombre(){
        return nombre; 
    }
    public Asignatura [] obtenerListaAsignaturas(){
        return listaAsignaturas;
    }
}
