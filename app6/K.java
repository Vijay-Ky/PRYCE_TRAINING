class K 
{
	static int i = 20;

	public static void main(String[] args) 
	{
		int i = 40;
		System.out.println(K.i);
		System.out.println(i);
		K.i = 200;
		i = 400;
		System.out.println(K.i);
		System.out.println(i);
	}
}
