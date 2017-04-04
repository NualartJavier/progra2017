/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class App {

    public static void main(String[] args) {
        Clase<String> c = new Clase<String>("holita");
        Clase<Integer> c1= new Clase<Integer>(20);
        c.mostrarTipo();
        c1.mostrarTipo();
    }
}
