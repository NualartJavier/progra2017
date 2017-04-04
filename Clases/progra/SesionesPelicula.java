/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

import java.util.Vector;

/**
 *
 * @author juan
 */
class SesionesPelicula {
    private Pelicula pelicula;
    private Vector sesionesStrPelicula;

    public SesionesPelicula(Pelicula pelicula, Vector sesionesStrPelicula) {
        this.pelicula=pelicula;
        this.sesionesStrPelicula=sesionesStrPelicula;
    }
    public Pelicula getPelicula(){
    return this.pelicula;
    }
    public Vector getSesionesStr(){
    return this.sesionesStrPelicula;
    }
    
}
