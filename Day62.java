import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }

        System.out.println("Jumlah dari 1 sampai " + n + " adalah " + jumlah);
    }
}
