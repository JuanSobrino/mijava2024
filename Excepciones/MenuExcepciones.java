package Excepciones;

import java.util.Scanner;

public class MenuExcepciones {

    public static void main(String[] args) {
        //Menú que pide una opción numérica y comprobamos que lo introducido es correcto
        int opcion=0;


        Scanner sc = new Scanner(System.in);

        while(opcion !=3) {
            System.out.println("1. Saludo anónimo");
            System.out.println("2. Saludo con tu nombre");
            System.out.println("3. Salir");

        try {
            System.out.println("Dime una opción:");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                 System.out.println("Buenas tardes");
                 break;
                case 2:
                 //System.out.println("Dime tu nombre ");
                 //String noombre = sc.nextLine();
                 System.out.println("Buenas tardes Javi");
                 break;
                 default:
                  System.out.println("Adiós, que tengas un buen día");
                 break;
            }
        
        } catch (Exception ex) {
            System.out.println("Te has equivocado al escribir la opción, por favor escribe (1,2,3)");
        } 
    }
   }
 }
    

