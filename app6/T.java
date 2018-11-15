class T 
{
	static int i = test();

	static int test()
	{
		return 10;
	}

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(test());
		System.out.println(i);
	}
}
