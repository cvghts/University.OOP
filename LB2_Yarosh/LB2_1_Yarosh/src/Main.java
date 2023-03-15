import java.util.Scanner;
public class Main {
    static boolean isEd(String input) {
        return input.endsWith("ed");
    }
    public static void main(String ... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String word= scanner.nextLine();
        System.out.println(isEd(word));
    }
}