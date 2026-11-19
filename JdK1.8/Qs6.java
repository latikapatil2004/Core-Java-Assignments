
class Qs6
{
  public static void main(String[]args)
  {
   Thread t=new Thread(()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("I is : "+ i);
				
			}
		});
	t.start();
	
  }
}