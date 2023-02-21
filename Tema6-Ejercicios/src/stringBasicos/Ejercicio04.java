package stringBasicos;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Diseñar una función a la que se le pase una cadena de caracteres y la
		 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
		 * Recuerda probar la función en un main.
		 * 
		 */

		String frase = "";
		String fraseReves = "";
		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduzca una frase para saber cuantos espacios hay");
		frase = lectura.nextLine();

		for (int i = 0; i > frase.length(); i--) {
			fraseReves += frase.charAt(i);
		}

		System.out.println(fraseReves);
	}

}
