import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileMethods {
    public static String[] fileRead(File file) {
        List<String> linesList = new ArrayList<>();
        try {
            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()) {
                String lineRead = readFile.nextLine();
                linesList.add(lineRead);
            }
            readFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesList.toArray(new String[0]);
    }
    public static void fileWrite(String[] string) {
        try {
            FileWriter writer = new FileWriter("src/files/Output");
            for (String item : string) {
                writer.write(item + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}