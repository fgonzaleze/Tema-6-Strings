package stringBasicos;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
		 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
		 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
		 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
		 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
		 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
		 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
		 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
		 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
		 * 
		 */
	
		String frase;
		boolean idioma = true;
		String traduccion;
		
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca una frase para traducirla: ");
		frase = lectura.nextLine();

		// Comprobamos que es el idioma de Javalandia.
		idioma = Ejercicio08.queIdiomaEs(frase);

		if (idioma) {

			System.out.println("El idioma es el de Javalandia");
			
			// Hacemos la traduccion
			traduccion = Ejercicio08.divideFrase(frase);
			
			System.out.println("La traduccion es: " + traduccion);

		} else {
			System.out.println("El usuario no está hablando en el idioma de Javalandia.");
		}
		lectura.close();
	}

	// Funcion que comprueba si es del idioma de Javalandia gracias al prefijo y al sufijo

	public static boolean queIdiomaEs(String frase) {

		String prefijo = "Javalín, javalón";
		String sufijo = "javalén, len, len";
		boolean idioma = false;

		// Si la frase empieza con el prefijo y acaba con el sufijo será true
		if (frase.startsWith(prefijo) || (frase.endsWith(sufijo))) {
			idioma = true;
		}
		return idioma;

	}

	// Funcion que quita el prefijo y el sufijo

	public static String divideFrase(String frase) {

		String fraseAcortada;

		// Ahora tenemos que identificar si es prefijo o sufijo.
		// En caso de que hable con el sufijo.
		if (frase.contains("len")) {

			// Le quitamos lo que contenga del sufijo Javalandia
			fraseAcortada = frase.substring(0, frase.length() - 17);

			// Le quitamos cualquier espacio que sobre.
			fraseAcortada = fraseAcortada.trim();

			// En caso de que hable con el prefijo.
		} else {

			// Nos saltamos hasta la posicion 16
			fraseAcortada = frase.substring(16);

			// Le quitamos cualquier espacio que sobre.
			fraseAcortada = fraseAcortada.trim();

		}
		return fraseAcortada;

	}
}
