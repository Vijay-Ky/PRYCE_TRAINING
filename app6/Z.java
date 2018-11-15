class Z 
{
	static int x = 10;

	static int y = test();

	static int test()
	{
		return x;
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
	}
}
