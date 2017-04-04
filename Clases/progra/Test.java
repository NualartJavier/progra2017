/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

import java.util.Vector;

/**
 *
 * @author juan
 */
public class Test {
    public static void main(String[] args) {
     SesionCineSAXParser sesion = new SesionCineSAXParser("C:\\Users\\juan\\Documents\\NetBeansProjects\\Progra\\xml.txt");
     Vector v = sesion.getSesionesPeliculas();
     SesionesPelicula ses=null;
        for (int i = 0; i < v.size(); i++) {
            ses = (SesionesPelicula)v.elementAt(i);
            
            System.out.println("Titulo: "+ses.getPelicula().getTitulo());
            System.out.println("Codigo: "+ses.getPelicula().getCodigo());
            System.out.println("Actores: "+ses.getPelicula().getActores());
            System.out.println("Director: "+ses.getPelicula().getDirector());
            for (int j = 0; j <ses.getSesionesStr().size(); j++) {
                System.out.println("Horarios");
                System.out.println(ses.getSesionesStr().get(j));
            }
        }
    
    }
}
