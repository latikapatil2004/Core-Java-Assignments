/*11	Find largest element	[12, 45, 7, 89, 23]	89
*/
import java.util.*;
class Q26
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
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)>max)
			{
				max=al.get(i);
			}
		}
	       System.out.println("maximum :"+ max);
			}
}