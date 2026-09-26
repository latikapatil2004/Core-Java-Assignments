import java.util.*;
class Five
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
	  System.out.println("Enter numbers");
	  int n=sc.nextInt();
	  	sc.nextLine();
    Map<String,Integer>val=new HashMap<>();
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter Keys ");
		String key=sc.nextLine();
		System.out.println("Enter value");
        int value=sc.nextInt();
		sc.nextLine();
		val.put(key,value);
	}
	
	Map<String,Integer>map=new TreeMap<>(val);
		System.out.println("HashMap"+val);
	System.out.println("TreeMap"+map);
  }
}