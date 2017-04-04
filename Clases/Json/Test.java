/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
/**
 *
 * @author juan
 */
public class Test {
   
    Gson gson = new Gson();
    public static void main(String[]args){
        Test test = new Test();
        //Una persona
        Ciudad ciud = new Ciudad(111,"temuco");
        Persona persona =  new Persona(33,"11.111.111-1",ciud);
        //String json=test.toGson(persona);
        
        //Conjunto de personas
        Persona[] miArray= new Persona[]{persona,persona,persona};
        test.objetToXml(miArray);
        String jsonArray=test.GsonToString(miArray);
        //System.out.println(jsonArray);
        
        Persona[] newArray= test.toGsonArray(jsonArray);
        //System.out.println(newArray[0].getEdad());
        
    }
    public String toGson(Persona per){
    String ser=gson.toJson(per);
    return ser;
    }
    public Persona fromGson(String json){
        Persona persona = new Persona();
    persona = gson.fromJson(json, Persona.class);
    return persona;
    }
    public String GsonToString (Persona[]array){
        String ser=gson.toJson(array);
        return ser;
    }
    public void objetToXml(Persona[] per){
        System.out.println("<?xml version=\"1.0\"?>");
    for(Persona persona : per){
    String xml="<Persona>\n\t <edad>"+persona.getEdad()+"</edad>\n\t <run>"+persona.getRun()+"</run>\n\t"+ 
            "<ciudad>\n\t\t "
            + "<nombreCiudad>"+persona.getCiudad().getNomb()+"</nombreCiudad>\n\t\t <codigoCiudad>"+persona.getCiudad().getCod()+"</codigoCiudad> \n\t </ciudad>\n </Persona>";
    System.out.println(xml);
    }
    
    
    }
    public Persona[] toGsonArray (String jsonArray){
        Type List = new TypeToken<Persona[]>() {}.getType();
         Persona[] array= new Gson().fromJson(jsonArray,List);
         
        return array;
    }

}
