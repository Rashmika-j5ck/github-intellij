package LW_03;
import java.util.*;


public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.printf(year + " is a leap year");
            }else if(year % 400 == 0){
                System.out.printf(year + " is a leap year");

            }else{
                System.out.printf(year + " is not a leap year");
            }
        }
    }
}
