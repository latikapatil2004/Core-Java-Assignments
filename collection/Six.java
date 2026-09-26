import java.util.*;
class Six
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter string");
	  
	  String s=sc.nextLine();
	  Map<Character,Integer>map=new HashMap<>();
	  for(int i=0;i<s.length();i++)
	  {
		  char ch=s.charAt(i);
		  if(map.containsKey(ch))
		  {
			  map.put(ch,map.get(ch)+1);
		  }
		  else
		  {
			  map.put(ch,1);
		  }
	  }
	  for(Map.Entry<Character,Integer>entry:map.entrySet())
	  {
		  if(entry.getValue()>=2)
		  {
			  System.out.println(entry.getKey()+" "+ entry.getValue());
		  }
	  }
  }
}
