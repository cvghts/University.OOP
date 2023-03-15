import java.nio.file.Files;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class Main {
    static void printUniqueWords(String str) {
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] words = str.split("\\W");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else
                map.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) System.out.println(entry.getKey());
        }
    }
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\Наташа\\Desktop\\Учеба\\ООП\\LB8_Yarosh\\random.txt");
        byte[] fileBytes = Files.readAllBytes(filePath);
        String str = new String(fileBytes);
        printUniqueWords(str);
    }
}