package stringBasicos;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
		 * completa separando las palabras introducidas con espacios en blanco. Terminar
		 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
		 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
		 * “fin” no aparecerá en la frase final.
		 */
		
		// Declaramos variables
		String palabra = "";
		String frase = "";
		
		Scanner lectura = new Scanner(System.in);
		
		// Pedimos la primera palabra
		System.out.println("Introduce una palabra: ");
		palabra = lectura.next();
		
		// Bucle while mientras no sea la palabra "fin" contando mayusculas
		while (!palabra.equalsIgnoreCase("fin")) {
			
			// Añadimos al string frase la palabra que creamos y un espacio para separarlas
			frase += palabra + " ";
			
			// Volvemos a pedir otra palabra
			System.out.println("Introduce una palabra: ");
			palabra = lectura.next();
		}
		// Imprimimos la frase creada
		System.out.println(frase);
		lectura.close();
		
		

	}

}
