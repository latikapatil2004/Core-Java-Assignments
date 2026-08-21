/*Q13. Count Even and Odd Values
Question
Create a Map containing integer keys and values. Count how many values are even and how many are odd.
Explanation
Iterate through values() and use the % operator to identify even and odd numbers.
Input
1 = 25
2 = 18
3 = 41
4 = 60
5 = 72
Output
Even Values = 3
Odd Values = 2*/


import java.util.*;
class MapQs6
{
	public static void main(String[]args)
	{
		HashMap<Integer,Integer>map=new HashMap<>();
		map.put(1,25);
        map.put(2,18);
        map.put(3,41);
        map.put(4,60);
		int ecount=0;
		int ocount=0;
         for(Map.Entry<Integer,Integer> entry : map.entrySet())
		 {
			 if(entry.getValue()%2==0)
			 {
				ecount++;
			 }
			 else 
			 {
				 ocount++;
			 }
		 }
		 System.out.println("Even Values " + ecount);
		  System.out.println("Odd " + ocount);
	}
}

		