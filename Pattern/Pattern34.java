class Pattern34
{
	public static void main(String[]args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==5||j==5||i+j==6||j-i==4||i+j==14||i-j==4)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print("  ");

				}
			}
			System.out.println();
					
		}
	}
}