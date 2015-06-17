package recuperacionjunio;

import java.util.ArrayList;
import java.util.Date;

/**
 * la clase Generos tendra diferentes metodos que utilizaremos en la aplicacion
 */
public class Generos {

    Peliculas pelicula = new Peliculas();

    /**
     * Creacion de un arrayLista de peliculas falta estatico y cambiar el uso
     */
    public static ArrayList<Peliculas> peliculas = new ArrayList();

    // en esta variable se crea un array de Genero de pelicula con los siguientes datos,
    //"Ciencia Ficcion","Aventuras","Artes Marciales","Historicas","Animadas"
    private String[] categoriaGeneros = {"Ciencia Ficcion", "Aventuras", "Magia", "Historicas", "Mediaval"};

    //declararlo dentro para que cada ve que se ejecute se inicie se puede realizar con la i
    //creacion de un string para almacenar 
    /**
     * Creacion de la matriz
     */
    public static Peliculas[][] escaparate = new Peliculas[3][3];

//    void añadirEscaparate(int posMatrizUno, int posMatrizDos){
//   String añadirAlEscaparate= escaparate[posMatrizUno][posMatrizDos];
//    }
    /**
     * Nos permitira añadir peliculas no retorna nada los generos cogerlos del
     * array
     */
    void añadirPelis() {
        pelicula = new Peliculas("Star wars", 1977, 1, true, categoriaGeneros[0]);
        peliculas.add(pelicula);
        pelicula = new Peliculas("Esdla", 2001, 3, true, categoriaGeneros[4]);
        peliculas.add(pelicula);
        pelicula = new Peliculas("Harry potter", 2000, 7, false, categoriaGeneros[2]);
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

    /**
     * se encargara de subir o de bajar
     *
     * @param pos= posicion1
     * @param sube =si sube
     */
    void movimiento(int pos1, boolean sube) {
        //debemos recoger dos posiciones
        //la posicion uno se movera a la dos y la dos a la uno
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

}
