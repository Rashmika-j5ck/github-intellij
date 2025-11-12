package LW_02;

import java.util.StringTokenizer;


public class Q_05 {
    public static void main(String[] args){
        String sentence = "A man, a plan, a canal, Panama!";

        StringBuilder cleaned = new StringBuilder();
        StringTokenizer st = new StringTokenizer(sentence, " ,.!?;:");
        while(st.hasMoreTokens()){
            cleaned.append(st.nextToken().toLowerCase());

        }

        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        if(cleanedStr.equals(reversedStr)){
            System.out.println("The sentence is a palindrome");
        }else{
            System.out.println("The sentence is not a palindrome");
        }
    }
}
