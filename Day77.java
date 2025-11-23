package ddp2025;

public class Day77 {

    public static void main(String[] args) {

        String kalimat = "   Nama saya Wahyuni   ";
        String rapi = kalimat.trim();
        String potong = rapi.substring(10, 17);
        String ganti = rapi.replace("Wahyuni", "Ayu");

        System.out.println("Kalimat Asli     : " + kalimat);
        System.out.println("Hasil trim       : " + rapi);
        System.out.println("Hasil substring  : " + potong);
        System.out.println("Hasil replace    : " + ganti);
    }
}
