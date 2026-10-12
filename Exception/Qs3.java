/*Question 4: Write a Java program to handle NullPointerException.

Create a string variable and assign null value. Try to find its length and handle the exception using try-catch block.
Asked In Practice Assignment
Input:
String value: null

Output:
Exception occurred: String value is null

Explanation:
NullPointerException occurs when trying to call methods on null reference. When string variable is assigned null value and length() method is called, exception is thrown because there is no actual string object. Use try-catch to handle this and display appropriate error message. Always check for null before calling methods on objects.*/

class Qs4
{
  public static void main(String[]args)
  {
  String s=null;
  try
  {
     int length=s.length();
   }
   catch(Exception e)
   {
   System.out.println("Exception : " + e);
   }
   }
   }
   