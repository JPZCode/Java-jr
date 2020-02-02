import java.util.Scanner;

public class EjercicioLogin{
    public static void main(String[] args) {
        String user = "", pass = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("User: ");
        user = entrada.nextLine();
        
        System.out.print("Pass: ");
        pass = entrada.nextLine();

        if (user.equals("Pamela") && pass.equals("febrero")) {
            System.out.println("Login exitoso");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }
}