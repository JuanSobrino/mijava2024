import java.util.Scanner;
public class Ejemplo1Estructuras {

    public static void main (String[] args) {
        //1. Declarar variables
        String user, password;

        //2. Leer de teclado los dos valores
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime nombre de usuario: ");
        user = sc.nextLine();

        System.out.println("Dime password: ");
        password = sc.nextLine();

        //3. Comprobar si son igual a "pepe" el usuario y password a "12345678"
        if ((user.equals("pepe")) && (password.equals("12345678"))) {
        System.out.println("Bienvenido a COD2, entrando al juego...");
        } else {
            System.out.println("Error en las credenciales");
        }

        
 }
 }
