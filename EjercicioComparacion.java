public class EjercicioComparacion {
    
    public static void main(String[] args) {

        boolean resultado;
        double temperatura, humedad;

        temperatura = 20.4;
        humedad = 0.66;

        //1. Escribe una condición que diga si la temperatura es mayor que 18
        resultado = (temperatura > 18);
        System.out.println(resultado);

        //2. Escribe una condición que diga si la temperatura es menor o igual que 21
        resultado = (temperatura <= 21);
        System.out.println(resultado);

        //3. Escribe una condición que diga si la humedad es igual al 66%
        resultado = (humedad == 0.66);
        System.out.println(resultado);

        //4. Escribe una condición que diga si la humedad no es igual al 66%
        resultado = (humedad != 0.66);
        System.out.println(resultado);

        //5. Escribe una condición que diga si la temperatura está entre 20 y 25 grados
        resultado = (temperatura >= 20) && (temperatura <= 25);
        System.out.println(resultado);

        //6. Escribe una condición que diga si la temperatura está entre 20 y 25, y la humedad es mayor del 50%
        resultado = (temperatura >= 20) && (temperatura <= 25) && (humedad > 0.50);
        System.out.println(resultado);

        //7. Escribe una condición que diga si la temperatura es menor de 30 o la humedad es mayor de 70%
        resultado = (temperatura < 30) || (humedad > 0.70);
        System.out.println(resultado);
    
    }
}