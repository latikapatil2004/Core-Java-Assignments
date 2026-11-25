import java.util.function.*;
import java.util.Date;
class Qs28
{
	public static void main(String[]args)
	{
		Supplier<Date>s=new (Supplier<Date>)()
		{
			public Date get()
			{
				return new Date();
			}
		};
		Date d=s.get();
		System.out.println(d);
	}
}