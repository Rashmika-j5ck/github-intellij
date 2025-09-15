package LW_01;

import java.util.*;

public class Q3 {
    public static void main(String[] args){
        Scanner length = new Scanner(System.in);

        System.out.println("Enter the length in cm: ");
        Double cm = length.nextDouble();

        Double inches = cm /2.54;
        int feet = (int)(inches / 12);

        Double Rinches = inches%12;

        System.out.println("The length in feet is "+ feet+ " and The length in inches is "+ Rinches);



    }
}
