import java.util.Scanner;
public class Day61 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan nilai M : ");
        int m = i.nextInt();
        System.out.print("Masukkan nilai N : ");
        int n = i.nextInt();
        for (int j = 1; j <= n; j++) {
            if (j % m == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println("");
    }
}
