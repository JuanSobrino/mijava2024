package Bucles;

import java.util.Scanner;

public class Ejercicio3Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1.While
        String caracter=".";

        while (!caracter.equals("")) {
            System.out.println("Dime un caracter");
            caracter = sc.nextLine();

            if (caracter.equals("a") || 
               caracter.equals("e") ||
               caracter.equals("i") ||
               caracter.equals("o") ||
               caracter.equals("u")) {
                System.out.println("Vocal");
               } else {
                System.out.println("No vocal");
               }
               
               
               
               

        }
        

        
        
    }
    
}
