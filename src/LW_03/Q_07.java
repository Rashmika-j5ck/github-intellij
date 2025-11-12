package LW_03;

import java.util.*;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.printf("\nEnter a nmuber: ");
        int num = sc.nextInt();
        int count = 0;



            while (num != 0) {
                if (num < 0) {

                }
                num = num / 10;
                count++;
            }
            System.out.printf("\nThe digit of the number is: " + count);
        }
    }
}