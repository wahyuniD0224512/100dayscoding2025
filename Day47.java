import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7) untuk menentukan hari: ");
        int angka = input.nextInt();

        String hari;

        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = "erorr";
                break;
        }

        System.out.println("Hari : " + hari);
    }
}
