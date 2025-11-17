import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("masukkan tinggi segitiga : ");
        int tinggi = i.nextInt();
        
        for (int j = 1; j <= tinggi; j++) {    
            for (int k = 1; k <= j; k++) {     
                System.out.print("* ");      
            }
            System.out.println();           
        }
    }
}
