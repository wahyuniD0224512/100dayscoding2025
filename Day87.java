import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {
        String[] nama = {"ayu", "muti", "feby", "amel"};
        Scanner i = new Scanner(System.in);
        System.out.println("masukkan nama yang di cari : ");
        String cari = i.nextLine();
        boolean ditemukan = false;

        for (String n : nama) {
            if (n.equals(cari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println(cari + " ditemukan di dalam array");
        } else {
            System.out.println(cari + " tidak di temukan!");
        }
    }

}
