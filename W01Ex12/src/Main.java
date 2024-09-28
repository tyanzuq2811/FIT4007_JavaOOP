public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 7; i <= 100; i += 7) {
            sum += i;
        }
        System.out.println("Tổng các bội số của 7 từ 1 đến 100 là: " + sum);
    }
}