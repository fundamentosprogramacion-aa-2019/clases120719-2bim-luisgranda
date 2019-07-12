/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoobjetos;
import institucion.Asignatura;
import institucion.Docente;
import institucion.Paralelo;
/**
 *
 * @author Granda
 */
public class ManejoObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear objetos docentes
        
        Docente d1 = new Docente();
        d1.establecerNombre("Rodrigo Estrada");
        d1.establecerAnioExperiencia(10);
        d1.establecerEdad(31);
        
        Docente d2 = new Docente();
        d2.establecerNombre("Jhon Calle");
        d2.establecerAnioExperiencia(10);
        d2.establecerEdad(31);
        
        
        Asignatura a1 = new Asignatura();
        a1.establecerNombre("Programacion");
        a1.establecerHorario("viernes: 08-11");
        a1.establecerCreditos(4);
        a1.establecerDocente(d1);
        
        Asignatura a2 = new Asignatura();
        a2.establecerNombre("Base de Datos");
        a2.establecerHorario("Jueves: 10-13");
        a2.establecerCreditos(3);
        a2.establecerDocente(d2);
        
        Asignatura [] lista = new Asignatura[2];
        lista[0] = a1;
        lista[1] = a2;
        
        Paralelo paraleloUno = new Paralelo();
        
        paraleloUno.establecerNombre("Paralelo A");
        paraleloUno.establecerAsignatura(lista);
        paraleloUno.establecerCreditosParalelo();
        
        
        /*for(int i = 0; i< lista.length; i++){
            //Asigantura a = lista[i];
            Asignatura a = lista[i];
            System.out.printf("Reporte del Paralelo A\n Lista de Asignaturas :\n"
                    + "Asignatura:  %s\nDocente: \n\tNombre: %s"
                    + "\n\tEdad: %d\n***\n"
                    + "Nùmero de Creditos del Paralelo : %s\n",
                    a.obtenerNombre(),
                    a.obtenerDocente().obtenerNombre(),
                    a.obtenerDocente().obtenerEdad(),
                    a.obtenerCreditos());
        }
        */
        
        /*for(int i = 0; i< lista.length; i++){
            //Asigantura a = lista[i]; ()
            //Asignatura a = lista[i];
            //System.out.printf("Asignatura:  %s\nDocente: \n\tNombre: %s"
                    //+ "\n\tEdad: %d\n",
                    //lista[i].obtenerNombre(),
                    //lista[i].obtenerDocente().obtenerNombre(),
                    //lista[i].obtenerDocente().obtenerEdad());
        }
        */
        String cadena = " ";
        cadena = String.format("%sReporte del %s\n", cadena,
                paraleloUno.obtenerNombre());
        
        for (int i = 0; i < paraleloUno.obtenerListaAsignaturas().length; i++){
            Asignatura a = paraleloUno.obtenerListaAsignaturas()[i];
            cadena = String.format("%sAsignatura:  %s\nDocente: \n\tNombre: %s"
                    + "\n\tEdad: %d\n***\n",
                    cadena,
                    a.obtenerNombre(),
                    a.obtenerDocente().obtenerNombre(),
                    a.obtenerDocente().obtenerEdad());
        }
        
        cadena = String.format("%sNúmero de Créditos del Paralelo : %.2f\n",
                cadena, paraleloUno.obtenerCreditosParalelo());
        
        System.out.printf("%s", cadena);
    }
        
    
}
