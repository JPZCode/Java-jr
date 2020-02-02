import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        int contador = 0;

        System.out.print("Filas que desea para la matriz: ");
        filas = entrada.nextInt();
        System.out.print("Columnas que desea para la matriz: ");
        columnas = entrada.nextInt();

        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = contador;
                contador++;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}