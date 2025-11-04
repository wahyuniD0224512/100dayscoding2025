import java.util.Scanner;
public class Day58 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("masukkan nilai N : ");
        int n = i.nextInt();
        for (int j = 1; j <= n; j++) {
            System.out.print(j + " ");
        }
        System.out.println("");
        for (int j = n; j >= 1; j--) {
            System.out.print(j + " ");
        }
    }
}
