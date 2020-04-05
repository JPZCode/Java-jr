package main;

public class Jaguar extends Animal implements IFelino{

	private int edda;
	private float peso;
	
	public Jaguar() {
		this.setEdda(0);
		this.setPeso(0.0f);
	}
	
	public Jaguar(int edad) {
		this.setEdda(edad);
		this.setPeso(0.0f);
	}
	
	public Jaguar(float peso) {
		this.setEdda(0);
		this.setPeso(peso);
	}
	
	public Jaguar(int edda, float peso) { // Constructor
		this.setEdda(edda);
		this.setPeso(peso);
	}
	
	public int getEdda() {
		return edda;
	}
	public void setEdda(int edda) {
		this.edda = edda;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Mi edad es " + this.getEdda() + " Mi peso es " + this.getPeso();
	}
	
	public void comer() {
		System.out.println("El jaguar come");
	}
	
	public void dormir() {
		System.out.println("El jaguar duerme");
	}
	
	//Interfaz
	
	public void rugir() {
		System.out.println("El jaguar ruge");
	}
	public void maullar() {
		throw new UnsupportedOperationException("El juagar no maulla");
	}
	public void cazar() {
		System.out.println("El jaguar caza");
	}
	
}
