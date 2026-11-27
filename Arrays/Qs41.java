class Qs41
{
	public static void main(String[]args)
	{
		int arr[]={1,2,4,5,7};
		int n=7;
		boolean visited[]=new boolean[n+1];
		for(int i=0;i<arr.length;i++)
		{
			visited[arr[i]]=true;
		}
		for(int i=1;i<=7;i++)
		{
			if(!visited[i])
			{
				System.out.println(i);
			}
		}
			
		}
	}
