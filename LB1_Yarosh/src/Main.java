import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length=scanner.nextInt();
        int []array = new int[length];
        for (int i=0; i < array.length; i++) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }
        System.out.println(isSorted(array));
    }
    public static boolean isSorted(int [] array) {
        if (array.length>=2) {
            boolean number = false;
            for (int i=0; i <array.length-1; i++) {
                if (array[i + 1] >= array[i]) {
                    number = true;
                } else {
                    number = false;
                    break;
                }
            }
            return number;
        }
        return false;
    }
}
