import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        System.out.println("Input string");
        String string = new Scanner(System.in).nextLine();
        String[] words = string.split(" ");
        System.out.println("Number of words containing only Latin alphabet characters");
        int quantity=0;
        for(String word : words){
            if(word.matches("[a-zA-Z]+")){
                quantity++;
            }
        }
        System.out.println(quantity);
    }
}
