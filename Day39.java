import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Es Teh");
        System.out.println("4. Es Jeruk");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
        } 
        else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam. Harga: Rp12.000");
        } 
        else if (pilihan == 3) {
            System.out.println("Anda memilih Es Teh. Harga: Rp5.000");
        } 
        else if (pilihan == 4) {
            System.out.println("Anda memilih Es Jeruk. Harga: Rp6.000");
        } 
        else {
            System.out.println("Pilihan tidak tersedia.");
        }
    }
}
