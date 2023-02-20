package stringBasicos;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
		 * siguiente: el primer jugador introduce la contraseña; a continuación, el
		 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
		 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
		 * contraseña. VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es
		 * mayor o menor alfabéticamente que la contraseña, debe mostrar una cadena con
		 * los caracteres acertados en sus lugares respectivos y asteriscos en los no
		 * acertados.
		 * 
		 */

		String palabra = "";
		String pass = "";
//		Boolean acierta = false;
		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduce la cadena a adivinar: ");
		pass = lectura.next();

//		acierta= pass.equals(palabra);
//		if (acierta) {
//			System.out.println("La contraseña es menor");
//		} else {
//			System.out.println("La contraseña es mayor");
//		}
//		
//		lectura.close();

		for (int i = 0; i < pass.length(); i++) {
			System.out.print(" * ");
		}
		System.out.println();
		System.out.println("Intenta adivinar la contraseña");
		palabra = lectura.next();
		
		for (int i = 0; i < pass.length(); i++) {
			if (palabra.charAt(i) == pass.charAt(i)) {
				System.out.print(" " + palabra.charAt(i) + " ");
			} else {
				System.out.print(" * ");
			}
		}
	}
}


