class Q 
{
	static void test1()
	throws ClassNotFoundException
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 end");
	}
	static void test2()
	{
		System.out.println("test2 begin");
		try
		{
			test1();
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("test2 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test2();
		System.out.println("main end");
	}
}
'