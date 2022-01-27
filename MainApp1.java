package Overriding;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner (System.in);
        System.out.println("Please Select Your Bank.");
        System.out.println(" 1: SBI ");
        System.out.println(" 2: HDFC ");
        System.out.println(" 3: ICICI ");
        int choice= sc1.nextInt();
        System.out.println("Enter Principle Amount.");
        double p= sc1.nextDouble();
        System.out.println("Enter Time Span in Years.");
        double t= sc1.nextDouble();

        if (choice==1){
            SBI s1=new SBI();
            double r=0.04;
            s1.simpleInterest(p, r, t);
        }else if (choice==2){
            HDFC h1=new HDFC ();
            double r=0.05;
            h1.simpleInterest(p, r, t);
        }else if (choice==3){
            ICICI i1=new ICICI ();
            double r=0.06;
            i1.simpleInterest(p, r, t);
        }else
            System.out.println("Inavlid Choice.");

    }
}
