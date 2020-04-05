package main;

public class Main {
	
	public static void main(String[] args) {
		
		ConexionDB conexion = ConexionDB.obtenerConexion();
		ConexionDB conexion2 = ConexionDB.obtenerConexion();
		ConexionDB conexion3 = ConexionDB.obtenerConexion();
		
		conexion.host = "localhost";
		
		System.out.println(conexion.host);
		System.out.println(conexion2.host);
		System.out.println(conexion3.host);
		
	}
}
