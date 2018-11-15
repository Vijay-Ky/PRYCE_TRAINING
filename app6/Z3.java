class Z3 
{
	static int x;

	static int y = test();

	static int test()
	{
		return y;
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
	}
}
