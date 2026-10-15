/*   */



import java.util.*;
class Array3
{
	public static void main(String[]args)
	{
		int arr[]={1, 2, 3, 2, 4, 1};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				System.out.println(arr[i]);
				break;
			}
		}
	
}
}