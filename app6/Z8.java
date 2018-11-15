class Z8 
{
	static int i = test();
	static
	{
		System.out.println("Z8.SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("Z8.main" + i);
	}

	public static int test()
	{
		System.out.println("Z8.test()");
		return 69;
	}
}
