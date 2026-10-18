/*Q8. Count Occurrences of a Given Number in Every Window
Input: arr = [1, 2, 1, 3, 1, 2, 1], k = 3, target = 1
Output: [2, 1, 2, 1, 1]*/


class Subarra6
{
	public static void main(String[]args)
	{
		int arr[] = {1, 2, 1, 3, 1, 2, 1};
		int k=3;
		int target=1;
		int count=0;
		for(int i=0;i<=arr.length-k;i++)
		{
			count=0;
			for(int j=i;j<i+k;j++)
			{
			if(arr[j]==target)
			{
				count++;
			}
			}
			System.out.println(count);
		}
	}
}
