import java.util.Scanner;

public class days100 {
    // Array global untuk menyimpan array BARU hasil proses peretasan
    // Array ini akan digunakan kembali oleh fungsi susunKode()
    static int[] arrayBaru;

    // =====================================================
    // Fungsi retas
    // Tugas:
    // 1. Membentuk array baru menggunakan aturan modulo
    // 2. Menghitung total pergeseran (linear probing)
    // =====================================================
    static int retas(int[] arr) {

        int n = arr.length;

        // Membuat array baru dengan panjang yang sama
        arrayBaru = new int[n];

        // Array boolean untuk menandai apakah suatu indeks sudah terisi
        boolean[] terisi = new boolean[n];

        // Variabel untuk menyimpan total pergeseran
        int totalPergeseran = 0;

        // Memproses setiap elemen pada array lama
        for (int i = 0; i < n; i++) {

            int x = arr[i];          // Nilai elemen
            int idx = x % n;         // Indeks awal berdasarkan modulo

            // Jika indeks tujuan sudah terisi,
            // maka lakukan pergeseran ke kanan
            while (terisi[idx]) {
                idx = (idx + 1) % n; // Geser ke kanan (circular)
                totalPergeseran++;  // Setiap geser dihitung
            }

            // Simpan nilai ke array baru pada indeks kosong
            arrayBaru[idx] = x;
            terisi[idx] = true;
        }

        // Mengembalikan total pergeseran
        return totalPergeseran;
    }

    // =====================================================
    // Fungsi susunKode
    // Tugas:
    // 1. Menentukan panjang kode dari jumlah digit p
    // 2. Menyusun String kode dari array baru
    // =====================================================
    static String susunKode(int p) {

        // Panjang kode ditentukan dari jumlah digit p
        int panjangKode = String.valueOf(p).length();

        StringBuilder kode = new StringBuilder();

        int i = 0;

        // Menyusun kode dari elemen array baru secara berurutan
        while (kode.length() < panjangKode && i < arrayBaru.length) {
            kode.append(arrayBaru[i]);
            i++;
        }

        // Mengambil hanya sejumlah digit yang dibutuhkan
        return kode.substring(0, panjangKode);
    }

    // =====================================================
    // Fungsi utama
    // =====================================================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input jumlah elemen array
        int n = sc.nextInt();

        // Input elemen array lama
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Memanggil fungsi retas
        int p = retas(arr);

        // Memanggil fungsi susunKode
        String kode = susunKode(p);

        // Menampilkan kode sandi
        System.out.println(kode);
    }
}
