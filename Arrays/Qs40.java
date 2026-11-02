/***31	Sort ascending	[5, 1, 4, 2]	[1, 2, 4, 5]*/
import java.util.*;
class Qs40
{
	public static void main(String[]args)
	{
		List<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		for(int i=0;i<al.size();i++)
		{
			al.add(sc.nextInt());
		}
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					int temp=al.get(i);
					al.set(al.get(i),al.get(j));
					al.set(al.get(j),temp);
				}
			}
		}
		System.out.println(al);
}
}

