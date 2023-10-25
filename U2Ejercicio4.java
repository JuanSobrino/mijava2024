import java.util.Scanner;
public class U2Ejercicio4 {

    //Pinte el número de billetes de cada tipo: 200, 100, 50, 20, 10, 5

    public static void billetes(int cantidad) {
        int b200, b100, b50, b20, b10, b5, sobra, resto;
        b200 = cantidad / 200;
        resto = cantidad % 200;
        b100 = (cantidad % 200) / 100;
        resto = cantidad % 100;
        b50 = ((cantidad % 100) % 100) / 50;
        resto = cantidad % 50;
        b20 = resto / 20;
        resto = resto % 20;
        b10 = resto / 10;
        resto = resto % 10;
        b5 = resto / 5;
        resto = resto % 5;
        sobra = resto;
        

        System.out.println("Billetes de 200 " + b200);
        System.out.println("Billetes de 100 " + b100);
        System.out.println("Billetes de 50 " + b50);
        System.out.println("Billetes de 20 " + b20);
        System.out.println("Billetes de 1 " + b10);
        System.out.println("Billetes de 5 " + b5);
        
        System.out.println("Sobra " + sobra);

    }
    public static void main(String[] args) {
        int cantidad = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cantidad");
        cantidad = sc.nextInt();

        //Llamar a la función
        billetes(cantidad);
        
    
    } 
}
