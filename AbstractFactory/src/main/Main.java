package main;

public class Main {

	public static void main(String[] args) {
		SamsungStoree samsung = new SamsungStoree();
		AppleStore apple = new AppleStore();
		
		IComputadora mac = apple.crearComputadora();
		ITablet ipad = apple.crearTablet();
		
		IComputadora qx = samsung.crearComputadora();
		ITablet tab = samsung.crearTablet();
	}
}
