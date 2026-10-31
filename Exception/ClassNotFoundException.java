class ClassNotFoundException
{
	public static void main(String[]args)
	{
		try
		{
			Class.forName("ClassNotFoundException");
			System.out.println("class found");
		}
		catch(Exception e)
		{
			System.out.println("ClassNotFoundException");
		}
	}
}