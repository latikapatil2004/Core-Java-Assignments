import java.util.*;
class Qs42
{
  public static void main(String[]args)
  {
 List<Integer>al1=List.of(0, 10, 0, 20, 30, 0, 40);
 List<Integer>al2=new ArrayList<>(al1.size());
    for(int i=0;i<al1.size();i++)
	{
		if(al1.get(i)!=0)
		{
			al2.add(al1.get(i));
		}
		
	}
	if(al2.size()<al1.size())
	{
		al2.add(0);
	}
	for(int i=0;i<al2.size();i++)
	{
		System.out.println(al2.get(i));
  }
  
}
}