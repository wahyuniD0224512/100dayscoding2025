
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = i.nextInt();

        String predikat;

        if (nilai >= 90 && nilai <= 100) {
            predikat = "A";
        } else if (nilai >= 80) {
            predikat = "B";
        } else if (nilai >= 70) {
            predikat = "C";
        } else if (nilai >= 60) {
            predikat = "D";
        } else {
            predikat = "E";
        }
       
        System.out.println("Nilai  : " + nilai);
        System.out.println("Predikat     : " + predikat);
    }
}

    
