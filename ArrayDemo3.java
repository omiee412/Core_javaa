package Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int [] arr1 = new int [3];
        arr1 [0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        printArray (arr1);

    }
    static void printArray (int [] data){
        for (int a = 0; a< data.length; a++){
            System.out.println(data [a]);
        }
    }
}
