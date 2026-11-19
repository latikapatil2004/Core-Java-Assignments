class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("I is : "+ i);
			Thread.sleep(1000);
		}
	}
}

class Qs3
{
	public static void main(String[]args)
	{
		Mythread my=new Mythread();
		my.start();
	}
}