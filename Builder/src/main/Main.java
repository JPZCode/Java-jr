package main;

public class Main {
	
	public static void main(String[] args) {
		
		Usuario codi = Usuario.Make("Pamela", "Pérez")
								.setEmail("jesypame321@gmail.com")
								.setTelefono("442-3183-544")
								.Build();
		
		System.out.println(codi);
	}
}