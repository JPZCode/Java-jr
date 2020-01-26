public class if_else {
    public static void main(String[] args) {
        
        // Condicional Simple
        int num = 5;
        if (num != 2) {
            System.out.println("True");
        }
        // Condicional Compuesta
        if (num != 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(" ------------------------- ");

        int matematicas = 5;
        int biologia = 8;
        int quimica = 7;
        int promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

        if (promedio >= 6) {
            System.out.println("Aprobo");
        } else {
            System.out.println("No se aprobo");
        }

        System.out.println(" ------------------------- ");
        // If else anidados

        int operacion = 3;
        int num1 = 8;
        int num2 = 4;
        int resultado = 0;

        if (operacion == 1) {
            resultado = num1 + num2;
            System.out.println("Resultado de suma = " + resultado);
        } else if (operacion == 2) {
            resultado = num1 - num2;
            System.out.println("Resultado de resta = " + resultado);
        } else if (operacion == 3) {
            resultado = num1 * num2;
            System.out.println("Resultado de multiplicacion = " + resultado);
        } else if (operacion == 4) {
            resultado = num1 / num2;
            System.out.println("Resultado de division = " + resultado);
        } else {
            System.out.println("Accion Invalida");
        }

    }
}