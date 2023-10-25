import java.util.Scanner;

public class Ejercicio5Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        System.out.println("Dime un número");
        numero = sc.nextInt();

        while (numero<1 || numero>10);
        System.out.println("El número es válido");
    }
    
}
