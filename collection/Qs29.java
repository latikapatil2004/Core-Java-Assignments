/*19	Copy one list into another	[a, b, c]	[a, b, c]
*/


import java.util.*;
class Qs29
{
	public static void main(String[]args)
	{
		List<Character>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		al.add('a');
		al.add('b');
		al.add('c');
		List<Character> list=new ArrayList<>();
		int k=0;
		for(int i=0;i<al.size();i++)
		{
			list.add(al.get(i));
		}
		
		System.out.println("al arraylist : " + al );
		System.out.println("list arraylist : " + list );
	}
}
