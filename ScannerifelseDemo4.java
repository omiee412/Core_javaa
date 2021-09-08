import java.util.Scanner;
class ScannerifelseDemo4
{
	public static void main(String[]args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Radius");
		double rad=sc1.nextDouble();
		System.out.println("Select Mode Of Operation");
		System.out.println("1. Area of Circle");
		System.out.println("2. Circumference of Circle");
		int choice=sc1.nextInt();
		if(choice==1)
		{
			double a= areaCircle (rad);
		}
		else if (choice==2)
		{
			double c=circumference(rad);
		}
		else
		{
			System.out.println("Invalid Output");
		}	
	}
		static double areaCircle (double rad)
		{
			double areaC=3.14*rad*rad;
			System.out.println("Area of Circle is "+areaC);
			return areaC;
		}
		static double circumference (double rad)
		{
			double circumferenceC=2*3.14*rad;
			System.out.println("Circumference of Circle is "+circumferenceC);
			return circumferenceC;
		}
}