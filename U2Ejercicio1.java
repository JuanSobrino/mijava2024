import java.util.Scanner;

public class U2Ejercicio1 {

    public int mayor(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el primer número ");
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo número ");
        int num2 = scanner.nextInt();

        System.out.println("Dime el tercer número ");
        int num3 = scanner.nextInt();
        

    }
}

    
 
    

