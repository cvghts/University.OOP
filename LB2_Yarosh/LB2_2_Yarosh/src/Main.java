import java.util.Scanner;
public class Main {
    public static void main(String ... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String line= scanner.nextLine();
        int sum=0;
        int tempNum = 0;
        for (int i=0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                tempNum = (10 * tempNum) + Character.getNumericValue(line.charAt(i));
            }
            else {
                sum += tempNum;
                tempNum = 0;
            }
        }
        sum +=tempNum;
        System.out.println("Sum:");
        System.out.println(sum);
    }
}