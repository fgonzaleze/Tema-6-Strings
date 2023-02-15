package stringBasicos;

public class Ejercicio01 {

	public static void main(String[] args) {
//		Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene menos caracteres.
		
		String cadena1 = "Juanma es tontisimo";
		String cadena2 = "JUANMA es tontisimo";
		boolean iguales;
		// condicion verdad
		if (iguales = cadena1.equals(cadena2)) {
			System.out.println("Es mentira");
		
		//true	
		} if (iguales = cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Es verdad");
		}
		
		
	}

}
