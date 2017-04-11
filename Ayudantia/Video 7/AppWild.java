/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class AppWild {
    public void listarUpperBounded(List<? extends Persona> lista){
        for (Persona per: lista) {
            
            System.out.println(per.getNombre());
            
        }
    }
    public void listarLowerBounded(List<? super Alumno> lista){
        for (Object per: lista) {
            
            System.out.println(((Alumno)per).getNombre());
            
        }
    }
    public void listarUnBounded(List<?> lista){
        for (Object al: lista) {
            
            System.out.println(((Persona)al).getNombre());
            
        }
    }
    public static void main(String[]args){
    AppWild aw= new AppWild();
    
    Persona al1= new Profesor("jabier");
    Persona al2= new Profesor("jhabier");
    Persona al3= new Profesor("javhier");
    
    List<Persona> lista = new ArrayList<>();
    lista.add(al1);
    
    lista.add(al2);
    lista.add(al3);
    
    aw.listarLowerBounded(lista);
    System.out.println();
    aw.listarUpperBounded(lista);
    System.out.println();
    aw.listarUnBounded(lista);
    }
}
