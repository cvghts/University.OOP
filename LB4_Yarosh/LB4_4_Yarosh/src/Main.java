import java.util.regex.*;
import java.util.Scanner;

public class Main {
    public static boolean isNumericWord(String word) {
        Pattern numericPattern = Pattern.compile("[+-]?[0-9]+");
        Matcher numericMatcher = numericPattern.matcher(word);
        if (numericMatcher.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Input string");
        String string = new Scanner(System.in).nextLine();
        String[] words = string.split(" ");
        System.out.println("Number of words that contain only numbers");
        int quantity=0;
        for(String word : words){
            if(isNumericWord(word)){
                quantity++;
            }
        }
        System.out.println(quantity);
    }
}