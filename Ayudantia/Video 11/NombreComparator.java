/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema11;

import java.util.Comparator;

/**
 *
 * @author juan
 */
public class NombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona obj1, Persona obj2){
        Persona per1 = (Persona)obj1;
        Persona per2 = (Persona)obj2;
        
        return per1.getNombre().compareTo(per2.getNombre());
    }
    
}
