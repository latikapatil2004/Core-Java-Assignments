
class Subarray1
{
	public static void main(String[]args)
	{
		int arr[]={7,1,8,10,12,0,5};
		int k=3;
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<k;i++)
		{
			sum=sum+arr[i];
		}
		if(sum>max)
		{
			max=sum;
		}
		
		
		for(int i=k;i<arr.length;i++)
		{
			sum=sum+arr[i]-arr[i-k];
		
		if(sum>max)
		{
			max=sum;
		}
		}
		System.out.println("Maximum sum "+ max);
		
		
	}
}




