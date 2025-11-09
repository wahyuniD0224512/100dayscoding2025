import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = i.nextInt();

        int hasil = 1;
        for (int j = 1; j <= n; j++) {
            hasil *= j; 
        }

        System.out.println("Hasil perkalian dari 1 sampai " + n + " : " + hasil);
    }
}
