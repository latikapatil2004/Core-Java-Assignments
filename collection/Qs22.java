import java.util.*;
 class Qs22
 {
	 public static void main(String[]ar)
	 {
		ArrayList<Integer> al =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of element");
		int n=sc.nextInt();
		
				int freq=0;
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
	   int largest=0;
	   int seclargest=Integer.MIN_VALUE;
		
		for(int i=0;i<al.size();i++)
		{
	     if(al.get(i)>largest)
	      {
			  largest=al.get(i);
		  }
		}
		for(int i=0;i<al.size();i++)
		{
	     if(al.get(i)<largest && al.get(i)>seclargest)
			 
	      {
			  seclargest=al.get(i);
		  }
		}
		System.out.println("Second Largest --->"+ seclargest);
		}
	 }
 
 
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
			