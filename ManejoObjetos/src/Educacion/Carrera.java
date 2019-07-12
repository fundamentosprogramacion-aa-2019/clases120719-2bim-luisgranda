/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Educacion;

/**
 *
 * @author Granda
 */
public class Carrera {
    private String nombre;
    private Ciclo [] listaCiclos;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerlistaCiclos(Ciclo []  lista){
         listaCiclos = lista;
    }
    
     public String obtenerNombre(){
        return nombre; 
    }
    public Ciclo [] obtenerListaCiclos(){
        return listaCiclos;
    }
}
