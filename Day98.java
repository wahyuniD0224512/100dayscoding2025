
import java.util.Scanner;
public class Day98 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        int a = 1, b = 1;

        System.out.print("Deretan Fibonacci: ");

        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}    
