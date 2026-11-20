class Mythread extends Thread
{
	public void run()
	{
		System.out.println("threead is running");
	}
	
}
class Qs1
{
	public static void main(String[]args)
	{
		Mythread m=new Mythread();
		System.out.println(m.getState());
		m.start();
		System.out.println(m.getState());
	}
}