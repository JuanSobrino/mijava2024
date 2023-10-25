import java.util.Scanner;

public class EstacionesAño {
    public static void main(String[] args) {
        int mes, día;

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un día");
        día = sc.nextInt();

        System.out.println("Introduce un mes");
        mes = sc.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12: //31 días
             if (día >= 1 && día <=31) {
            System.out.println("Fecha correcta");
             } else {
            System.out.println("Fecha incorrecta");
             } 

            //Falta case 30 días
            case 4,6,9,11:
            if (día >=1 && día <=30) {
                System.out.println("Fecha correcta");
            } else {
                System.out.println("Fecha incorrecta");
            }

            //Falta case 28 días
            case 2:
            if (día >=1 && día <=28) {
                System.out.println("Fecha correcta");
            } else {
                System.out.println("Fecha incorrecta");
            }


            default:
                System.out.println("Mes incorrecto");     
            
            }
    }
    
}
