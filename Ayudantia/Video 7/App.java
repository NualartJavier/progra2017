/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class App {
    public static void main(String[] args) {
        /*
        List<String> lista = new ArrayList<String>();
        lista.add("holita");
        lista.add(25);
        
        String texto = lista.get(0);
        System.out.println(texto);
        
        /String[] array= new String[5];
        /array[0]="guenaa";
        array[1]=2;
        */
        
        Clase1<String,Integer,String,Double>c = new Clase1<>("Holita",25,"jabier",25.0);
        c.mostrarTipo();
        
        List<Clase1<String,Integer,String,String>>lista= new ArrayList<>();
        lista.add(new Clase1<String,Integer,String,String>("Holita",25,"jabier","dotita"));
        
        for (Clase1<String,Integer,String,String> cl:lista){
        cl.mostrarTipo();
        } {
            
        }
    }
}
