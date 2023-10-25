import java.util.Scanner;
public class EjemploEdad {
    public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        if ((edad>=1) && (edad<=5)) {
            System.out.println("Es un niño");
        } else if ((edad>=6) && (edad<=12)) {
            System.out.println("Es un chaval");
        } else if ((edad>=13) && (edad<=18)) {
            System.out.println("Es un adolescente");
        } else if ((edad>=19) && (edad<=25)) {
            System.out.println("Es lo mejor");
        } else if ((edad>=26) && (edad<=45)) {
            System.out.println("Es un hombre");
        } else if ((edad>=46) && (edad<=65)) {
            System.out.println("Es un carroza");
        } else if (edad>75) {
            System.out.println("Es un viejo");
        }

    
        

}
}
    
        
    

