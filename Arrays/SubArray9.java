/*6. Smallest missing positive integer
Input: [3, 4, -1, 1]
Output: 2*/



class SubArray9
{
	public static void main(String[]args)
	{
	  int arr[]={3, 4, -1, 1};
	  int n=4;
	  int smallest=9;
	  boolean seen[]=new boolean[n+1];
	  for(int i=0;i<arr.length;i++)
	  {
		  seen[arr[i]]=true;
	  }
	  for(int i=0;i<=n;i++)
	  {
		  if(!seen[i])
		  {
		  if(arr[i]<smallest && smallest>0)
		  {
			smallest=arr[i];  
		  }
		  }
	  }
	  System.out.println("Smallest missing:"+smallest);
	}
}
			  
		