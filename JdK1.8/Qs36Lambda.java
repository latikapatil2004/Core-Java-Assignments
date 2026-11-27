import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs36
{
	public static void main(String[]args)
	{

		boolean result=List.of("rahul","sai","aai","papa").stream().anyMatch((String s)->s.equals("rahul"));
		System.out.println(result);
	}
	
}