package stringBasicos;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea una frase del teclado y nos indique si es
		 * palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha,
		 * que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de
		 * frase palíndroma es: “Dábale arroz a la zorra el abad”. Las vocales con tilde
		 * hacen que un algoritmo tome una frase palíndroma como si no lo fuese. Por
		 * esto, supondremos que el usuario introduce la frase sin tildes.
		 * 
		 */
		
		String frase;

		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduzca una frase para saber si es palíndroma: ");
		frase = lectura.nextLine();

	    frase = frase.replaceAll(" ", "");

	    String fraseInvertida = fraseAlReves(frase);

	    if (fraseInvertida.equalsIgnoreCase(frase)) {
	        System.out.println("La cadena introducida es un palíndromo.");
	    } else {
	        System.out.println("La cadena introducida no es un palíndromo.");
	    }

	    lectura.close();
	}

	public static String fraseAlReves(String frase) {
		String alReves = "";

		for (int i = frase.length() - 1; i >= 0; i--) {
			alReves += frase.charAt(i);
		}

		return alReves;
		
	}

}
