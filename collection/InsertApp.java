import java.util.*;
class InsertApp
{
	public static void main(String[]args)
	{
		int arr[]={1,2,3,4,5,1,2,3,4,8};
		int arr1[]={0,11,12,13,15,16,24,33,46,68};
		int c[]=new int[arr.length+arr1.length];
		int i=0;
		int p=0;
		int k=0;
		while(i<arr.length)
		{
			c[k++]=arr[i++];
		}
		while(p<arr1.length)
		{
			c[k++]=arr1[p++];
		}
		
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]+" ");
		}
		
	}
}

