
import java.util.function.Consumer;
class Qs7
{
	public static void main(String[]args)
	{
		Consumer<String> c=s->
			System.out.println(s);
	
		c.accept("LAtika");
	}
}