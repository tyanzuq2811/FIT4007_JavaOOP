import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ){
            System.out.println("Enter student id : ");
            String id = scanner.nextLine();
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student email: ");
            String email = scanner.nextLine();
            System.out.println("Enter student address: ");
            String address = scanner.nextLine();

            Student student = new Student(id, name, email, address);
            students.add(student);
        }

        for (Student student : students){
            student.display();
        }
    }
}