package main;

public class Main {
	
	public static void main(String[] args) {
		Jaguar yagua =  new Jaguar(10, 120f);
		Jaguar jaguar2 =  new Jaguar();
		Jaguar jaguar3 =  new Jaguar(10);
		Jaguar jaguar4 =  new Jaguar(100f);
		
		System.out.println(yagua);
		System.out.println(jaguar2);
		System.out.println(jaguar3);
		System.out.println(jaguar4);
		
		yagua.comer();
		yagua.dormir();
		
		yagua.rugir();
	}
}