/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class PaisDAOlmpl {
    private PaisDAOlmpl(){
    
    }
    public static PaisDAOlmpl instancia = null;

    public static PaisDAOlmpl getInstance() {
        if (instancia == null) {
            instancia = new PaisDAOlmpl();
        }
        return instancia;
    }

    private static List paises = null;

    public static List getPaises() {
        if (paises == null) {
            paises = new ArrayList();
            Pais p1 = new Pais("Peru");
            Pais p2 = new Pais("Mexico");
            Pais p3 = new Pais("Colombia");
            paises.add(p1);
            paises.add(p2);
            paises.add(p3);
        }
        return paises;
    }
}
