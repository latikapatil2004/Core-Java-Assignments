class Qs45
{
	public static void main(String[]args)
	{
		int a=0;
		int b=1;
		System.out.println("fibonnacci seris");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<10;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}
}