
/*/*Q13.Create Product class:'
 *  ● productId 
 *  ● productName 
 *  ● price 
 *  Store products in Vector and display products with price less than 500. 
 *  Description Check condition:
 *   price < 500 
 *   Input
 *   P1 Mouse 450 
 *   P2 Keyboard 700
 *   P3 PenDrive 350 
 *   P4 Monitor 9000
 *    Output 
 *    Products below 500: 
 *     P1 Mouse 450 
 *     P3 PenDrive 350 */



import java.util.Vector;

class Product
{
	 private int id;
	 private String name;
	 private int price;
	 Product()
	 {
		 
	 }
	 Product(int id,String name,int price)
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


public class Ques13 {

	public static void main(String[] args)
	{
		Vector <Product>v=new Vector<>();
		Product p1=new Product(1,"Mouce",200);
		Product p2=new Product(2,"Keyboard",2000);
		Product p3=new Product(1,"Pendrive",300);
		Product p4=new Product(1,"Monitor",100);
		Product p5=new Product(1,"or",200);
		v.add(p1);
		v.add(p2);
		v.add(p3);
		v.add(p4);
		v.add(p5);
		System.out.println("Data Less than 500");
		for(Product p:v)
		{
		  if(p.getPrice()<500)
		  {
			  System.out.println(p.getId()+"\t" + p.getName()+ "\t" + p.getPrice());
		  }
		}
	}
}
