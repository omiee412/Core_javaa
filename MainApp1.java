//business logic or functional class

class Master1
{
	static int k=10;
	static void test()
	{
		System.out.println("TEST METHOD");
	}
}
//Executable Class

class MainApp1
{
	public static void main(String[]args)
	{
		System.out.println("K value is "+Master1.k);
		Master1.test();
	}
}