import java.util.Scanner;
public class Ejemplo2ParoImpar {

    public static void main (String[] args) {
        //1. Declarar variables
        int num;

        //2. Leer de teclado esa variable
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        //3. Comprobar si es par o impar
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        
    
}
 }