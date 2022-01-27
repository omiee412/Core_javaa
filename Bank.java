package Overriding;

public class Bank {
    void simpleInterest(double p, double r, double t){
        double Amount=p*(1+r*t);
        System.out.println("Your Total Maturity Amount is "+Amount);
    }
}
