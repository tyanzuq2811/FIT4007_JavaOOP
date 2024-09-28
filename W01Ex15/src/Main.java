public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập ít nhất một số");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = min;

        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println("Giá trị nhỏ nhất: " + min);
        System.out.println("Giá trị lớn nhất: " + max);
    }
}