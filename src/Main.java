import java.io.File;
public class Main {
    static String[] Students;
    static String[] Attendees;
    public static void main(String[] args) {
        Students = FileMethods.fileRead(new File("src/files/Students"));
        Attendees = FileMethods.fileRead(new File("src/files/Attendees"));

        System.out.println("Students:");
        printArray(Students);

        System.out.println("\nAttendees:");
        printArray(Attendees);

        Students = FileMethods.filterStudents(Students, Attendees);

        System.out.println("\nFiltered Students:");
        printArray(Students);
    }
    static void printArray(String[] array) {
        for (String item : array) {
            System.out.println(item);
        }
    }
}