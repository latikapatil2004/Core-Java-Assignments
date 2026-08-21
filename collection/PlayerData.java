/*Example: WAP to create Vector and store player class objects in it and perform following operation on it 


Case 1: Add New Player
Case 2: View All Player 
Case 3: Delete Player by id
Case 4: count number of player in collection 
Case 5: Search player by id or name 
*/
import java.util.*;
class Player
{
	private int id;
	private String name;
	private int run;
	 Player()
	 {
		 
	 }
	 Player(int id,String name,int run)
	 {
		 this.id=id;
		 this.name=name;
		 this.run=run;
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 
	 
	 public void setRun(int run)
	 {
		 this.run=run;
	 }
	 
	 
	 public int getId()
	 {
		 return id;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public int getRun()
	 {
		 return run;
	 }
 }


class PlayerData
{
	public static void main(String[]args)
	{
		Vector v=new Vector();
		 int index=-1;
		do
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("1 ADD NEW PLAYER");
		System.out.println("2 VIEW ALL PLAYER");
		System.out.println("3 DELETE PLAYER BY ID");
		System.out.println("4 COUNT NO OF PLAYER IN COLLECTION");
		System.out.println("5  SEARCH PLAYER BY ID OR NAME");
		System.out.println("1 ENTER THE CHOICE");
		int choice=sc.nextInt();
		switch(choice)
		{
				case 1:
				 System.out.println("ENTER ID");
				 int id=sc.nextInt();
				 
				 
				 System.out.println("ENTER NAME");
				 String name=sc.nextLine();
				 sc.nextLine();
				 
				 
                 System.out.println("ENTER RUN");
				 int run=sc.nextInt();
				 
				 Player p=new Player(id,name,run);
                 boolean b=v.add(p);
				 if(b)
				 {
					 System.out.println("Player added Successfully ----------------- ");
				 }
				 else
				 {
					 System.out.println("Invalid dataa ----------------- ");
				 }
				 
				break;
				case 2:
				if(v.size()!=0)
				{
					for(Object obj:v)
					{
						p=(Player)obj;
						System.out.println(p.getId() +"\t"+ p.getName()+"\t" + p.getRun());
					}
				}
				else 
				{
					System.out.println("Data is not Present ");
				}
				
				break;
				case 3:
				
				if(v.isEmpty())
				{
					System.out.println("Collection is empty");
				}
					else 
					{
				  System.out.println("Enter the id ");
				  int playerId=sc.nextInt();
				 
				  Iterator i=v.iterator();
				  while(i.hasNext())
				  {
					  Object obj=i.next();
					  Player p1=(Player)obj;
						if(p1.getId()==playerId) {
							index=v.indexOf(p1);
							i.remove();  //remove using a iterator
						}
					}
					}
					if (index != -1) {
				System.out.println("Player deleted successfully...");
					} else {
						System.out.println("Player not deleted");
					}
				

				  
	
				break;
				case 4:
				System.out.println("NO OF PLAYER : "+ v.size());
				break;
				
				case 5:
				System.out.println("Enter player id for search");
				int playerId = sc.nextInt();
				
				for (Object obj : v) {
					Player p1 = (Player) obj;
					if (p1.getId() == playerId && v.indexOf(p1) != -1) {
						index=v.indexOf(p1);
						
					}
				}
				if (index != -1) {
					System.out.println("Player found successfully...");
				} else {
					System.out.println("Player not  found");
				}

				break;
				default:
				System.out.println("INVALID CHOICE");
				
			}
			
		}while(true);
	}
			
		}


