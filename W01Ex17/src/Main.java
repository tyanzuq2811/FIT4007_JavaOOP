import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println(number + " là zero");
        } else if (number % 2 == 0) {
            System.out.println(number + " là số chẵn");
        } else {
            System.out.println(number + " là số lẻ");
        }
    }
}