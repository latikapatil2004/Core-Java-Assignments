/*Find repeating elements	[1, 2, 3, 2, 4, 1]	1,2*/

import  java.util.*;
class Array4 {
    public static void main(String[]args)  {
        int nums[]={1,2,3,2,4,1};
        Map<Integer, Integer> frequency = new LinkedHashMap<>();
		for(int num:nums)
		{
			frequency.put(num,frequency.getOrDefault(num,0)+1);
		}
		for(int num:nums)
		{
			if(frequency.get(num)>=2)
			{
				System.out.println(num);
				return;
			}
		}
    }
}