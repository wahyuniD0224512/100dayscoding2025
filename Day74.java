import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilih = i.nextInt();

            if (pilih == 1) {
                System.out.println("Hasil 5 + 3 = " + (5 + 3));
            } else if (pilih == 2) {
                System.out.println("Hasil 5 * 3 = " + (5 * 3));
            } else if (pilih == 3) {
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Menu tidak tersedia");
            }

            System.out.println();

        } while (pilih != 3);
    }
}
        
