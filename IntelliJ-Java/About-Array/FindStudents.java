import java.util.Scanner;
import java.lang.String;

public class FindStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.println("Enter student's name: ");
        String studentName = input.nextLine();

        boolean isExist = false;
        int num = students.length;

        for (int i = 0; i < num; i++) {
            if (students[i].equals(studentName)) {
                System.out.println("Position of student in the list " + studentName + " is: " + (i + 1));
                isExist = true;
                break;
            }

            if (isExist == true) {
                System.out.println("Not found" + studentName + " in the list");
            }
        }
    }
}
