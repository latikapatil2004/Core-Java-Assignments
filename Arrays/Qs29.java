/*18	Reverse a list without Collections.reverse()	[1, 2, 3, 4]	[4, 3, 2, 1]*/

import java.util.*;
class Qs29
{
	public static void main(String[]args)
	{
		List<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		int i=0;
		int j=al.size()-1;
		while(i<j)
		{
			int temp=al.get(i);
			al.set(i,j);
			al.set(j,temp);
			
		}
		i++;
			j--;
		
		System.out.println(al);
		
	}
}