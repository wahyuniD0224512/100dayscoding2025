package ddp2025;

public class Day76 {

    public static void main(String[] args) {

        String kata1 = "nama saya wahyuni";
        String kata2 = "Nama Saya Wahyuni";
        String kosong = "";

        System.out.println("equals() : " + kata1.equals(kata2));

        System.out.println("equalsIgnoreCase() : " + kata1.equalsIgnoreCase(kata2));

        System.out.println("contains(\"wahyuni\") : " + kata1.contains("wahyuni"));

        System.out.println("isEmpty() : " + kosong.isEmpty());
    }
}
