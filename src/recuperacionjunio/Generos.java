package recuperacionjunio;

import java.util.ArrayList;
import java.util.Date;

/**
 * la clase Generos tendra diferentes metodos que utilizaremos en la aplicacion
 */
public class Generos {

    Peliculas pelicula;

    /**
     * Creacion de un arrayLista de peliculas
     */
    public ArrayList<Peliculas> peliculas = new ArrayList();

    // en esta variable se crea un array de Genero de pelicula con los siguientes datos,
    //"Ciencia Ficcion","Aventuras","Artes Marciales","Historicas","Animadas"
    private String[] categoriaGeneros = {"Ciencia Ficcion", "Aventuras", "Artes Marciales", "Historicas", "Animadas"};

//declararlo dentro para que cada ve que se ejecute se inicie se puede realizar con la i
    //creacion de un string para almacenar 
    /**
     * Nos permitira añadir peliculas no retorna nada
     */
    void añadirPelis() {
        pelicula = new Peliculas("Star wars", 1977, 1, true, "Ciencia Ficcion");
        peliculas.add(pelicula);
        pelicula = new Peliculas("Esdla", 2001, 3, true, "Medieval");
        peliculas.add(pelicula);
        pelicula = new Peliculas("Harry potter", 2000, 7, false, "Magia");
        peliculas.add(pelicula);
    }

    /**
     * Estos metodos nos permitiran movernos entre las distintas peliculas que
     * hay en el array
     *
     * @param contador
     * @return nos retorna una pelicula
     */
    public Peliculas adelantarPelicula(int contador) {
        pelicula = peliculas.get(contador);
        return pelicula;
    }

    /**
     *
     * @param contador
     * @return nos retornara una pelicula
     */
    public Peliculas atrasarPelicula(int contador) {
        pelicula = peliculas.get(contador);
        return pelicula;
    }

    /**
     * Esta clase se encargara de mostrar los datos
     *
     * @return nos retornara un genero
     */
    public String mostrarGenero() {
        String genero = "";
//para que el usuario lo controle -1
        for (int i = 0; i < categoriaGeneros.length; i++) {
            genero += i + 1 + "~ " + categoriaGeneros[i] + "\n";

        }
        return genero;
    }
//cuando no retorna nada no necesita String
//modificar movimiento es de x a y

    void movimiento(int pos1, boolean sube) {
        //debemos recoger dos posiciones
        //la posicion uno se movera a la dos y la dos a la uno

//        //posicion Siguiente
//        String posSiguiente = categoriaGeneros[pos2];
//
//        //mover la posicion a la posicion siguiente
//        categoriaGeneros[pos2] = categoriaGeneros[pos1];
//
//        //la posicion siguiente la movemos a la anterior
//        categoriaGeneros[pos1] = posSiguiente;
        if (sube) {
            //recogemos la posicion siguiente en una variable
            String posAnt = categoriaGeneros[pos1 + 1];
            //en la posicion siguiente guardamos la posicion elegida
            categoriaGeneros[pos1 + 1] = categoriaGeneros[pos1];
            //en la posicion elegida guardamos la posicion elegida
            categoriaGeneros[pos1] = posAnt;
        } else {
            String posPos = categoriaGeneros[pos1 - 1];
            categoriaGeneros[pos1 - 1] = categoriaGeneros[pos1];
            categoriaGeneros[pos1] = posPos;
        }
    }

//    public String posesion(boolean posesion) {
//        if (posesion) {
//
//        } else {
//
//        }
//        return 
//    }
}
