class F 
{
	static int i = 10;
	static double j = 20.0;
	static boolean k = true;

	public static void main(String[] args) 
	{
		System.out.println(i + "," + j + "," + k);
		i = 100;
		j = 40.0;
		k = false;
		System.out.println(i + "," + j + "," + k);
	}
}
