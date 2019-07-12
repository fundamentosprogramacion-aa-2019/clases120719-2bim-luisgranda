/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoUniversidad;
import Educacion.Carrera;
import Educacion.Ciclo;
import Educacion.Universidad;
/**
 *
 * @author Granda
 */
public class ManejoUniversidad {
    public static void main(String[] args) {
        Universidad un = new Universidad();
        Carrera computacion = new Carrera();
        Carrera electronica = new Carrera();
        Carrera quimica = new Carrera();
        
        Ciclo []  listaCiclos1 = new Ciclo[2];
        Ciclo []  listaCiclos2 = new Ciclo[2];
        Ciclo []  listaCiclos3 = new Ciclo[2];
        
        Carrera [] listaCarreras = new Carrera[3];
        
        Ciclo c1 = new Ciclo();
        Ciclo c2 = new Ciclo();
        Ciclo c3 = new Ciclo();
        Ciclo c4 = new Ciclo();
        Ciclo c5 = new Ciclo();
        Ciclo c6 = new Ciclo();
        
        c1.establecerNombre("Primer Ciclo Computación");
        c1.establecerNumeroAlumnos(20);
        c2.establecerNombre("Segundo Ciclo Computación");
        c2.establecerNumeroAlumnos(25);
        
        c3.establecerNombre("Primer Ciclo electrónica");
        c3.establecerNumeroAlumnos(10);
        c4.establecerNombre("Segundo Ciclo electrónica");
        c4.establecerNumeroAlumnos(15);
        
        c5.establecerNombre("Primer Ciclo Química");
        c5.establecerNumeroAlumnos(10);
        c6.establecerNombre("Segundo Ciclo Química");
        c6.establecerNumeroAlumnos(20);
        
        listaCiclos1[0] = c1;
        listaCiclos1[1] = c2;
        
        listaCiclos2[0] = c3;
        listaCiclos2[1] = c4;
        
        listaCiclos3[0] = c5;
        listaCiclos3[1] = c6;
        
        computacion.establecerNombre("Ciencias de la Computación");
        computacion.establecerlistaCiclos(listaCiclos1);
        
        electronica.establecerNombre("Electrónica");
        electronica.establecerlistaCiclos(listaCiclos2);
        
        quimica.establecerNombre("Química");
        quimica.establecerlistaCiclos(listaCiclos3);
        
        listaCarreras[0] = computacion;
        listaCarreras[1] = electronica;
        listaCarreras[2] = quimica;
        
        un.establecerNombre("UTPL");
        un.establecerListCarreras(listaCarreras);
        //un.establecerAlumnosUniversidad();
        
        String reporte = "";
        reporte = String.format("Universidad: %s\n", un.obtenerNombre());
            for (int i = 0; i < un.obtenerListCarreras().length; i++) {
                reporte = String.format("%s\tCarrera: %s\n", 
                        reporte, un.obtenerListCarreras()[i].obtenerNombre());
            
            for (int j = 0; j < un.obtenerListCarreras()[i].obtenerListaCiclos().length; j++){
                reporte = String.format("%s\t\tCiclo: %s\n", reporte, 
                        un.obtenerListCarreras()[i].obtenerListaCiclos()[j].obtenerNombre());
            }  
            }      
        
        System.out.println(reporte);
        
    }
    
}

/*for (int i = 0; i < un.obtenerListCarreras().length; i++) {
            reporte = String.format("%s\tCarrera: %s\n\t\tCiclo: %s\n\t\t"
                    + "Ciclo: %s\n", 
                    reporte, un.obtenerListCarreras()[i].obtenerNombre(),
                    c1.obtenerNombre(), c2.obtenerNombre());
  */        