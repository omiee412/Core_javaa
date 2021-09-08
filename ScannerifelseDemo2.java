import java.util.Scanner;
class ScannerifelseDemo2
{
	public static void main(String[]args)
	{
		Scanner sc1=new Scanner (System.in);
    	System.out.println ("Enter your age");
    	int age=sc1.nextInt();
    if(age>=18)
    {
    	System.out.println("Eligible For Vaccination");
    }
    else
    {
    	System.out.println("Not Eligible For Vaccination");
    }
    }
}