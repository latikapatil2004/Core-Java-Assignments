/*22	Remove duplicates preserving order	[3, 1, 3, 2, 1]	[3, 1, 2]
*/



import java.util.*;
class Qs31 
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
		Set<Integer>set=new HashSet<>();
		System.out.println(set);
		}
		
		
}
