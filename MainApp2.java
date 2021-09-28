//Business Logic Class

class Demo1
{
	int p=10;
	void display()
	{
		System.out.println("Display Method");
	}
}
//Executable Class

class MainApp2
{
	public static void main(Strings []args)
	{
		System.out.println("P value is "+new Demo1().p);
		new Demo1().display();
	}
}