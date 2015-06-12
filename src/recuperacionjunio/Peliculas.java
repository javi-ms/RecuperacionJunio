/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio;

import java.util.Date;

/**
 *de que va la clase
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

    /**
     *
     */
    public Peliculas() {
    }

    /**
     *
     * @param nombrePelicula
     * @param fechaSalida
     * @param cantidad
     * @param enPosesion
     * @param categoria
     */
    public Peliculas(String nombrePelicula, int fechaSalida, int cantidad, boolean enPosesion, String categoria) {
        this.nombrePelicula = nombrePelicula;
        this.fechaSalida = fechaSalida;
        this.cantidad = cantidad;
        this.enPosesion = enPosesion;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombrePelicula=" + nombrePelicula + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
/**
 * Crearemos los getter y setter para que se puedan modificar
 * nos retornara el nombre de la Pelicula
     * @return nombre pelicula
 */
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    /**
     *Nos permitira modicarlo
     * @param nombrePelicula
     */
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    /**
     *Nos retornara la fecha de salida
     * @return
     */
    public int getFechaSalida() {
        return fechaSalida;
    }

    /**
     *Nos permitira modicarlo
     * @param fechaSalida
     */
    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     *Nos retornara la cantidad
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *Nos permitira modicarlo
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *Nos retornara si esta en posesion
     * @return
     */
    public boolean isEnPosesion() {
        return enPosesion;
    }
    
    /**
     *Nos permitira modicarlo
     * @param enPosesion
     */
    public void setEnPosesion(boolean enPosesion) {
        this.enPosesion = enPosesion;
    }

    /**
     *Nos retornra la categoria
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     *Nos permitira modicarlo
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
