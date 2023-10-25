import java.util.Scanner;
public class EjemploParImparMultiplo {

    public static void main (String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es par");

            //Solo preguntar si es múltiplo de 10 aquí

            if (num % 10 == 0) {
            System.out.println("Es múltiplo de 10");
          } else {
            System.out.println("No es múltiplo de 10");

            //No va a ser nunca múltiplo de 10 siendo impar
            System.out.println("No es múltiplo de 10");
        }
        
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        if (num % 10 == 0) {
            System.out.println("Es múltiplo de 10");
        } else {
            System.out.println("No es múltiplo de 10");
        }
        

}
}
}

