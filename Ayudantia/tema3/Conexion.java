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
public class Conexion {
    private static Conexion instancia = null;
    
    public static Conexion getInstance(){
        if(instancia == null){
        instancia = new Conexion();
        }
        return instancia;
    }
    private Conexion(){
    
    }
}
