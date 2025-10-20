public class Day43 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " kelipatan 3 dan 5");
            }
            // Cek kelipatan 3 saja
            else if (i % 3 == 0) {
                System.out.println(i + " kelipatan 3");
            }
            // Cek kelipatan 5 saja
            else if (i % 5 == 0) {
                System.out.println(i + " kelipatan 5");
            }
        }
    }
}
