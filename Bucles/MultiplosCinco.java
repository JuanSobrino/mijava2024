package Bucles;
public class MultiplosCinco {
    public static void main(String[] args) {
        
        //Todos los múltiplos de 5, entre el 500 y el 100

        for(int num=500; num>=100; num = num--) {
            //Es múltiplo
            if (num % 5 == 0) {
                System.out.println(num);
            }     
        }

        int num=500;
        while (num>=100) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num--;
        }

        
        
    }
    
}
