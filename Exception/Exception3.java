/*3. Create a method withdraw(double balance, double amount) that throws an IllegalArgumentException if
the withdrawal amount is zero or negative and an ArithmeticException if the amount exceeds the balance.
Use throws in the method declaration, invoke it from main(), and handle each exception separately.
*/

import java.util.*;
class Banking
{
	public void withdraw(double balance,double amount)throws IllegalArgumentException,ArithmeticException
	{
	
		if(amount<=0){
			throw new IllegalArgumentException("Amount is less");
		}
		if(amount>balance)
		{
			throw new ArithmeticException("mount exceeds the balance.");
		}
		balance = balance - amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
	
	
	}
class Exception3
{
	public static void main(String[]args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter balance and amount : ");
		double balance=sc.nextDouble();
		double amount=sc.nextDouble();
	
		Banking b=new Banking();
		try{
			b.withdraw(balance,amount);
		}
		catch(IllegalAccessError i){
			System.out.print("error  is "+i.getMessage());
			
		}
		catch(ArithmeticException a){
			System.out.print("error  is "+a.getMessage());
			
		}
	}
}
