import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        System.out.println("Input string");
        String string = new Scanner(System.in).nextLine();
        String[] words = string.split(" ");
        System.out.println("Words 4 characters long");
        for(String word : words){
            if(word.length() == 4){
                System.out.println(word);
            }
        }
    }
}
