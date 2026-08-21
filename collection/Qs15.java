/*Q15.Create Book class: 
● bookId ● bookName ● 
price Store books in Vector and calculate total price of all books. 
Description Logical operation: total = total + price 
Input 1 Java 500 2 SQL 350 3 Python 400 
Output Total Book Price = 1250 

*/
import java.util.*;
class Book
{
	 private int id;
	 private String name;
	 private int price;
	 Book()
	 {
		 
	 }
	 Book(int id,String name,int price)
	 {
		 this.id=id;
		 this.name=name;
		 this.price=price;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getPrice() {
		 return price;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 
}
class Qs15
{
	public static void main(String[]args)
	{
		Vector<Book>v=new Vector<>();
		Book b1=new Book(1,"Java",300);
		Book b2=new Book(2,"C",400);
		Book b3=new Book(3,"C++",300);
		v.add(b1);
		v.add(b2);
		v.add(b3);
		int total=0;
		for(Book b:v)
		{
			total=total+b.getPrice();
		}
		System.out.println("Total Book Price = "+total);
		
	}
}