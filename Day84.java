public class Day84 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
        
        int total = 0;

        for (int a : angka) {
            total += a;   
        }

        System.out.println("Total jumlah elemen array = " + total);
    }
}
