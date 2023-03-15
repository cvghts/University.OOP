import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner; // import scanner class



public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create scanner obj
        System.out.println("Enter sentence");
        String sentence = myObj.nextLine(); // read input
        String convertSentence = convertCyrilic(sentence); // using method to convert from lat to cyr
        System.out.println("Sentence after convert:" + convertSentence); // output
    }



    public static String convertCyrilic(String message){
        char[] abcWord = message.toLowerCase().toCharArray();
        List<String> abcMessage=new ArrayList<String>();
        for (int i = 0; i < abcWord.length; i++) {
            if (abcWord[i] == 'z' && abcWord[i+1] == 'h'){
                abcMessage.add("zh");
                i++;
            }
            else
            if (abcWord[i] == 'j' && abcWord[i+1] == 'k'){
                abcMessage.add("jk");
                i++;
            }else {
                abcMessage.add(String.valueOf(abcWord[i]));
            }

        }
        StringBuilder result = new StringBuilder();

        String[] abcCyr =  {" ","а","б","в","г","д","ѓ","е", "ж","з","ѕ","и","ј","к","л","љ","м","н","њ","о","п","р","с","т", "ќ","у", "ф","х","ц","ч","џ","ш", "А","Б","В","Г","Д","Ѓ","Е", "Ж","З","Ѕ","И","Ј","К","Л","Љ","М","Н","Њ","О","П","Р","С","Т","Ќ", "У","Ф","Х","Ц","Ч","Џ","Ш","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","/","-"};
        String[] abcLat = {" ","a","b","v","g","d","]","e","zh","z","y","i","j","k","l","q","m","n","w","o","p","r","s","t","'","u","f","h", "c",";", "x","{","A","B","V","G","D","}","E","Zh","Z","Y","I","J","K","L","Q","M","N","W","O","P","R","S","T","KJ","U","F","H", "C",":", "X","{", "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","/","-"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < abcMessage.size(); i++) {
            for (int x = 0; x < abcLat.length; x++ ) {
                if (Objects.equals(abcMessage.get(i), abcLat[x])) {
                    result.append(abcCyr[x]);
                    break;
                }
            }
        }
        return result.toString();
    }
}