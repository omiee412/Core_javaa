package Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
         int [] output = takeArray();
        for (int i=0; i<= output.length; i++){
            System.out.println(output[i]);
        }
    }
    static int [] takeArray () {
        int [] arr1 = new int [3];
        arr1 [0] = 10;
        arr1 [1] = 20;
        arr1 [2] = 30;
        return arr1;

    }
}
