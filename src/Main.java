import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
     static String[] Students;
    static String[] Attendees;
    public static void main(String[] args) {
        Students = FileMethods.fileRead(new File("src/files/Students"));
        Attendees = FileMethods.fileRead(new File("src/files/Attendees"));
        FileMethods.fileWrite(filterStudents(Students, Attendees));
    }
    static String[] filterStudents(String[] string1, String[] string2) {
        List<String> filteredList = new ArrayList<>();
        for (String student : string1) {
            if (student.startsWith("Ropu")) {
                filteredList.add(student);
                continue;
            }
            for (String attendee : string2) {
                if (attendee.contains(student)) {
                    filteredList.add(student);
                    break;
                }
            }
        }
        return filteredList.toArray(new String[0]);
    }
}