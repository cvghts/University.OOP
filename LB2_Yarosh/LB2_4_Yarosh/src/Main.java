import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String line= scanner.nextLine();
        System.out.println("The words");
        String[] word = line.split("\\s");
        for (String subLine:word) {
            System.out.println(subLine);
        }
    }
}