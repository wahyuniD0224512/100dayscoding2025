public class Day53 {
    public static void main(String[] args) {
        int angka = 1;
        do {
            System.out.println(angka);
            if (angka == 8) {
                System.out.println("Break, berhenti.");
                break;
            }
            angka++;
        } while (angka <= 10);

        System.out.println("Selesai");
    }
}
