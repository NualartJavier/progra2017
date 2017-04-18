/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia.tema11;

/**
 *
 * @author juan
 */
public class Alumno extends Persona{
    private double promedio;
    public Alumno(int edad, int id, String Nombre,double promedio) {
        super(edad, id, Nombre);
        this.promedio=promedio;
        
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
