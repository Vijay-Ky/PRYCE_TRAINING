class I 
{
	void test1()
	{
		System.out.println("from test1()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj = new I();
		obj.test1();
		System.out.println("main end");
	}
}
