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
		
		
		String palabra = "";
		
		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduce la c a adivinar: ");
		palabra = lectura.next();
		
		lectura.close();
		
		

	}

}
