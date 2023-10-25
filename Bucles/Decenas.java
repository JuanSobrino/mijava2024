package Bucles;
public class Decenas {
    public static void main(String[] args) {
        
        //Mostrar todas las decenas que hay entre el 100 y 300

        for(int num=100; num<=300; num = num+10 ) { 
            if (num % 10 == 0) {
            System.out.println(num);
            }
        }

        for(int num=100; num<=300; num = num+=10 ) { 
            System.out.println(num);     
        }
    
}
}
