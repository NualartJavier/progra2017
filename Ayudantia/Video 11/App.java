/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author juan
 */
public class App {
    public static void main(String[] args){
    List<Persona> lista = new ArrayList<>();
    lista.add(new Persona(1,25,"Jaime"));
    lista.add(new Persona(1,15,"Mito"));
    lista.add(new Persona(1,29,"Code"));
    lista.add(new Persona(1,29,"AAA"));
    
    //Collections.sort(lista, new NombreComparator());
    Collections.sort(lista, new Comparator<Persona>() {
        @Override
        public int compare(Persona per2, Persona per1) {
           int rpta =0;
           if(per1.getEdad()> per2.getEdad()){
           rpta=1;
           }else if(per1.getEdad()< per2.getEdad()){
           rpta=-1;
           }
           return rpta;
        }
    });
    
        for (Persona p: lista) {
            System.out.println(p.getNombre());
        }
        //EJEMPLO
        
        ArrayList<Alumno> alumnos = new ArrayList();
        alumnos.add(new Alumno(12,15,"adolfo",5.6));
        alumnos.add(new Alumno(4,16,"pedro",1.6));
        alumnos.add(new Alumno(16,13,"jua",5.5));
        alumnos.add(new Alumno(43,15,"holita",7.0));
        alumnos.add(new Alumno(25,14,"jose",0));
        
        Collections.sort(alumnos, new Comparator<Alumno>() {
        @Override
        public int compare(Alumno per2, Alumno per1) {
           int rpta =0;
           if(per1.getPromedio()> per2.getPromedio()){
           rpta=1;
           }else if(per1.getPromedio()> per2.getPromedio()){
           rpta=-1;
           }
           return rpta;
        }
    });
        for (Alumno al : alumnos) {
            System.out.println(al.getNombre()+" : "+al.getPromedio());
        }
    }
}
