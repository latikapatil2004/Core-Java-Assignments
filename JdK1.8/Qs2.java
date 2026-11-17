interface ABC
{
	void show();
}
class Qs2
{
	public static void main(String[]args)
	{
		ABC a =()->
			{
				System.out.println(" i am show method of ABC");
			};
		
		a.show();
	}
}