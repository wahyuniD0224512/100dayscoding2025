import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = "wahyuni";
        String passwordd = "ayu2509";

        String username, password;

        System.out.println("=== LOGIN AKUN ===");

        while (true) {
            System.out.print("\nMasukkan username: ");
            username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            password = scanner.nextLine();

            if (username.equals(user) && password.equals(passwordd)) {
                System.out.println("\nLogin berhasil! Selamat datang.");
                break;
            } else {
                System.out.println("\nUsername atau password salah. Coba lagi.");
            }
        }

    }
}
