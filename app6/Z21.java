class Z20
{
	static int i;
	static 
	{
		int i = 10;
		System.out.println("Z20.SIB:" + i);
		System.out.println("Z20.SIB:" + Z20.i);
		i = 20;
		Z20.i = 200;
	}
}
class Z21
{
	static
	{
		System.out.println("Z21.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(Z20.i);
		Z20.i = 300;
		System.out.println("-----------");
		System.out.println(Z20.i);
		Z20.i += 300;
		System.out.println("-----------");
		System.out.println(Z20.i);
		System.out.println("main end");
	}
}
