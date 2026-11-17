 public class ThreadUsingConstructor
{
	public static void main(String[]args)
	{
		Runnable r = new Runnable()
		{
			public void run()
			{
				try{
					for(int i=1;i<=5;i++)
					{
						System.out.println(i);
						Thread.sleep(100);
					}
				}
				catch(Exception e)
				{
					System.out.println("exception is "+ e);
				}
			}
		}
			Thread t=new Thread(r);
			t.start();
		}
	}
}