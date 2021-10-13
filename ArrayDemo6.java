package Arrays;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,5,7,35,40,66};
        int sum=0;

        for (int i=0; i<arr1.length; i++){
            sum += arr1[i];
        }

        int avg = sum/arr1.length;
        System.out.println("Sum ="+sum);
        System.out.println("Avg ="+avg);
    }
}
