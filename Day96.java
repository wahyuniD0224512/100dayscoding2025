public class Day96 {

    int tambah(int a, int b) {
        return a + b;
    }

    int kurang(int a, int b) {
        return a - b;
    }

    int kali(int a, int b) {
        return a * b;
    }

    double bagi(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Day96 k = new Day96();

        System.out.println("Hasil Tambah: " + k.tambah(10, 5));
        System.out.println("Hasil Kurang: " + k.kurang(10, 5));
        System.out.println("Hasil Kali  : " + k.kali(10, 5));
        System.out.println("Hasil Bagi  : " + k.bagi(10, 5));
    }
}    
