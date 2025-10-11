public class Day34 {
    public static void main(String[] args) {
        int a = 19;
        int b = 5;
        int c = 8;
        int d = 4;
        boolean hasil = ((a + b) > (b * c)) && ((a - c) != 0) || (d < a);
        System.out.println(hasil);  
    }
}
