import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("pilih menu : ");
        int pilihan = i.nextInt();
         System.out.print("masukkan angka pertama : ");
                int angka1 = i.nextInt();
                System.out.print("masukkan angka kedua : ");
                int angka2 =i.nextInt();
               
        switch(pilihan){
            case 1:
                int totaljumlah= angka1+angka2;
                System.out.println("hasil penjumlahan : "+totaljumlah);
                break;
            case 2:
                int totalkurang=angka1-angka2;
                System.out.println("hasil pengurangan "+totalkurang);
                break;
            case 3:
                int totalkali=angka1*angka2;
                System.out.println("hasil perkalian "+totalkali);
                break;
             case 4:
             
               if(angka2 == 0){
                   System.out.println("tidak boleh 0");
               }else{
                   int totalbagi = angka1/angka2;
                    System.out.println("hasil pembagian "+totalbagi);
               }
               break;
             default:
                 System.out.println("tidak valid");
        }       
    }  
}
