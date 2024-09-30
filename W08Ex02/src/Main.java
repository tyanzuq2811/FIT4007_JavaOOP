import java.util.Scanner;

class TuoiKhongHopLeException extends Exception{
    public TuoiKhongHopLeException (String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        try {
            int age = scanner.nextInt();
            checkAge (age);
        } catch (TuoiKhongHopLeException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Undefined error. Please try again.");
        }
    }
    public static void checkAge(int age) throws TuoiKhongHopLeException{
        if (age < 18){
            throw new TuoiKhongHopLeException("Age must be greater than or equal to 18.");
        }
    }
}

