/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema3;

/**
 *
 * @author juan
 */
public class App {

    public static void main(String[] args) {
        /*
        
        PaisDAOlmpl dao = new PaisDAOlmpl();
        for (Object obj : dao.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
        System.out.println("***************");
        for (Object obj : dao.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
        
        PaisDAOlmpl daoi = new PaisDAOlmpl();
        System.out.println("***************");
        for (Object obj : daoi.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
         */
        //con Singleton correcto   
        PaisDAOlmpl dao = PaisDAOlmpl.getInstance();
        for (Object obj : PaisDAOlmpl.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
        for (Object obj : dao.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
         PaisDAOlmpl daoi = PaisDAOlmpl.getInstance();
        for (Object obj : daoi.getPaises()) {
            System.out.println(((Pais) obj).getNombre());
        }
    }
}
