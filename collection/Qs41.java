import java.util.*;
class Qs41
{
  public static void main(String[]args)
  {
	  List<Integer>al=List.of(10, 50, 20, 50, 40, 30);
	  int max=al.get(0);
	  int sm=Integer.MIN_VALUE;
	  for(int i=0;i<al.size();i++)
	  {
		  if(al.get(i)<max)
		  {
			  max=al.get(i);
		  }
	  }
	  for(int i=0;i<al.size();i++)
	  {
		  if(al.get(i)<max && sm>al.get(i))
		  {
			  sm=al.get(i);
		  }
	  }
	  System.out.println("Second max : "+ sm);
  }
}