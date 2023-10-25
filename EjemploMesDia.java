    import java.util.Scanner;

public class EjemploMesDia {
    public static void main(String[] args) {
        int mes;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un mes");
        mes = sc.nextInt();

        switch (mes) {
            case 3,4,5: 
            System.out.println("Primavera");
                break;
            case 6,7,8: 
            System.out.println("Verano");
                break;
            case 9,10,11: 
            System.out.println("Otoño");
                break;
            case 12,1,2: 
            System.out.println("Invierno");
                break;  
            default:
                break;     
            
            }
    }
    
}

 
