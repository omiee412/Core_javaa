package Overriding;

public class HDFC extends Bank{
    void simpleInterest(double p,double r, double t){

        double Amount=p*(1+r*t);
        System.out.println("Your Maturity Amount with interest rate of 5% is "+Amount);
    }
}

