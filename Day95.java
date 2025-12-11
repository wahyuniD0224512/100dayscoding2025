public class Day95 {
    static void cekAngka(int angka){
        if(angka % 2==0){
            System.out.println(angka+" genap");
        }else{
            System.out.println(angka+" ganjil");
        }
    }
    public static void main(String[] args) {
        cekAngka(2);
        cekAngka(7);
    }
}
