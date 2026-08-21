/*Q6. Find a Product Price
Question
Create a Map containing product names and prices. Accept a product name and display its price.
Explanation
Use get() to retrieve the value associated with the product key.
Input
Laptop = 55000
Mobile = 25000
Tablet = 18000

Search: Mobile
Output
Mobile Price = 25000*/


import java.util.*;
class Product
{
	public static void main(String[]args)
	{
		HashMap<String,Long> map=new HashMap<>();
		map.put("Laptop" ,45000L);
        map.put("Mobile",60000L);
        map.put("Tablet", 75000L);
       for(Map.Entry<String,Long>entry : map.entrySet())
	   {
		   if(entry.getKey().equals("Mobile"))
		   {
			   System.out.println("Mobile Price ="+ entry.getValue());
		   }
	   }
	}
}
