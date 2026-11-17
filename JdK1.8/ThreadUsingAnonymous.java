 public class ThreadUsingAnonymous
{
	public static void main(String[]args)
	{
		
		Thread t=new Thread(new Runnable()
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
		});

			t.start();
		}
	}
