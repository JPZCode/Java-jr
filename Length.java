import java.util.Scanner;

public class Length{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cadena_original = "", cadena_sub = "";
        int num_caracter = 0, desde = 0, hasta = 0;

        System.out.print("Introduce una cadena de caracteres: ");
        cadena_original = entrada.nextLine();

        num_caracter = cadena_original.length();

        System.out.println("La cadena contiene " + num_caracter + " caracteres.");

        System.out.print("Desde que caracter deseas obtener: ");
        desde = entrada.nextInt();
        System.out.print("Hasta que caracter terminara: ");
        hasta = entrada.nextInt();

        cadena_sub = cadena_original.substring(desde,hasta);
        System.out.println(cadena_sub);
    }
}