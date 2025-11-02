import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka =i.nextInt();
        int a =1;
        do{
            System.out.println(a);
            a++;
        }while(a < angka);
    }
    
}
