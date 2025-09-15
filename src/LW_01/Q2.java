package LW_01;

import java.util.*;





public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First name: ");
        String Fname = input.nextLine();

        System.out.println("Enter the Middle name: ");
        String Mname = input.nextLine();

        System.out.println("Enter the Last name: ");
        String Lname = input.nextLine();

        System.out.println("The name is " + Lname + "," + " "+ Fname + " " + Mname.charAt(0)+ ".");



    }
}
