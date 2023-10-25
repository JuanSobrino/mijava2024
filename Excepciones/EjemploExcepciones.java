package Excepciones;
import java.util.Scanner;

public class EjemploExcepciones {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 30;

        try {
            System.out.println("Dime un número");
            numero = sc.nextInt();

            //Si el error salta aquí el resto del try no se ejecuta
            numero = numero / 0; 

        
        } catch (ArithmeticException ex) {
            System.out.println("Ha ocurrido un error en la división");
        }

            

        System.out.println("El programa continúa");
        
    
 }
}
 