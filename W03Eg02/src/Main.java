import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenth of the Rectangle: ");
        float length = scanner.nextFloat();
        System.out.println("Enter the width of the Rectangle: ");
        float width = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.print(rectangle);
        scanner.close();
    }
}