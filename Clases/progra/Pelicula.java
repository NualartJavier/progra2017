/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

/**
 *
 * @author juan
 */
public class Pelicula {
    private String codigo;
    private String titulo;
    private String director;
    private String actores;
    Pelicula(String codigo, String titulo, String director, String actores) {
      this.codigo=codigo;
      this.titulo=titulo;
      this.director=director;
      this.actores=actores;
    }
    public String getCodigo(){
    return this.codigo;
    }
    public String getTitulo(){
    return this.actores;
    }
    public String getDirector(){
    return this.director;
    }
    public String getActores(){
    return this.actores;
    }
}
