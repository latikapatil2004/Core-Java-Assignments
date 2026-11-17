interface ABC
{
	int getSquare(int no);
	
}
class Qs3
{
	public static void main(String[]args)
	{
	ABC a=(int no)->no*no;
    int result=a.getSquare(5);
	System.out.println("Square is : "+ result);
	}	
	}