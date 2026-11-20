class InvalidAgeException extends Exception
{
	 InvalidAgeException(String msg)
	 {
		 super(msg);
	 }
}

class Qs2
{
	 static void Age(int age) throws InvalidAgeException
	 {
		 if(age<18)
		 {
		 throw new InvalidAgeException("Age is not valid");
	 }
	 System.out.println("Valid age ");
	 }
	 public static void main(String[]args)
    {
	 try
	 {
		 Age(89);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 
  }
}
