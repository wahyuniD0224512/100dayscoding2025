public class Day85 {
    public static void main(String[] args) {
        int [] arr = {2,8,2,3,9,1};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("angka maksimal dalam array : "+max);
    }
    
}
