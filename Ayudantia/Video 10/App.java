/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class App {
    public static void main (String[]args){
       
     List<String> lista = new ArrayList();
     lista.add("jaime");
     lista.add("mitocode");
     lista.add("AAA");
     
     Collections.sort(lista);
     Collections.reverse(lista);
     //ejemplo
     List<String>letras = new ArrayList();
     App ap = new App();
     ap.llenarLista(letras);
     Collections.sort(letras);
     System.out.println(letras);
    }
    public void llenarLista(List letras){
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese cualquier letra");
            String l = intro.nextLine();
            letras.add(l);
        }
    }
}
