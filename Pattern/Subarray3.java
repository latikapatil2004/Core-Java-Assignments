

class Subarray3
{
	public static void main(String[]args)
	{
		int arr[]={1, 3, 2, 6, -1, 4, 1, 8, 2};
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Average "+sum/k);
		for(int i=k;i<arr.length;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			System.out.println(sum/k);
		}
		
	}
}