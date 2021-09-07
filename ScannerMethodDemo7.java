import java.util.Scanner;
class ScannerMethodDemo7
{
	public static void main(String[]args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Product Name");
		String n=sc1.next();
		System.out.println("Enter Product Price");
		double p=sc1.nextDouble();
		System.out.println("Enter Discount Percentage");
		double d=sc1.nextDouble();
		System.out.println("Product Name is "+n);
		System.out.println("Product Price is "+p);
		System.out.println("Product Discount is "+d);
		double output= calculateAmount(p,d);
		System.out.println("Final Amount "+output);

	}
	static double calculateAmount(double p,double d)
	{
		double discount=(p)*(d/100);
		double totalAmount=p-discount;
		return totalAmount;
	}
}