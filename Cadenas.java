import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        String nameUno = "";
        String nameDos = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primer nombre: ");
        nameUno = entrada.nextLine();
        
        System.out.print("Segundo nombre: ");
        nameDos = entrada.nextLine();

        if (nameUno.equalsIgnoreCase(nameDos)) {
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres no son iguales");
        }
    }
}