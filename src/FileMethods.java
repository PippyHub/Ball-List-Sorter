import java.io.File;
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
    static String[] filterStudents(String[] students, String[] attendees) {
        List<String> filteredList = new ArrayList<>();
        for (String student : students) {
            if (student.startsWith("Ropu")) {
                filteredList.add(student);
                continue;
            }
            for (String attendee : attendees) {
                if (attendee.contains(student)) {
                    filteredList.add(student);
                    break;
                }
            }
        }
        return filteredList.toArray(new String[0]);
    }
}