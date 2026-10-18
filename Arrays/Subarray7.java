import java.util.*;
class Subarray7
{
	public static void main(String[]args)
	{
		int arr[]={4, 2, 4, 5,6};
		int k=3;
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+arr[i];
			if(sum>max)
		{
			max=sum;
		}
		}
		
		for(int i=k;i<arr.length;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			if(sum>max)
		{
			max=sum;
		}
		}
		
		System.out.println("Maxium"+max);
		
	}
}