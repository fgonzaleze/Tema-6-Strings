package stringBasicos;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * Diseñar un programa que solicite al usuario una frase y una palabra. A
		 * continuación buscará cuántas veces aparece la palabra en la frase.
		 */

		String palabra;
		String frase;
		int cont = 0;

		Scanner lectura = new Scanner(System.in);

		// Pedimos la palabra
		System.out.println("Introduce una frase: ");
		palabra = lectura.next();

		// Pedimos la frase
		System.out.println("Introduce una palabra: ");
		frase = lectura.next();
		
		// Convertimos la frase en un array que contenga las palabras del string
		String[] palabras = frase.split(" ");
		
		// Recorremos el array creado y cuando coincida la palabra añadiremos +1 al contador
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals(palabra)) {
				cont++;
			}
		}
		
		// Imprimimos
		System.out.println("En la frase: " + frase + " hay " + cont + " veces la palabra " + palabra);

	}

}
