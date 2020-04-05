package main;

public class Jaguar {

	private int edda;
	private float peso;
	
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
}
