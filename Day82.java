import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        System.out.println("Isi 5 angka:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nIsi array :");
        for (int a : angka) {
            System.out.print(a + " ");
        }
    }
}
