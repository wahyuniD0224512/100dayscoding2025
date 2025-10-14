import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka =i.nextInt();
        if(angka %2==0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
    }
}
