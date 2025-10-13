import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = i.nextInt();

        if (nilai >= 70) {
            System.out.println("Kamu lulus.");

            if (nilai >= 90) {
                System.out.println("Nilaimu sangat baik!");
            }
        }
    }
}
