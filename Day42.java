
import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();
        System.out.print("Masukkan potongan: ");
        double potongan = input.nextDouble();
        double gajiBersih = gajiPokok - potongan;

        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Gaji Pokok    : " + gajiPokok);
        System.out.println("Potongan      : " + potongan);
        System.out.println("Gaji Bersih   : " + gajiBersih);
    }
}

