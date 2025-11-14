import java.util.Scanner;
public class Day68 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("ukuran persegi: ");
        int n = i.nextInt();

        for (int j = 1; j <= n; j++) {
            for (int a = 1; a <= n; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
