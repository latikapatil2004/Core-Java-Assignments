/*5. Create three methods: methodC(), methodB(), and methodA(). Make methodC() convert a string into an
integer and declare NumberFormatException using throws. Call methodC() from methodB() and methodB()
from methodA(). Handle the exception only in main() and demonstrate exception propagation through the
call stack.*/


class Exception5
{
	static void methodA()throws NumberFormatException
	{
		
	 System.out.println("Inside methodA()");
     methodB();
		
	}
	static void methodB()throws NumberFormatException
	{
		System.out.println("Inside methodB()");
        methodC();
	}
	static void methodC()throws NumberFormatException
	{
		String str="amv";
		int num=Integer.parseInt(str);
		System.out.println("Number is"+num);
		
	}


	public static void main(String[]args)
	{
	try {
        System.out.println("Inside main()");
        methodA();
    }
    catch (NumberFormatException e) {
        System.out.println("Exception caught in main(): "
                           + e.getMessage());
    }

    System.out.println("Program ended");
}
}

