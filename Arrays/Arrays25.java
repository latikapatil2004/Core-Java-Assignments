import java.util.*;
class  Array25
{
	public static void main (String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the aray element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int num:arr)
		{
			if(map.containsKey(num))
			{
				map.put(num,map.get(num)+1);
			}
			else
			{
				map.put(num,1);
			}
		}
		
		System.out.println("duplicate element in array");
		int max=0;
		int smax=Integer.MIN_VALUE;
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>max && entry.getValue()<smax ){
				System.out.println(smax);
			}
		}
		
	}
}