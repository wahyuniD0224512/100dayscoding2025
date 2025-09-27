public class day20 {
    public static void main(String[] args) {
        int a = 42;        
        double b = 19.75;   
        char c = 'W';     
        
        String s1 = Integer.toString(a);
        String s2 = Double.toString(b);
        String s3 = Character.toString(c);
        
        System.out.println("Hasil Konversi int :  " + s1);
        System.out.println("Hasil Konversi double :  " + s2);
        System.out.println("Hasil Konversi char:  " + s3);
    }
}
