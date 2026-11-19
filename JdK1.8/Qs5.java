interface XYZ
{
 void show();
}

class Qs5
{
	public static void main(String[]args)
	{
	 XYZ x=new XYZ()
	{
		public void show()
		{
			System.out.println("i am show method of interface ");
		}
	};
	x.show();
	
}
}