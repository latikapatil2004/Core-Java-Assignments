
import java.util.*;
class Practicess
{
	public static void main(String[]args)
	{
		HashMap<Integer,Integer>map=new HashMap<>();
		int target=9;
		int arr[] = {7, 2, 1, 5,3, 6,};
		int arr2[] = {7, 2, 1, 5,3,8};
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])==map.containsKey(arr2[i]))
			{
				System.out.println(map.get(arr[i]));
				
			}
			
		}
	}
}