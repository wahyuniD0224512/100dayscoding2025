import java.util.Scanner;

public class Day50{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = i.nextInt();

        String hasil = (angka % 2 == 1) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}
