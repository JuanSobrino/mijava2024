package Bucles;

import java.util.Scanner;

public class BaseExponente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, exponente;
        double potencia;

        System.out.println("Dame una base");
        base = sc.nextDouble();

        System.out.println("Dame un exponente");
        exponente = sc.nextDouble();

        for(int i=0; i<exponente; i++) {
            potencia = 0;
            potencia = exponente * base;
            System.out.println("La potencia es " + potencia);
        }

    

        


          
    }
    
}

