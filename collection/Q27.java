/*13	Find second-largest distinct element	[10, 5, 10, 8]	8
*/


import java.util.*;
class Q27
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer>al=new ArrayList<>();
		System.out.println("enter no of element ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		
		}
		int max=al.get(0);
		
		for(int i=1;i<al.size();i++)
		{
			if(al.get(i)>max)
			{
				max=al.get(i);
			}
		}
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<al.size();i++)
		{
			if (al.get(i) < max && al.get(i) > smax) {
				smax=al.get(i);
			}
		}
	       System.out.println("secondmaximum :"+ smax);
	}
}

