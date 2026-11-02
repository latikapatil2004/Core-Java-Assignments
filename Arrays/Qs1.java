
/*17. Leaders in Array
Input
[16,17,4,3,5,2]

Output
[17,5,2]*/
import java.util.*;
class Qss1
{
	public static void main(String[]args)
	{
		int arr[]={16,17,4,3,5,2};
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				System.out.println(arr[i]);
		
          }
    }
	}
}

		