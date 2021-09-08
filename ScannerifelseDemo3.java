import java.util.Scanner;
class ScannerifelseDemo3
{
	public static void main (String[]args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter First Number");
		double first=sc1.nextDouble();
		System.out.println("Enter Second Number");
		double second=sc1.nextDouble();
		if(first>second)
		{
			System.out.println("First Number Is Greater Than Second");
		}
		else if(second>first)
		{
			System.out.println("Second Number Is Greater Than First");
		}
		else
		{
			System.out.println("Both Numbers Are Equal");
		}
	}	
}