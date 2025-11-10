import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai M : ");
        int m = input.nextInt();
        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();
        int hasil = 1; 
        for (int i = 1; i <= n; i++) {
            hasil *= m; 
        }

        System.out.println(m + " pangkat " + n + " = " + hasil);

        input.close();
    }
}
    

