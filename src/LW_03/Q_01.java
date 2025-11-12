package LW_03;
import java.util.*;


public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number a: ");
        int a = sc.nextInt();

        System.out.printf("Enter number b: ");
        int b= sc.nextInt();

        System.out.printf("Enter number c: ");
        int c = sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.printf("The smallest number is " + a);

            }else{
                System.out.printf("The smallest number is " + c);
            }
        }else{
            if(b<c){
                System.out.printf("The smallest number is " + b);
            }else{
                System.out.printf("The smallest number is " + c);
            }
        }
    }


}
