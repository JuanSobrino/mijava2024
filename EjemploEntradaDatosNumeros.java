import java.util.Scanner; //Importar la clase para poder usarla
public class EjemploEntradaDatosNumeros {
    
    public static void main(String[] args) {
        int edad;
        double peso;
     
        //Crear el objeto Scanner para leer de teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad: ");

        //Leer un entero de teclado
        edad = sc.nextInt();

        System.out.println("Tu edad es " + edad);


        System.out.println("Dime tu peso: ");
        peso = sc.nextDouble();
        System.out.println("Tu peso es " + peso);
        
    }
}
