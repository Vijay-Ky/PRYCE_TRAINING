class Z9 
{
	static int i = test();
	static
	{
		System.out.println("Z9.SIB:" + i);
		i = 10;
	}

	public static void main(String[] args) 
	{
		System.out.println("Z9.main:" + i);
	}

	public static int test()
	{
		System.out.println("Z9.test():" + i);
		return 69;
	}
}
