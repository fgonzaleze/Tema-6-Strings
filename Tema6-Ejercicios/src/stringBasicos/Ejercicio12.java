package stringBasicos;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Un anagrama es un palabra, o frase, que resulta de la transposición de otra
		 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
		 * mora. Construir un programa que solicite al usuario dos palabras e indique si
		 * son anagramas una de otra.
		 */

			String palabra1;
			String palabra2;
			boolean anagrama = false;
			Scanner sc = new Scanner(System.in);

			// Pedimos la frase.
			System.out.println("Introduzca la primera palabra: ");
			palabra1 = sc.nextLine();

			System.out.println("Introduzca la segunda palabra: ");
			palabra2 = sc.nextLine();

			// Si las palabras tienen dos tamaños diferentes no puede ser anagramas
			if (palabra1.length() == palabra2.length()) {

				// Ahora pedimos la función que comprueban si son anagramas o no.
				anagrama = comparaPalabras(palabra1, palabra2);
		
				// Si anagrama es verdadera.
				if (anagrama) {
					System.out.println("Las palabras son anagramas.");
				} else {
					System.out.println("Las palabras no son anagramas.");
				}
			} else {

				System.out.println("Las palabras no son anagramas.");
			}

			// Cerramos el escáner.
			sc.close();

		}

		
		//	 Compara dos palabras de la misma longitud para saber si son anagramas. Con bucles for vamos a ir a cada posicion de la palabra 1 y los compara con la palabra 2
		public static boolean comparaPalabras(String pab1, String pab2) {

			//Pasamos las dos palabras a arrays.
			char[] p1 = pab1.toCharArray();
			char[] p2 = pab2.toCharArray();

			// Devuleve true si son anagramas
			boolean anagrama = false;

			// Recorremos las palabras por caracteres y los comparamos.
			//Aquí recorremos la palabra1.
			for (int index1 = 0; index1 < pab1.length(); index1++) {

				//Aquí recorremos la palabra2.
				for (int index2 = 0; index2 < pab2.length(); index2++) {

					//Comparamos si el valor de una posición de p1, la podemos encontrar en p2.
					if (p1[index1] == p2[index2]) {

						anagrama = true;

					}
				}

			}

			return anagrama;

		
	}

}
