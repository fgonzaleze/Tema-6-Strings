package stringBoletin2;

import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Escribe un programa que lea el título y el contenido de una página web. La
	 * aplicación generará por consola un documento HTML donde el título será un
	 * encabezado de primer nivel (<h1>), y el resto del contenido será un párrafo
	 * (<p>). El documento HTML debe contar con todas las etiquetas mínimas que
	 * todos los documentos HTML tienen.
	 */

	public static void main(String[] args) {

		// Declaramos las variables
		String titulo, contenido;
		String html = "";

		// Declaramos el scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el título
		System.out.println("Introduzca el título de la página web: ");
		titulo = sc.nextLine();

		// Le pedimos al usuario que introduzca el contenido
		System.out.println("Introduzca el contenido de la página web: ");
		contenido = sc.nextLine();

		// Generamos el html
		System.out.println(generarHTML(titulo, contenido));

	}

	// Metodo para generar el html
	public static String generarHTML(String titulo, String contenido) {
		String html = """
				<!DOCTYPE html>
				<html lang="es">
				    <head>
				        <meta charset="utf-8">
				    </head>
				    <body>
				        <h1>""";
		html += titulo;
		html += """
				</h1>
				        <p>""";
		html += contenido;
		html += """
				</p>
				    </body>
				</html>""";
		return html;
	}

}
