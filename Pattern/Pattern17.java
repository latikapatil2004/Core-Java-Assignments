/*

Q17. Write a java program to print this pattern.
          *
     *        *
  *              *
* *  *    *   *  * *



*/

class Pattern17
{
	public static void main(String[]args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==5||j+i%2!=0)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}