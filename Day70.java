import java.util.Scanner;
public class Day70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar   : ");
        int lebar = input.nextInt();

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
