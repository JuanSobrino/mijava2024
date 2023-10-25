import java.util.Scanner;
public class Potencia {

    /**
     * Función que devuelve la potenia de un número
     * @param base
     * @param exponente
     * @return base elevado a exponente
     */
    public static double potencia(double base, int exponente) {

        double resultado=1;
        for(int i=0; i < exponente; i++) {
            resultado = resultado * base;  //Resultado *= base
            System.out.println("El resultado es " + resultado);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedirle al usuario una base y un exponente y devolver la potenia resultante, sin usar Math.pow

        double base;
        int exponente;
        double resultado;

        try {
            System.out.println("Dime la base: ");
            base = Double.parseDouble(sc.nextLine());

            System.out.println("Dime el exponente: ");
            exponente = Integer.parseInt(sc.nextLine());

            resultado = potencia(base, exponente);
        } catch (Exception e) {
            System.out.println("La base debe ser un double y el exponente un entero");
    }

    
}
}
