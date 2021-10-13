package Arrays;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50,60};
        int [] arr2 = {10,20,30,40,50,60};
        int [] result = new int[arr1.length];

        for (int i=0; i<arr1.length; i++) {
                    result[i] = arr1[i] + arr2[i];
                    System.out.print(result[i] + " ");
                }
            }
        }


