/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;
import com.google.gson.Gson;
/**
 *
 * @author juan
 */
public class Persona {
    
    private int edad;
    private String run;
    private Ciudad ciudResidencia;
    public Persona(){
    
    }
    public Persona(int ed,String run,Ciudad ciu){
    this.edad=ed;
    this.run=run;
    this.ciudResidencia=ciu;
    }
    public int getEdad(){
    return this.edad;
    }
    public String getRun(){
    return this.run;
    }
    public Ciudad getCiudad(){
    return this.ciudResidencia;
    }
    
    
}
