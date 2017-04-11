/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema2;

import ayudantia.tema1.Alumno;
import ayudantia.tema1.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class App {

    private List canasta = new ArrayList();

    private void verificar(Object objeto) {
        if (objeto instanceof Fruta) {
            canasta.add(objeto);
            System.out.println("Fruta agregada " + ((Fruta) objeto).getNombre());
        } else {
            System.out.println("Elemento no permitido, solo frutas porfavor");
        }
    }

    public static void main(String[] args) {
        String texto = new String("holita");
        if (texto instanceof String) {
            System.out.println("Es un String");
        }
        Alumno al = new Alumno();
        if (al instanceof Persona) {
            System.out.println("Es una Persona");
        }

        System.out.println("Canasta abierta, porfavor ingresar SOLO frutas");

        Manzana m1 = new Manzana("roja");
        Manzana m2 = new Manzana("verde");
        Naranja n1 = new Naranja("Naranja sin pepas");
        Galleta g1 = new Galleta("Chocolate");

        App app = new App();
        app.verificar(m1);
        app.verificar(m2);
        app.verificar(n1);
        app.verificar(g1);
    }
}
