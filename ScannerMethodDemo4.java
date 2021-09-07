import java.util.Scanner;
class ScannerMethodDemo4
{
	public static void main(String[]args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Radius");
		double r=sc1.nextDouble();
		double A=AOC(r);
		System.out.println("Area of Circle is "+A);
		double B=COC(r);
		System.out.println("Circumference of Circle is "+B);
	}
	static double AOC (double r)
	{
		double AOC=3.14*r*r;
		return AOC;
	} 
	static double COC(double r)
	{
		double COC=2*3.14*r;
		return COC;
	}

}
