package LW_03;
import java.util.*;



public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your choice: 6,9,12,15,18,21,30,100: ");

        int choice = sc.nextInt();

        switch(choice){
            case 6:
                System.out.printf("Million");
                break;
            case 9:
                System.out.printf("Billion");
                break;
            case 12:
                System.out.printf("Trillion");
                break;
            case 15:
                System.out.printf("Quadrillion");
                break;
            case 18:
                System.out.printf("Quintillion");
                break;
            case 21:
                System.out.printf("Sextillion");
                break;
            case 30:
                System.out.printf("Nonillion");
                break;
            case 100:
                System.out.printf("Googol");
                break;

        }
    }
}
