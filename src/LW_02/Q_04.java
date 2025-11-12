package LW_02;
import java.util.*;


public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[50];

        System.out.println("Enter 5 numbers: ");
        for(int i =0;i<5;i++){
            numbers[i] = sc.nextInt();

        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num:numbers){
            if(num>largest){
                secondLargest = largest;
                largest = num;

            }else if(num > secondLargest && num!= largest){
                secondLargest = num;
            }
        }
        System.out.println("The second largest number is: " + secondLargest);
    }

}
