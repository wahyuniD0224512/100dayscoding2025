package bilangan.ganjil;
import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s = 1;
        System.out.print("Masukkan angka : ");
        int a = sc.nextInt();
        System.out.println("Angka yang dimasukkan : "+a);
        for (int i = 1; i <=  a; i++) {
            s*=i;
        }
        System.out.println("Faktorial dari " + a + " adalah : " + s);
       
        }
    }

