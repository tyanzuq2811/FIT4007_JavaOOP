public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập giá trị n từ dòng lệnh.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            if (n < 0) {
                System.out.println("Giá trị n phải là số nguyên dương.");
                return;
            }

            int sum = n * (n + 1) / 2;
            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Định dạng đầu vào không hợp lệ. Vui lòng nhập số nguyên.");
        }
    }
}