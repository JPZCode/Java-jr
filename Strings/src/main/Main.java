package main;

public class Main {
	public static void main (String[] args) {
		
		String mensaje = "Hola, soy un String";
		
		System.out.println(mensaje);
		
		int cantidad = mensaje.length();
		
		boolean contiene = mensaje.contains("s");
		boolean comienzaCon = mensaje.startsWith("H");
		boolean terminaCon = mensaje.endsWith("g");
		
		System.out.println(cantidad);
		System.out.println(contiene);
		System.out.println(comienzaCon);
		System.out.println(terminaCon);
		
		String uno = "Uno";
		String dos = "Dos";
		String tres = "Tres";

		String resultado = String.format("%3$s - %2$s - %1$s", uno, dos, tres);
		System.out.println(resultado);
		
		float pi = 3.14159265359f;

		String resultado2 = String.format("%1f - Decimales: %1$.2f", pi, pi);
		System.out.println(resultado2);
	}
}