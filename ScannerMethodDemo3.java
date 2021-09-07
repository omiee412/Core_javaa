import java.util.Scanner;
class ScannerMethodDemo3
{
	public static void main (String[]args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Quantity");
		double q=sc1.nextDouble();
		System.out.println("Enter Price");
		double p=sc1.nextDouble();
		Bill(q,p);
	}
	static void Bill (double qty, double price)
	{
		double Amount=qty*price;
		System.out.println("Total Bill is "+Amount);
	}
}