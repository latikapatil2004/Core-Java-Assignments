/*Using ListIterator : ListIterator is a interface from java.util package and which is used for fetch data in forward direction as well as in backward directions 
And this interface only works with List collection and it is a child of Iterator means all methods of Iterator present in ListIterator.

Syntax to create reference of ListIterator 
________________________________________________________
ListIterator ref=collref.listIterator(int index): this method can travel collection by using specified index using forward direction fetching and backward direction fetching.
*/



import java.util.*;
class Qs8
{
	public static void main(String[]args)
	{
		Vector v=new Vector();
		v.add(100);
		v.add(20);
		v.add(30);
		v.add(100);
		v.add(20);
		v.add(30);
		ListIterator li= v.listIterator(0);
		System.out.println("Data travell using forword direction ");
		while(li.hasNext())
		{
			Object obj =li.next();
			System.out.print(" "+obj);
		}
		
	}
}