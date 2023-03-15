import java.util.*;
public class Main {
    public static List<Integer> list = new ArrayList<>();
    public static void inputList() {
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            int number = (int) (Math.random()*(2000+1)) - 100;
            list.add(number);
        }
    }
    public static void viewList()
    {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Списки:\n".toUpperCase());
        inputList();
        System.out.println("Входной список:");
        viewList();
        int result;
        int i;
        result = i = 0;
        while(i < list.size() - result)
        {
            if(list.get(i) < 0)
            {
                list.add(list.get(i));
                list.remove(list.get(i));
                result++;
            }
            else
                i++;
        }
        System.out.println("\nИсходный список:");
        viewList();
        System.out.println();
    }
}