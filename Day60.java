import java.util.Scanner;
public class Day60 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = i.nextInt();
        System.out.println("Angka ganjil");
        for (int j = n; j >= 1; j--) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }

        }
        System.out.println("");
        System.out.println("Angka genap");
        for (int j = n; j >= 1; j--) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }

        }
        System.out.println("");
    }

}
