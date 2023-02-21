package stringBasicos;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Diseña una aplicación que pida al usuario que introduzca una frase por
		 * teclado e indique cuántos espacios en blanco tiene.
		 * 
		 */

		// Declaramos las variables
		String palabra = ""; // para la string que va a introducir por teclado
		String espacio = " "; // para comparar los espacios
		int cont = 0; // contador para la cantidad de espacios

		// abrimos escáner
		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduzca una frase para saber cuantos espacios hay");
		palabra = lectura.nextLine();

		// Recorremos el String y vamos contando los espacios cuando coincida en un
		// contador
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == espacio.charAt(0)) {
				cont++;
			}

		}
		System.out.println("Hay " + cont + " espacios");
	}

}
