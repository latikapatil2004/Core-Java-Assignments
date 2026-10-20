/* Find the most frequent element
*/

import java.util.*;
class Arrays20
{
	public static void main(String[]args)
	{
	int arr[]={1,2,3,5,1,2,1,3,2,2,5};
	 Map<Integer,Integer>map=new HashMap<>();
	 for(int i=0;i<arr.length;i++)
	 {
		 if(map.containsKey(arr[i]))
		 {
			 map.put(arr[i],map.get(arr[i])+1);
		 }
		 else
		 {
			 map.put(arr[i],1);
		 }
	 }
	 int max=0;
	 int key=0;
	 for(Map.Entry<Integer,Integer>entry:map.entrySet())
	 {
		 if(entry.getValue()>max)
		 {
		   max=entry.getValue();
            key=entry.getKey();		   
		 }
	 }	 System.out.println(key+":"+max);
	 
	
	}
}
