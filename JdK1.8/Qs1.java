interface ABC
{
	void show();
}
class Qs1
{
	public static void main(String[]args)
	{
		ABC a =new ABC()
		{
			public void show()
			{
				System.out.println(" i am show method of ABC");
			}
		};
		a.show();
	}
}