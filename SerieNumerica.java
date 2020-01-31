public class SerieNumerica {
    public static void main(String args[]){
        
        //1,2,3,4,5,6,7,8,9,10
        System.out.print("for: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 10){
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }            
        }
        System.out.println("");
        System.out.print("while: ");

        int i = 1;
        while(i <= 10){
            if (i == 10){
                System.out.print(i);
                break;
            } else {
               System.out.print(i + ", ");
            }
            i+=1;
        }
        System.out.println("");
        System.out.print("do while: ");

        int j = 1;
        do {
            if (j == 10){
                System.out.print(j);
            } else {
                System.out.print(j + ", ");
            }
            j+=1;
        } while(j <= 10);
        
        System.out.println("");
        System.out.println(" --------------------------------------- ");
        //1,99,2,98,3,97,4,96,5,95
        System.out.println("");
        System.out.print("for: ");

        int a = 0, b = 100;
        for (int x = 1; a < 5; x++) { 
            a+=1;
            b-=1;
            if (x < 5){
                System.out.print(a + ", ");
                System.out.print(b + ", ");
            } else {
                System.out.print(a + ", ");
                System.out.print(b);
            }
        }

        System.out.println("");
        System.out.print("while: ");

        int positivo = 0;
        int negativo = 100;
        int cont = 0;
        while(cont < 5){
            cont++;
            positivo+=1;
            negativo-=1;
            if (cont < 5){
                System.out.print(positivo + ", ");
                System.out.print(negativo + ", ");
            } else {
                System.out.print(positivo + ", ");
                System.out.print(negativo);
            }
        }

        System.out.println("");
        System.out.print("do while: ");

        int c = 0, d = 100;
        int contador = 0;
        do {
            c+=1;
            d-=1;
            System.out.print(c + ", " );
            if (d == 95){
                System.out.print(d);
            } else {
                System.out.print(d + ", ");
            }
            contador++;
        } while (contador < 5);

        System.out.println("");
        System.out.println(" --------------------------------------- ");

        //0,1,1,2,3,5,8,13,21,34

    }
}