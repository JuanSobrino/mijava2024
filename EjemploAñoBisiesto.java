import java.util.Scanner;

public class EjemploAñoBisiesto {
    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un año");
        year = sc.nextInt();


        if ((year % 4 == 0) && (year % 100 !=0)){
            System.out.println("Es bisiesto");

        } else if ((year % 4 == 0) && (year % 400 == 0)){
            System.out.println("Es bisiesto");
        } 
        
    }
    
}
