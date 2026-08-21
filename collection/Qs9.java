//Backword Dirction 
import java.util.*;
class Qs9
{
	public static void main(String[]args)
	{
		Vector v=new Vector();
		v.add(9);
		v.add(8);
		v.add(7);
		v.add(9);
		v.add(8);
		v.add(7);
		v.add(9);
		v.add(8);
		v.add(7);
		ListIterator li=v.listIterator(0);
		li=v.listIterator(v.size());;
		while(li.hasPrevious())
		{
			Object obj= li.previous();
			System.out.print(" "+obj);
		}
		
		
	}
	
}