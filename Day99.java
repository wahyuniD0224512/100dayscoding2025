
import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = i.nextInt();

        for (int j = 2; j <= n; j++) {
            boolean prima = true;

            for (int k = 2; k * k <= j; k++) {
                if (j % k == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(j + " ");
            }
        }
    }
}
