import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Operator tersedia: +  -  *  /");
        System.out.print("Masukkan operator: ");
        char pilihan = i.next().charAt(0);

        System.out.print("Masukkan angka pertama : ");
        int angka1 = i.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = i.nextInt();

        switch (pilihan) {
            case '+':
                System.out.println("Hasil penjumlahan: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil pengurangan: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil perkalian: " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Tidak boleh dibagi 0!");
                } else {
                    System.out.println("Hasil pembagian: " + (angka1 / angka2));
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}
