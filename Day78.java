package ddp2025;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {

        String teks = "Nama saya Wahyuni";
        System.out.println("Teks asli : " + teks);
        System.out.println("Uppercase : " + teks.toUpperCase());
        System.out.println("Lowercase : " + teks.toLowerCase());
        System.out.println("Panjang   : " + teks.length());

        System.out.println("\nReplace 'Wahyuni' -> 'Ayu' : " + teks.replace("Wahyuni", "Ayu"));
        System.out.println("Substring 'Wahyuni'        : " + teks.substring(10));

        String nama = "Wahyuni";
        System.out.println("\nEquals ignore case : " + nama.equalsIgnoreCase("wahyuni"));
        System.out.println("Contains \"yu\"     : " + nama.contains("yu"));

        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan nama: ");
        String user = input.nextLine();

        if (user.isEmpty()) {
            System.out.println("Nama tidak boleh kosong!");
        } else {
            System.out.println("Nama kapital : " + user.toUpperCase());
        }

        input.close();
    }
}
