import java.util.Scanner;

public class Ejemplo3Colores {
    public static void main(String[] args) {
        //1. Declarar Variables
        String color1, color2;

        //2. Leer de teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime primer color (R, A, V) ");
        color1 = sc.nextLine();
        System.out.println("Dime segundo color (R, A, V) ");
        color2 = sc.nextLine();

        //3. Resolver combinaciones
        //Rojo, azul, verde
        //Posibilidades
        //Rojo - Azul
        //Rojo - Verde
        //Rojo - Rojo
        //Azul - Rojo
        //Azul - Verde
        //Azul - Azul
        //Verde - Rojo
        //Verde - Azul
        //Verde - Verde

        //Solución 1 - Preguntar cada caso
        if (color1.equals("R") && color2.equals("A")) {
            System.out.println("Magenta");
        } else if (color1.equals("R") && color2.equals("V")) {
            System.out.println("Amarillo");
        } else if (color1.equals("R") && color2.equals("R")) {
            System.out.println("Rojo");
        } else if (color1.equals("A") && color2.equals("R")) {
            System.out.println("Magenta");
        } else if (color1.equals("A") && color2.equals("V")) {
            System.out.println("Cyan");
        } else if (color1.equals("A") && color2.equals("A")) {
            System.out.println("Amarillo");
        } else if (color1.equals("V") && color2.equals("A")) {
            System.out.println("Cyan");
        } else if (color1.equals("V") && color2.equals("V")) {
            System.out.println("Verde");
        } else if (color1.equals("V") && color2.equals("R")) {
            System.out.println("Amarillo");

        //Solución 2 - Dividir según el primer color
        if (color1.equals("R")) {
            if (color2.equals("V")) {
                System.out.println("Amarillo");
            } else if (color2.equals("A")) {
                System.out.println("Magenta");
              
            }
             }
              }
        
        //Solución 3 
        if (color1.equals("R") && color2.equals("A") || color1.equals("A") && color2.equals("R")) 
            System.out.println("Magenta");

}
 }



