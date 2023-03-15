import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        System.out.println("Input string");
        String string = new Scanner(System.in).nextLine();
        char symbol[] = string.toCharArray();
        int max_length = 0, length = 0;
        for (int i = 0; i < symbol.length - 1; i++) {
            if (symbol[i] == symbol[i + 1]) {
                length++;
            }
            else {
                length++;
                if (max_length < length) {
                    max_length = length;
                }
                length = 0;
            }

        }
        if (max_length < length)
            max_length = length;
        System.out.println("The length of the longest character sequence =" + max_length);
    }
}