/*29	Find all missing numbers in a range	[1, 3, 6], range 1–6	[2, 4, 5]
*/


import java.util.*;
class Qs38
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sizze");
		int n=sc.nextInt();
		List<Integer>al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		List<Boolean>seen=new ArrayList<>(n+1);
		for(int i=0;i<al.size();i++)
		{
		seen.get(i)=true;
		}
		for(int i=1;i<=6;i++)
		{
			if(!seen.get(i))
			{
				System.out.println(i);
			}
		}
	}
}
