import java.util.*;
class Qs11
{
	public static void main(String[]args)
	{
		Vector v=new Vector();
	    v.add(9);
		v.add(78);
		v.add(12);
		v.add(9);
		v.add(78);
		v.add(12);
		int sum=0;
		Iterator i=v.iterator();
	while(i.hasNext())
	{
		Object obj=i.next();
		sum=sum+(int)obj;
	}
			System.out.print("Sum Of All element" +sum);
		}
		
	}