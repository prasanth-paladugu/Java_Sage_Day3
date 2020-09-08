//Bank Class
import java.util.Scanner;

class Customer
{
	int acc_no;
	String name;
	long balance;
	Scanner cust = new Scanner(System.in);

	void addCustomer()
	{
		System.out.print("Enter Account No: ");
		acc_no = cust.nextInt();
		System.out.print("Enter Name: ");
		name = cust.next();
		System.out.print("Enter Balance: ");
		balance = cust.nextLong();
	}

	boolean find(int acn)
	{
		if(acc_no == acn)
		{
			return(true);
		}
		return(false);
	}

	void deleteCustomer()
	{
		acc_no = 0;
		name = "";
		balance = 0L;
	}

	void showAccountDetails()
	{
		System.out.println(acc_no + "," + name + "," + balance);
	}

	void deposit()
	{
		System.out.println("Enter Amount U Want to Deposit : ");
		long amt = cust.nextLong();
		balance = balance + amt;
	}

	void withdrawal()
	{
		System.out.println("Enter Amount You Want To Withdraw : ");
		long amt = cust.nextLong();
		if(balance >= amt)
		{
			balance = balance - amt;
		}
		else
		{
			System.out.println("Insufficient Balance..Can't Process The Transaction...");
		}
	}

	boolean search(int acn)
	{
		if(acc_no == acn)
		{
			showAccountDetails();
			return(true);
		}
		return(false);
	}
}