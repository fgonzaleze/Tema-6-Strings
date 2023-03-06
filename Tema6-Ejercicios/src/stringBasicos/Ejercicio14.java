package stringBasicos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	    /**
	     * Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra o frase, y la aplicación
	     * muestra un anagrama (transposición de los caracteres) del texto introducido generado al azar. A continuación
	     * otro jugador tiene que acertar cuál es el texto original. La aplicación no debe permitir que el texto
	     * introducido por el jugador 1 sea la cadena vacía. Por ejemplo, si el jugador 1 escribe “teclado”, la aplicación
	     * muestra como pista un anagrama al azar: “etcloda”. Puedes usar una función que realice la desordenación del
	     * texto.
	     */

		public static void main(String[] args) {
		    //Declaramos las variables
	        String palabra;
	        String anagrama;
	        String adivina;
	        int contador = 0;

	        //Declaramos el scanner para poder leer por consola
	        Scanner sc = new Scanner(System.in);

	        //Le pedimos al usuario que introduzca una palabra
	        System.out.println("Jugador 1, por favor introduzca una palabra: ");
	        palabra = sc.next();

	        //Desordenamos la palabra y la guardamos en una variable anagrama
	        anagrama = desordenarPalabra(palabra);

	        //Le pedimos al jugador 2 que adivine la palabra
	        System.out.println("Jugador 2, intente adivinar la palabra del jugador 1: ");
	        System.out.println("El anagrama de la palabra es " + anagrama);

	        //Mientras la palabra introducida por el jugador 2 sea distinta a la palabra del jugador 1, le pedimos que
	        // vuelva a intentarlo
	        do {
	            //Guardamos la respuesta del jugador 2 en la variable adivina
	            adivina = sc.next();

	            //incrementamos el contador de intentos
	            contador++;
	            //Le mostramos al jugador 2 el número de intentos que lleva
	            System.out.println("Usted lleva " + contador + " intentos.");

	        } while (!palabra.equalsIgnoreCase(adivina));

	        //Si la palabra introducida por el jugador 2 es igual a la palabra del jugador 1, le mostramos un mensaje
	        // de felicitación
	        System.out.println("Enhorabuena, ¡has acertado!");

	        //Cerramos el scanner
	        sc.close();
	    }

	    /**
	     * Método que desordena
	     * @param palabra que es una cadena de caracteres
	     * @return
	     */
	    public static String desordenarPalabra(String palabra) {

	        //Declaramos las variables
	        char[] cadena = palabra.toCharArray();              //Convertimos la palabra pasado por parámetro en un array de caracteres
	        char[] cadenaDesordenada = new char[cadena.length]; //Creamos un array de caracteres con la misma longitud que el array de caracteres anterior
	        int[] usados = new int[0];                          //Creamos un array de enteros que contendrá los índices de los caracteres que ya hemos usado
	        int indice;

	        //Recorremos el array de caracteres de la palabra
	        for (int i = 0; i < cadena.length; i++) {

	            //Mientras el índice que hemos generado aleatoriamente esté en el array de índices usados, generamos otro índice
	            do {
	                indice = (int) (Math.random() * cadena.length);
	                //Guardamos el carácter del array de caracteres en la posición del índice generado aleatoriamente en el
	                // array de caracteres desordenados
	                cadenaDesordenada[i] = cadena[indice];
	            } while (repetido(usados, indice));

	            //Añadimos el índice que hemos usado al array de índices usados
	            usados = Arrays.copyOf(usados, usados.length + 1);
	            usados[usados.length - 1] = indice;
	        }

	        //Convertimos el array de caracteres desordenados en una cadena de caracteres y la devolvemos
	        return String.valueOf(cadenaDesordenada);
	    }

	    /**
	     * Metodo que comprueba si un índice está en un array de enteros
	     * @param usados
	     * @param indice
	     * @return
	     */
	    public static Boolean repetido(int[] usados, int indice) {
	        //Declaramos las variables
	        Boolean repetido = false;
	        int cont = 0;

	        //Mientras el contador sea menor que la longitud del array de índices usados y no hayamos encontrado un índice
	        // repetido, seguimos buscando
	        while (cont < usados.length && !repetido) {
	            //Si el índice que hemos pasado por parámetro es igual al índice del array de índices usados, el índice
	            // está repetido
	            if (indice==usados[cont]) {
	                repetido=true;
	            }
	            //Incrementamos el contador
	            cont++;
	        }

	        return repetido;
	    
		}

	}