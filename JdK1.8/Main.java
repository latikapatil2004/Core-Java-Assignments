class BankAccount
{
	 int balance=1000;
	synchronized void withraw(int amount)
	{
	if(balance>=amount)
	{
		System.out.println(Thread.currentThread().getName()+" withdrawing");
	
	balance=balance-amount;
	System.out.println("remaining : "+ balance);
	
	}
	else
	{
		System.out.println("Insufficient balance");
	}
	}
}
class Mythread extends Thread
{
	BankAccount account;
	Mythread(BankAccount account)
	{
		this.account=account;
	}
	public void run()
	{
		account.withraw(700);
	}
}
class Main
{
	public static void main(String[]args)
	{
		BankAccount b=new BankAccount();
		Mythread t1=new Mythread(b);
		Mythread t2=new Mythread(b);
		t1.start();
		t2.start();
	}
}