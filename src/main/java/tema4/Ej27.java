package tema4;
import java.util.Scanner;
public class Ej27 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        
        do {            
            System.out.println("Introduce un numerin impar");
            num=sc.nextInt();
        } while (num<=0&&num%2!=0);
        
        
        for (int i = 0; i < num; i++) {
            System.out.print("*");
            if (i==0||i==num-1) {
                 for (int j = 0; j < num-2; j++) {
                     System.out.print("*");
                }
            }else{
                for (int j = 0; j < num-2; j++) {
                     System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
