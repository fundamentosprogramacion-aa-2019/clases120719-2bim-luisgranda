/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Educacion;

/**
 *
 * @author Luis Granda
 */
public class Ciclo {
    private String nombre;
    private int numeroAlumnos;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroAlumnos(int lista){
         numeroAlumnos = lista;
    }
    
     public String obtenerNombre(){
        return nombre; 
    }
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
}
