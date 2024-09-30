public class Main {
    public static class DiemSoKhongHopLeException extends Exception {
        public DiemSoKhongHopLeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            kiemTraDiemSo(12);
        } catch (DiemSoKhongHopLeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void kiemTraDiemSo(int diem) throws DiemSoKhongHopLeException {
        if (diem < 0 || diem > 10) {
            throw new DiemSoKhongHopLeException("Điểm số phải nằm trong khoảng từ 0 đến 10.");
        }
    }
}