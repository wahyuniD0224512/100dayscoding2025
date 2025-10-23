
import java.util.Scanner;


public class Day46 {
    public static void main(String[] args) {
        System.out.println("====MENU=====");
        System.out.print("Masukkan minuman yang ingin dipilih :");
        String a = "1. kopi";
        String b = "2. teh";
        String c = "3. jus";
        Scanner ayu = new Scanner(System.in);   
        int pilihan = ayu.nextInt();
     switch(pilihan){
         case 1:
             System.out.println("Saya pilih kopi");
             break;
         case 2:
             System.out.println("Saya pilih teh");
             break;
         case 3:
             System.out.println("Saya pilih jus");
              break;
         default:
             System.out.println("Tidak ada dalam menu");
     }
    }
}
