
/*Q14.Create Player class: 
● playerId ● playerName ● 
runs Store players in Vector and display players who scored even runs. 
Description Logical condition: runs % 2 == 0 
Input 1 Virat 75 
2 Rohit 80 
3 Gill 66 
4 KL 59
 Output Players with even runs:  2 Rohit 80 3 Gill 66 */
 import java.util.*;
 class Player
 {
	 private int id;
	 private String name;
	 private int runs;
	 Player()
	 {
		 
	 }
	 Player(int id,String name,int runs)
	 {
		 this.id=id;
		 this.name=name;
		 this.runs=runs;
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public int getId()
	 {
		 return id;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setRun(int runs)
	 {
		 this.runs=runs;
	 }
	 public int getRun()
	 {
		 return runs;
	 }
 }
 class Qs14
 {
	 public static void main(String[]args)
	 {
		 Vector<Player>v=new Vector<>();
		 Player p1=new Player(1,"Rohit" ,300);
		 Player p2=new Player(2,"Kl",330);
		 Player p3=new Player(3,"Gill",100);
		 Player p4=new Player(4,"Virat",345);
		 v.add(p1);
		 v.add(p2);
		 v.add(p3);
		 v.add(p4);
		 for(Player p: v)
		 {
			 if(p.getRun()%2==0)
			 {
				 System.out.println(p.getId()+"\t"+p.getName()+"\t"+ p.getRun());
			 }
		 }
		 }
 }
