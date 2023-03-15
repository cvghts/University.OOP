import java.util.*;
interface Function {
    int count (int number);
}
class SymbolsCount implements Function {
    @Override 
    public int count (int number) {
        int length = String.valueOf(number).length();
        return length;
    };
}
class NumberFactors implements Function {
    @Override
    public int count (int number) {
        int factor = 0;
        if (number < 2) factor = 1;
          int c = 2;
          HashMap<Integer, Boolean> visited = new HashMap<>();
          for(int i = 0; i < number; i++) {
            visited.put(i, false);
          }
          while (number > 1) {
            if (number % c == 0) {
              if(visited.containsKey(c)){
                if (!visited.get(c)) {
                  factor++;
                  visited.put(c, true);
                }
              }
              number /= c;
            }
            else
              c++;
          }
        return factor;
    };
}
    public class Numbers {
        public static void main(String[] args) {
        System.out.println("Input your number: ");
        Scanner in = new Scanner(System.in);
        SymbolsCount num = new SymbolsCount();
        NumberFactors number = new NumberFactors();
        int user;
        user = in.nextInt();
        in.close();
        System.out.println("Number of digits: " + num.count(user));
        System.out.println("Number of prime factors: " + number.count(user));
    }
    }