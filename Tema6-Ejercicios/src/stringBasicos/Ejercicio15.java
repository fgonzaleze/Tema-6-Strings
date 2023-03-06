package stringBasicos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
	/**
	 * Modificar el ejercicio anterior para que el programa indique al jugador 2, en
	 * cada intento, cuántas letras coinciden con el texto original.
	 */

	public static void main(String[] args) {

		// Declaramos las variables
		String palabra;
		String anagrama;
		String adivina;
		char[] oculto = new char[0];
		int contador = 0;

		// Declaramos el scanner para poder leer por consola
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una palabra
		System.out.println("Jugador 1, por favor introduzca una palabra: ");
		palabra = sc.next();

		// Desordenamos la palabra y la guardamos en una variable anagrama
		anagrama = Ejercicio14.desordenarPalabra(palabra);

		// Hacemos una copia del array oculto con la longitud de la palabra introducida
		// por parámetros
		oculto = Arrays.copyOf(oculto, palabra.length());

		// Rellenamos el array oculto con asteriscos
		Arrays.fill(oculto, '*');

		// Le pedimos al jugador 2 que adivine la palabra
		System.out.println("Jugador 2, intente adivinar la palabra del jugador 1: ");
		System.out.println("El anagrama de la palabra es " + anagrama);

		// Mientras la palabra introducida por el jugador 2 sea distinta a la palabra
		// del jugador 1, le pedimos que
		// vuelva a intentarlo
		do {
			// Guardamos la respuesta del jugador 2 en la variable adivina
			adivina = sc.next();

			// Mostramos las letras acertadas y ocultamos las que no
			System.out.println(String.valueOf(comprobarAciertos(oculto, adivina, palabra)));

			// incrementamos el contador de intentos
			contador++;
			// Le mostramos al jugador 2 el número de intentos que lleva
			System.out.println("Usted lleva " + contador + " intentos.");

		} while (!palabra.equalsIgnoreCase(adivina));

		// Si la palabra introducida por el jugador 2 es igual a la palabra del jugador
		// 1, le mostramos un mensaje
		// de felicitación
		System.out.println("Enhorabuena, ¡has acertado!");

		// Cerramos el scanner
		sc.close();
	}

	/**
	 * Metodo que muestra las letras acertadas y oculta las que no
	 * 
	 * @param oculto
	 * @param adivina
	 * @param palabra
	 * @return un array de caracteres
	 */
	public static char[] comprobarAciertos(char[] oculto, String adivina, String palabra) {

		// Recorremos el array oculto
		for (int i = 0; i < oculto.length; i++) {
			// Si la letra de la palabra adivinada coincide con la letra de la palabra
			// original, se muestra la letra
			if (adivina.charAt(i) == palabra.charAt(i)) {
				oculto[i] = palabra.charAt(i);
			} else { // Si no coincide, se muestra un asterisco
				oculto[i] = '*';
			}
		}

		// Devolvemos el array oculto
		return oculto;
	}
}
