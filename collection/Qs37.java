/*28	Find missing number from 1 to N	[1, 2, 4, 5], N=5	3; one missing, no duplicates
*/
import java.util.*;
class Qs37
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("enter element of array");
		List<Integer>al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		int alsum=0;
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			alsum=alsum+al.get(i);
		}
		for(int i=1;i<=5;i++)
		{
			sum+=i;
		}
		int missing= sum-alsum;
		System.out.println("MISSING NUMBERS :"+missing);
	
}
}