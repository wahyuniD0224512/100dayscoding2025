import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka=i.nextInt();
        if(angka == 0){
            System.out.println("nol");
        }else if(angka > 0 ){
            System.out.println("bilangan positif");
        }else{
            System.out.println("bilangan negatif");
        }
    }
    
}
