package Exam;

import java.util.Scanner;

class Gstbill1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        System.out.println("Enter Dish Quantity");
        int dish = sc1.nextInt();
        System.out.println("Enter Cost");
        double cost = sc1.nextDouble();
        System.out.println("Enter GST%");
        double gst = sc1.nextDouble();
        gstbill(dish, cost, gst);

    }
    static void gstbill (int dish, double cost, double gst)
    {
        double t = cost*dish;
        double t1= gst/100;
        double t2= t*t1;
        double amount= t2+t;
        System.out.println("Total Bill Amount is "+amount);
    }
}
