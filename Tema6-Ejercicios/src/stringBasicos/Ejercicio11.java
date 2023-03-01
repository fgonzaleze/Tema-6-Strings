package stringBasicos;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		/*
		 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
		 * imprimir tanto la palabra como el número de caracteres de la misma.
		 */

		String frase;
		String palabraMasLarga;
		String[] palabras = new String[0];

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		// Separamos en un array la frase introducida.
		palabras = frase.split(" ");

		// Pedimos la palabra más larga de la frase.
		palabraMasLarga = Ejercicio11.identificaPalabras(palabras);

		// Imprimimos el resultado.
		System.out.println("La palabra más larga de la frase anterior es: " + palabraMasLarga + " con "
				+ palabraMasLarga.length() + " letras");

		// Cerramos el escáner.
		sc.close();

	}

	// Identificamos la palabra más larga
	public static String identificaPalabras(String[] palabras) {

		// Declaramos las variables
		int index;
		String max = "";

		// Recorremos el array.
		for (index = 0; index < palabras.length; index++) {

			// Le decimos que guarde la palabra más larga.
			if (palabras[index].length() > max.length()) {

				max = palabras[index];
			}

		}

		return max;
	
	}

}
