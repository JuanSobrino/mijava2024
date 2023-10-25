import java.util.Scanner;

public class Ejercicio9Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int contador = 1; //Para que cuente la última división
        int numero = 0;
        numero = sc.nextInt();

        while ((numero / 10) > 0) {
            contador ++;
            numero = (numero / 10);
            System.out.println("El numero " + numero + "tiene " + contador + " digitos");
        }
    }
    
}
