import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];

        while(true){
            System.out.println("1 .Nhập thông tin xe");
            System.out.println("2. Xuất bảng kê khai thuế");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < vehicles.length; i++){
                        System.out.println("Nhập thông tin xe " + (i + 1));
                        System.out.print("Tên chủ xe: ");
                        String ownerVehicle = scanner.next();
                        System.out.print("Dòng xe: ");
                        String model = scanner.next();
                        System.out.print("Giá trị xe: ");
                        double price = scanner.nextDouble();
                        System.out.print("Dung tích xy lanh: ");
                        int capacity = scanner.nextInt();
                        vehicles[i] = new Vehicle(ownerVehicle, model, price, capacity);
                    }
                    break;
                case 2:
                    System.out.println("Bảng kê khai thuế trước bạ.");
                    System.out.printf("%-30s %-20s %10.2s %10s %10.2s\n","Hãng xe","Dòng xe", "Giá trị xe", "Dung tích", "Thuế");
                    for (Vehicle vehicle : vehicles) {
                        System.out.printf("%-30s %-20s %10.2f %10d %10.2f\n", vehicle.getOwnerVehicle(), vehicle.getModel(), vehicle.getPrice(), vehicle.getCapacity(), vehicle.getTax());
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}