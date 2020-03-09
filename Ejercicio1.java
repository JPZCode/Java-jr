import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int filas = 0, columnas = 0, contador = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantas filas deseas?");
        filas = entrada.nextInt(); 
        System.out.print("Cuantas columnas deseas?");
        columnas = entrada.nextInt();

        int numeros[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = contador;
                contador++;
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println("");
        }
    }
}