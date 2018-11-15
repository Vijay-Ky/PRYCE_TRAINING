class Z22 
{
	static
	{
		System.out.println("Z22.SIB");
	}

	static void test()
	{
		System.out.println("Z22.test()");
	}
}
class Z23
{
	static
	{
		System.out.println("Z23.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Z23.main begin");
		Z22.test();
		System.out.println("----------");
		Z22.test();
		System.out.println("----------");
		Z22.test();
		System.out.println("Z23.main end");
	}
}
