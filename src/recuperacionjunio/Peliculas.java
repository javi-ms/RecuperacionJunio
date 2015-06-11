/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio;

import java.util.Date;

/**
 *
 * @author Javier
 */
public class Peliculas {
/**
 *Declararemos las variables que se gestionaran
 * 
 */
    private String nombrePelicula;
    private int fechaSalida;
    private int cantidad;
   private  boolean enPosesion;
    //cienfia ficcion, comedia, romantica
    //falta añadir la categoria
   private  String categoria;

    public Peliculas() {
    }

    public Peliculas(String nombrePelicula, int fechaSalida, int cantidad, boolean enPosesion, String categoria) {
        this.nombrePelicula = nombrePelicula;
        this.fechaSalida = fechaSalida;
        this.cantidad = cantidad;
        this.enPosesion = enPosesion;
        this.categoria = categoria;
    }
    
   
/**
 * Crearemos los getter y setter para que se puedan modificar
 */
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEnPosesion() {
        return enPosesion;
    }
    
    public void setEnPosesion(boolean enPosesion) {
        this.enPosesion = enPosesion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
