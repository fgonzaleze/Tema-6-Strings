package stringBasicos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		/*
		 * Disponemos de la siguiente relación de letras: 
		 * 
		 * conjunto 1: e i k m p q r s t u v 
		 * conjunto 2: p v i u m t e r k q s
		 * 
		 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
		 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
		 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
		 * minúsculas, mostrando siempre la codificación en minúsculas. Un ejemplo: la
		 * palabra «PaquiTo» se codifica como «matqvko». Se pide realizar un programa
		 * codificador, en el que se implemente la función: char codifica(char
		 * conjunto1[],char conjunto2[], char c) que devuelve el carácter c codificado
		 * según los conjuntos 1 y 2 que se le pasan.
		 * 
		 */

		// Declaramos las variables necesarias.
		char[] sub1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'w' };
		char[] sub2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		char c;
		// Este será el mensaje codificado
		char[] mensajeC = new char[0];
		// Mensaje que introduce el usuario
		String mensaje; 

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduzca una palabra: ");
		mensaje = sc.next();

		// Ignoramos las mayúsculas
		mensaje = mensaje.toLowerCase();

		// Recorremos con un bucle for la palabra y sacamos las posiciones y las comparamos con el conjunto1.
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

	// Cambiamos los caracteres con su clave

	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {

		String sub1;
		int indiceC;

		// Convertimos el primer conjunto a Strings
		sub1 = String.valueOf(conjunto1);

		// Buscamos si c existe en sub1.
		indiceC = sub1.indexOf(c);

		// Si indexC es un valor distinto de -1.
		if (indiceC != -1) {

			// Sustituimos el valor de c por que la posición correspondiente en el
			// conjunto2.
			c = conjunto2[indiceC];

		}

		// Devolvemos c.
		return c;

	}

}
