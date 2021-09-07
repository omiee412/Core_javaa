import java.util.Scanner;
class ScannerMethodDemo5
{
	public static void main(String[]args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Total Number of Wins");
		int W=sc1.nextInt();
		System.out.println("Enter Total Number of Loses");
		int L=sc1.nextInt();
		System.out.println("Enter Total Number of Draws");
		int D=sc1.nextInt();
		int output=calculateRewards(W,L,D);
		System.out.println("Reward Points "+output);

	}
	static int calculateRewards (int W,int L, int D)
	{
		int totalRewards=(25*W)-(10*L)+(10*D);
		return totalRewards;
	}
}