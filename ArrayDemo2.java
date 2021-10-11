package Arrays;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        System.out.println("Enter Number");
        int prime = sc1.nextInt();
        int sum = 0;

        for(int i=1; i<=prime;i++)
        {
            if (prime % i == 0){
                sum = i+sum;
            }
        }
        if (sum == (prime+1)){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }

    }
}
