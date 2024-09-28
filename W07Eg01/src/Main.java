import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Double> dsDiem = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<4; i++){
            System.out.println("Nhap diem sinh vien thu " + (i+1)+ ": ");
            dsDiem.add(scanner.nextDouble());
        }

        for (int i = 0; i < dsDiem.size(); i++){
            System.out.println("Diem sinh vien thu " + (i+1) + ": "+ dsDiem.get(i));
        }
    }
}