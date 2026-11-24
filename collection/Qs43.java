import java.util.*;
class Qs43
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(1, 2, 3, 4, 5);
		List<Integer>list=new ArrayList<>();
         int k = 2;
		 for(int i=k+1;i<al.size();i++)
		 {
			list.add(al.get(i)); 
		 }
		 for(int i=0;i<=k;i++)
		 {
			 list.add(al.get(i));
		 }
		 for(int i=0;i<list.size();i++)
		 {
}
			System.out.println(list.get(i)); 
		 }
	}