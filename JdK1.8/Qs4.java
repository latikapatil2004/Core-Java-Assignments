class Even extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" Even ");
			}
		}
	}
}
class Odd extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+"odd ");
			}
		}
	}
}
class Qs4
{
	public static void main(String[]args)
	{
		
		Even e=new Even();
		e.start();
		Odd o =new Odd();
		o.start();
	}
}