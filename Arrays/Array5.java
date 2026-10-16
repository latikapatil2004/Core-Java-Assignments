/*Find the single missing number from 1 to N
Input: arr = [1, 2, 4, 5], N = 5
Output: 3*/

class Array5
  {
    public static void main(String[]args)  {
        int arr[]={1,2,4,2,4,1};
		int sum=0;
		int n=5;
		n=n*(n+1)/2;
		int Actualum=0;
		for(int i=0;i<arr.length;i++)
		{
			Actualum+=arr[i];
		}
	
		int result=sum-Actualum;
		System.out.println(result);
	}
  }
       