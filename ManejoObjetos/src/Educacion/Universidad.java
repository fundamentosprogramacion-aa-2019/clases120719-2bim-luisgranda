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
public class Universidad {
    private String nombre;
    private Carrera [] listCarreras;
    
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerListCarreras(Carrera [] lista){
         listCarreras = lista;
    }
    
     public String obtenerNombre(){
        return nombre; 
    }
    public Carrera [] obtenerListCarreras(){
        return listCarreras;
    }
}
