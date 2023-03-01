package stringBasicos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa descodificador. La solución es tan sencilla como
		 * utilizar la función diseñada en el ejercicio anterior intercambiando los
		 * conjuntos entre sí.
		 * 
		 */

		char[] sub1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'w' };
		char[] sub2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		char c;
		// Mensaje codificado.
		char[] mensajeC = new char[0]; 
		// Mensaje que introduce el usuario.
		String mensaje; 

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduzca una palabra: ");
		mensaje = sc.next();

		// Hacemos que se ignoren las mayusculas
		mensaje = mensaje.toLowerCase();

		// Recorremos con un bucle for la palabra y sacamos las posiciones y las
		// comparamos con el conjunto1.
		for (int i = 0; i < mensaje.length(); i++) {

			// Aquí guardamos el valor de cada posición.
			c = mensaje.charAt(i);

			// Hacemos una copia de la tabla y la vamos aumentando en 1.
			mensajeC = Arrays.copyOf(mensajeC, mensajeC.length + 1);

			// Rellenamos una tabla con los valores de c en la posición que indica i.
			mensajeC[i] += Ejercicio09.codifica(sub1, sub2, c);

		}

		// Pasamos el mensajeC a un String y lo imprimimos.
		System.out.println(String.copyValueOf(mensajeC));

		// Cerramos el escáner.
		sc.close();

	}

	// Pasamos un caracter a otro
	public static char codifica(char[] conjunto2, char[] conjunto1, char c) {

		String sub1;
		int indexC;

		// Pasamos el conjunto 1 a String
		sub1 = String.valueOf(conjunto1);

		// Buscamos si c existe en sub1.
		indexC = sub1.indexOf(c);

		// Si indexC es un valor distinto de -1.
		if (indexC != -1) {

			// Sustituimos el valor de c por que la posición correspondiente
			c = conjunto1[indexC];

		}
		return c;

	}

}
