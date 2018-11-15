class Z4
{
	static int x = test();
	static int y = 10;
	static int test()
	{
		System.out.println("test:" + x + "," + y);
		return y;
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
	}
}
