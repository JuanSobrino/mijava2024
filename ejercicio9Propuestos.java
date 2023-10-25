import java.util.Scanner;

public class ejercicio9Propuestos {
    
    public static void main(String[] args) {
        
        //Dado un punto (x1,y1) y otro punto (x2,y2), calcular la distancia

        //1. Declaración de variables
        double x1,y1,x2,y2;
        double distancia;
        double distanciaX, distanciaY;

        //Pedi datos por teclado
        Scanner sca = new Scanner(System.in);
        System.out.println("Dime la coordenada x del primer punto");
        x1 = sca.nextDouble();

        System.out.println("Dime la coordenada y del primer punto");
        y1 = sca.nextDouble();

        System.out.println("Dime la coordenada x del segundo punto");
        x2 = sca.nextDouble();

        System.out.println("Dime la coordenada y del segundo punto");
        y2 = sca.nextDouble();

        //3. Calcular la distancia: Raíz cuadrada de (x2-x1)2 + (y2-y1)2
        distanciaX = Math.sqrt(Math.pow (x2-x1, 2));
        distanciaY = Math.sqrt(Math.pow (y2-y1, 2));
        distancia = Math.sqrt( distanciaX + distanciaY );

        //4. Pintar el resultado
        System.out.println("El resultado es " + distancia);

        

        
    
    
    
    
    }
}
