package LW_03;

import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println("Select one color from the above list:");

        int selection = sc.nextInt();

        switch(selection){
            case 0:
                System.out.printf("You selected Magenta");
                break;
            case 1:
                System.out.printf("You selected Cyan");
                break;
            case 2:
                System.out.printf("You selected Red");
                break;
            case 3:
                System.out.printf("You selected Blue");
                break;
            case 4:
                System.out.printf("You selected Green");
                break;
            default:
                System.out.printf("Invalid selection");
        }
    }
}
