import java.util.*;
class Practicee
{
	public static void main(String[]args)
	{
		HashMap<Integer,Integer>map=new HashMap<>();
		int nums[]=new int[]{10,20,10,20,30,40,30};
		boolean isduplicate=false;
		for(int i=0;i<nums.length;i++)
		{
			if(map.containsKey(nums[i]))
			{
			 map.put(nums[i],map.get(nums[i])+1);	
			}
			else 
			{
				map.put(nums[i],1);
			}
		}
		for(Integer key : map.keySet()){
			if(map.get(key)>1)
			{
				isduplicate=true;
				break;
           }
		 
		}
		  if(!isduplicate)
		  {
			  System.out.println("True");
		  }
		  else
		  {
			  System.out.println("false");
		  }
	
}
}
	


