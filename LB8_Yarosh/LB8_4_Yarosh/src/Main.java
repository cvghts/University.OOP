import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("C:\\Users\\Наташа\\Desktop\\Учеба\\ООП\\LB8_Yarosh\\random.txt");
        byte[] fileBytes = Files.readAllBytes(filePath);
        String str = new String(fileBytes);
        ArrayList<String> list= new ArrayList<String>();
        for(String tmp: str.split("\\.")){
            list.add(tmp.trim());
        }
        Collections.sort(list);
        for(String tmp: list) {
            System.out.println(tmp + ".");
        }
    }
}