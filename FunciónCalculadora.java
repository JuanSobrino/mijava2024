public class FunciónCalculadora {
    public static double calculadora(double num1, double num2, String op) {

        if (op.equals("+")) {
            return num1 + num2;

            
        } else if (op.equals("-")) {
          return num1 - num2;
          } else {
            return 0;
          }
    }
    

    public static void main(String[] args) {

        System.out.println(calculadora (3.5, 2, "-"));
        System.out.println(calculadora (3, 2, "+"));
        
    }
    
}
