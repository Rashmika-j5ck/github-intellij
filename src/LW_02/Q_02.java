package LW_02;

import javax.xml.transform.Source;
import java.util.*;


public class Q_02 {

    static  void digit(int num){

        if( num == 0){
            System.out.println("number should be a positive number");


        }else{
            int count = 0;
            while(num>0){
                num = num/10;
                count++;
            }
            System.out.println( "The digits are: " + count);

        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if(num<0){
                break;

            }
            digit(num);
        }

    }

}
