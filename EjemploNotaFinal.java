import java.util.Scanner;

public class EjemploNotaFinal {
    public static void main(String[] args) {
        double calif1EV, calif2EV, calif3EV;
        double califexfinal;
        double califtrabajofinal;
        double notaFinal;

        Scanner sc = new Scanner (System.in);

        System.out.println("Dime la nota primera evaluación");
        calif1EV = sc.nextDouble();

        System.out.println("Dime la nota segunda evaluación");
        calif2EV = sc.nextDouble();

        System.out.println("Dime la nota tercera evaluación");
        calif3EV = sc.nextDouble();


        System.out.println("Dime la nota del examen final");
        califexfinal = sc.nextDouble();

        System.out.println("Dime la nota del trabajo final");
        califtrabajofinal = sc.nextDouble();

        notaFinal = ((calif1EV + calif2EV + calif3EV)/3 * 0.55) +
        (califexfinal * 0.3) + (califtrabajofinal * 0.15);

        sc.close();
        
        
        
    }
}
