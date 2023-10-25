package Bucles;
public class PrimerBucle {
    public static void main(String[] args) {
        
        int num = 1;
        
        while (num <=3) {
            //Nos tiene que acercar a que la condición sea fase, para que el bucle termine
            System.out.println(num);
            num++;
        }
        
        num = 1;
        while (true) {
            System.out.println(num);
            num++;

            if (num == 3000) {
                break;
            }
        }

        System.out.println(num);







    }
}
