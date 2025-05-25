import java.util.*;
abstract class WalletPayment
{
	String walletId;
	double balance;
	double deduct;
	double amount1;
	
	public WalletPayment(String walletId,double balance)
	{
		this.walletId= walletId;
		this.balance= balance;
	}
	
	abstract void makePayment(double amount);
	public void displayWalletDetail()
	{
		System.out.println("Wallet Id: "+walletId);
		System.out.println("Balance: "+balance);
	}
}
class PaytmWallet extends WalletPayment
{
	public PaytmWallet(String walletId,double balance)
	{
		super(walletId,balance);
	}
	
	void makePayment(double amount)
	{
		if(amount>0)
		{
			deduct=(1.5*amount)/100;
			double totalAmount= deduct+amount;
			
			if(balance>=totalAmount)
			{
				balance-= totalAmount;
				System.out.println("Paytm Payment Successful.");
				System.out.println("Transaction Amount: " + amount);
				System.out.println("Deducted Charges: " + deduct);
				System.out.println("Remaining Balance: " + balance);
			}	
			else{
				System.out.println("\nPaytm: Insufficient balance for this transaction");
			}
		}
		else{
			System.out.println("\nPaytm: Invalid amount transaction");
		}
	}
}
class GooglePayWallet extends WalletPayment
{
	public GooglePayWallet(String walletId,double balance)
	{
		super(walletId,balance);
	}
	
	void makePayment(double amount)
	{
		if(amount>0)
		{
			deduct=(1.2*amount)/100;
			double totalAmount= deduct+amount;
			
			if(balance>=totalAmount)
			{
				balance-= totalAmount;
				System.out.println("\nGooglePay Payment Successful.");
				System.out.println("Transaction Amount: " + amount);
				System.out.println("Deducted Charges: " + deduct);
				System.out.println("Remaining Balance: " + balance);
			}	
			else{
				System.out.println("GooglePay: Insufficient balance for this transaction");
			}
		}
		else{
			System.out.println("\nGooglePay: Invalid amount transaction");
		}
	}
}
public class MobileWalletApp
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		WalletPayment pw= new PaytmWallet("1",10000);
		WalletPayment gw= new GooglePayWallet("2",20000);
		
		System.out.print("Enter amount for transaction: ");
		double amount= sc.nextDouble();
		
		pw.makePayment(amount);
		gw.makePayment(amount);
		System.out.println("\nWallet Detail");
		pw.displayWalletDetail();
		gw.displayWalletDetail();
	}
}