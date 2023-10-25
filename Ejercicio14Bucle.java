import java.util.Scanner;
public class Ejercicio14Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int contador = 0;

         for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                contador ++;
            }
         }
         System.out.println("Hay " + contador + " numeros par");
    }
    
}
