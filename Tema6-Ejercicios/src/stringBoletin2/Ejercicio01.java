package stringBoletin2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		 /*
	     * El preprocesador del lenguaje C elimina los comentarios del código fuente antes de compilar.
	     * Diseña un programa que lea por teclado una sentencia en C, y elimine los comentarios
	     */


	        //Declaramos las variables
	        String sentencia;

	        //Declaramos el scanner
	        Scanner sc = new Scanner(System.in);

	        //Le pedimos al usuario que introduzca una frase
	        System.out.println("Introduzca una sentencia en C: ");
	        sentencia = sc.nextLine();

	        // Eliminar comentarios /* ... */
	        sentencia = sentencia.replaceAll("/\\*.*?\\*/", "");

	        // Eliminar comentarios //
	        sentencia = sentencia.replaceAll("//.*", "");

	        //Mostramos la sentencia sin comentarios
	        System.out.println("La sentencia sin comentarios es: " + sentencia);
	    }

	
	}


