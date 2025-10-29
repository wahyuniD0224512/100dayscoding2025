import java.util.Scanner;

public class Day52 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int angka = i.nextInt();
        int a = 1;
        while (a <= angka) {
            System.out.print(a + " ");
            a++;
        }
    }
}
