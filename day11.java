import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
        System.out.print("Masukkan alamat : ");
        String alamat = input.next();
        
        System.out.println("Masukkan Data ");
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Alamat : "+alamat);
    }
}
