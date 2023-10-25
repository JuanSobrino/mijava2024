public class Ejercicio10Bucle {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n; i++) {

            System.out.println("imprimir " + (i+1) + " asteriscos");

            for(int j=0; j < (i+1); j++) {
                System.out.println("*");
            }

            System.out.println();
        }
    }
    
}
