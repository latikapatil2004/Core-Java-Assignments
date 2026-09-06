/*Q2. Remove duplicate elements

Input:

ArrayList<Integer> list = new ArrayList<>(
    Arrays.asList(10, 20, 10, 30, 20, 40, 30)
);

Output:

[10, 20, 30, 40]

/Think: Which collection automatically prevents duplicates?*/

import java.util.*;
class Qs21
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of string");
		int n=sc.nextInt();
		sc.nextLine();
		
		LinkedHashSet<Integer>name=new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			name.add(sc.nextInt());
		}
		System.out.println("After removing duplicate");
		for(int num : name)
		{
			System.out.println(num);
		}
	}
	
}

			