import java.util.*;
class Four 
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter numbers");
	  int n=sc.nextInt();
    Map<Integer,Integer>val=new HashMap<>();
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter Keys");
		int key=sc.nextInt();
		System.out.println("Enter value");
        int value=sc.nextInt();
		val.put(key,value);
	}
	int evencount=0;
	int oddcount=0;
	for(int num:val.values())
	{
		if(num%2==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
	}
	System.out.println("Even values :" +evencount);
		System.out.println("odd values :" +oddcount);
  }
}
  