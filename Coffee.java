package practice;
import java.util.Scanner;
public class Coffee {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        System.out.println("Enter No of Coffees.");
        int qty = sc1.nextInt();
        new Coffee().divide(qty);
        int c=new Coffee().divide(qty);
        System.out.println("You will get "+c+" coffees.");
    }
    int divide (int qty){
        int a=qty/6;
        int b=qty+a;
        return b;
    }

}
