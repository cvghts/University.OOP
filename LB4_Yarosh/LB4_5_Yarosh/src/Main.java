import java.util.regex.*;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static boolean isNumericWord(String word) {
        Pattern numericPattern = Pattern.compile("[+-]?[0-9]+");
        Matcher numericMatcher = numericPattern.matcher(word);
        if (numericMatcher.matches()) {
            return true;
        }
        return false;
    }
    public static void findFirstOrSecondNumericPalindromicWord(
            String[] sourceWords) {
        List<String> oneOrTwoNumericPalindromicWords = new ArrayList<String>();
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                boolean isInputPalindrome = word.equals(new StringBuilder(word)


                        .reverse().toString()) ? true : false;
                if (isInputPalindrome) {
                    oneOrTwoNumericPalindromicWords.add(word);
                }
            }
        }
        final String message = "A palindrome word consisting only of numbers: ";
        if (oneOrTwoNumericPalindromicWords.size() == 0) {
            System.out.println(message + "No words");
            return;
        }
        if (oneOrTwoNumericPalindromicWords.size() == 1) {
            System.out.println(message + oneOrTwoNumericPalindromicWords.get(0));
        }
    }

    public static void main(String[] args) {
        System.out.println("Input string");
        String string = new Scanner(System.in).nextLine();
        String[] words = string.split(" ");
        findFirstOrSecondNumericPalindromicWord(words);
    }
}