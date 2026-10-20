
import java.util.*;
class Array16
{
	public static void main(String[]args)
	{
		int arr[]={1,2,3,1,4,2,3,4,5,6,7};
		
		HashMap<Integer,Boolean>map=new HashMap<>();
		for(int num:arr)
		{
			map.put(num,true);
		}
	    for(Map.Entry<Integer,Boolean>entry:map.entrySet())
		{
			
			System.out.print("["+entry.getKey()+"]");
			
		
	}}
}
		