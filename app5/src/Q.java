class Q
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		int i = test();
		System.out.println("i = " + i);
	}

	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
}
