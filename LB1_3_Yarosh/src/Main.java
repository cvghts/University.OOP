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
        System.out.println(CanBeEquallyDivided(array));
    }
    public static boolean CanBeEquallyDivided(int[] array){
        for (int i =1; i<array.length; i++){
   if(GetSubArraySum(0, i, array)==GetSubArraySum(i,array.length,array)){
        return true;
    }
}
        return false;
                }
public static int GetSubArraySum(int start, int end, int[] array){
        int sum =0;
        for (int i =start; i<end; i++){
        sum+=array[i];
        }
        return sum;
        }
}