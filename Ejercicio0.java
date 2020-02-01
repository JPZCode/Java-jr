public class Ejercicio0 {
    public static void main(String[] args) {
        int resultado = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                resultado += 10;
            } else {
                resultado += 1;
            }
        }
        System.out.println(resultado);
    }
}