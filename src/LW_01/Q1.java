package LW_01;
import java.util.*;


public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the word: ");
        String word = input.nextLine();

        if(word.length() %2 != 0 ){
            int mid = word.length()/2;
            char midCharacter = word.charAt(mid);

            System.out.println("The middle character is "+ midCharacter);


        }else{
            System.out.println("The word should be an odd length word");

        }




    }

}
