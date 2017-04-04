/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema4;

/**
 *
 * @author juan
 */
public class Clase<K> {
    
    private K objeto;
    public Clase(K objeto){
    this.objeto=objeto;
    }
    public void mostrarTipo(){
    System.out.println("K es un: "+objeto.getClass().getName());
    }
}
