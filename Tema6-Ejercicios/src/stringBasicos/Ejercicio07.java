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
		
		String frase = "";
		String fraseReves = "";
		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduzca una frase para saber si es palindroma: ");
		frase = lectura.nextLine();

		for (int i = frase.length()-1; i >= 0; i--) {
			fraseReves += frase.charAt(i);
		}
		
		
		System.out.println("La frase: '" + frase + "' al revés es: " + fraseReves);
	
	}

}
