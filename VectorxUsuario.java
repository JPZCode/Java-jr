import java.util.Scanner;

public class VectorxUsuario {
    public static void main(String[] args) {
        
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);
        //Preguntar la longitud antes de inicializar el vector
        System.out.println("Cuantos numeros deseas ingreasar? > ");
        longitud = entrada.nextInt();

        //Inicializamos el vector con la longitud del usuario
        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un numero para la posicion #" + (i + 1) +": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("");
        System.out.println("Los numeros que guardaste fueron:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("#" + (i + 1) + " -> " + numeros[i]);
            
        }
    }
}