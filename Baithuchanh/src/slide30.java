import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Hay nhap so lon hon  0.");
        } else {
            int tong = TongChuSo(n);
            System.out.println("Tong cac chu so " + n + " la: " + tong);
        }

        scanner.close();
    }
    private static int TongChuSo(int soNguyen) {
        int tong = 0;

        while (soNguyen > 0) {
            tong += soNguyen % 10;

            soNguyen /= 10;
        }

        return tong;
    }
}

