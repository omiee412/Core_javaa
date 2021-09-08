import java.util.Scanner;
class ScannerifelseDemo5
{
	public static void main (String[]args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Number");
		int no=sc1.nextInt();
	if(no>0)
		{
         if(no%2==0)
         {
         	System.out.println("No is Positive As Well As Even");
         }
         else
         {
         	System.out.println("No is Positive As Well As Odd");
         }
        }
    else
    	{
    	System.out.println("Given No is Negative");
    	}     
		
	}	
}