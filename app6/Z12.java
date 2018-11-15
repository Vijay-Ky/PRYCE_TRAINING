class Z12 
{
	static int i = test();

	static
	{
		System.out.println("Z12.SIB:" + i);
		i = 99;
		main(null);
		System.out.println("Z12.SIB again:" + i);
		i = 10;
	}

	public static int test()
	{
		System.out.println("test:" + i);
		i = 40;
		main(null);
		System.out.println("test again:" + i);
		return 75;
	}

	public static void main(String[] main)
	{
		System.out.println("main begin:" + i);
		i = 33;
		System.out.println("main end" + i);
	}
}
