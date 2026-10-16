/* Find the first missing number in a sorted array
Input: arr = [1, 2, 3, 5, 6]
Output: 4
[ ] Find a missing number when the range starts from zero
Input: arr = [0, 1, 3, 4], N = 4
Output: 2
[ ] Find missing values between the minimum and maximum elements
Input: arr = [4, 2, 7, 3]
Output: [5, 6]*/




class Array10
{
	public static void main(String[]args)
	{
	int arr[]={1, 2, 3, 5, 6};
		int n=6;
		boolean seen[]=new boolean[n+1];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			seen[arr[i]]=true;
		}
		for(int i=1;i<=n;i++)
		{
			if(!seen[i])
			{
				
				System.out.println(i);
				break;
				}
			}
		}
	}