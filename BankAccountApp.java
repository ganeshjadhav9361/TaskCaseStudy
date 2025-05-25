import java.util.*;
class BankAccount
{
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber,double balance)
	{
		this.accountNumber= accountNumber;
		this.balance= balance;
	}
	void Deposit(double amount)
	{
		balance+= amount;
	}
	void Withdraw(double amount)
	{
		if(amount>0)
		{
			balance-= amount;
		}
	}
	public void DisplayDetail()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}
class SavingAccount extends BankAccount
{
	public SavingAccount(String accountNumber,double balance)
	{
		super(accountNumber,balance);
	}
	void Withdraw(double amount)
	{
		if(amount<=(balance/2))
		{
			balance-= amount;
			System.out.println("Transaction Successfully............");
			System.out.println("Withdraw amount: "+amount);
			System.out.println("Remaining Balance: "+balance);
		}
		else{
			System.out.println("Enter less amount 50% of available balance");
		}
	}
}
class CurrentAccount extends BankAccount
{
	public CurrentAccount(String accountNumber,double balance)
	{
		super(accountNumber,balance);
	}
	void Withdraw(double amount)
	{
		if(amount<=5000)
		{
			balance-= amount;
			System.out.println("Transaction Successfully..............");
			System.out.println("Withdraw amount: "+amount);
			System.out.println("Remaining Balance: "+balance);
		}
		else{
			System.out.println("Enter amount upto 5000");
		}
	}
}
public class BankAccountApp
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		BankAccount sa= new SavingAccount("632162412267",10000);
		BankAccount ca= new CurrentAccount("73876821873",20000);
	
		System.out.println("Enter Deposit amount");
		double deposit= sc.nextDouble();
		sa.Deposit(deposit);
		ca.Deposit(deposit);
		
		System.out.println("\nSaving Account");
		System.out.println("Enter Withdraw amount");
		double amount= sc.nextDouble();
		sa.Withdraw(amount);
		
		System.out.println("\nCurrent Account");
		System.out.println("Enter Withdraw amount");
		amount= sc.nextDouble();
		ca.Withdraw(amount);
		
		System.out.println("\nBank Detail");
		System.out.println("Saving Account");
		sa.DisplayDetail();
		System.out.println("\nCurrent Account");
		ca.DisplayDetail();
	}
}