/*

Q6. Write a java program to print this pattern.
         *
	   * *
	 * * *
   * * * *  	 
 * * * * *

*/




class Pattern6
 {
	 public static void main(String[]args)
	 {
		 int n=5;
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=5;j>=1;j--)
			 {
				
				if(j>i)
				{
             System.out.print("*");
			 }
			 else{
				 System.out.print(" ");
			 
			 }
		 }
		 System.out.println();
          
			
		 }
		 
	 }
 }