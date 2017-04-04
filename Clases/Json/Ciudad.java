/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

/**
 *
 * @author juan
 */
public class Ciudad {
    private int cod;
    private String nomb;
    public Ciudad(int codigo,String nombre){
    this.cod=codigo;
    this.nomb=nombre;
    }
    public Ciudad(){
    
    }
    public int getCod(){
    return this.cod;
    }
    public String getNomb(){
    return this.nomb;
    }
}
