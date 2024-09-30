import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter the first integer: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the second integer: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the operator (+,-,*,/): ");
            char operator =  scanner.nextLine().charAt(0);
            int result;

            switch (operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0){
                        throw new ArithmeticException("Can't divide by 0.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator.");
            }
            System.out.println("Result: " + result);
        }catch (NumberFormatException e){
            System.out.println("Error: pls enter a valid integer.");
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}