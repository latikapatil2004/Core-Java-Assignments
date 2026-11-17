 public class ThreadUsingLambda
{
	public static void main(String[]args)
	{
		Runnable r=()->
		{
			try{
				for(int i=0;i<=5;i++)
				{
					System.out.println("I is "+ i);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		};
		Thread t=new Thread(r);
		t.start();
	}
}