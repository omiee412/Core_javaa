import java.util.Scanner;
class ScannerifelseDemo6
{
	public static void main (String[]args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("EnterNumber");
		int no=sc1.nextInt();
		if(no%5==0)
		{
			if(no%3==0)
			{
				System.out.println("Number is Divisible by 5 As Well As 3");
			}
			else
			{
				System.out.println("Number is Divisible by 5 Only");
			}
		}
		else
		{
			System.out.println("Number is Not Divisible By 5 and 3");
		}
	}
}