/*create a bank appliation , n number of customers, customer properties should be defined
withdraw, balancechecking,.....
Bank management system:
Select from following option :
1. Add Customer
2. Delete Customer
3. Edit Customer
4. exit*/
import java.util.Scanner;
class Ass_1
{
	public static void main(String arg[])
	{
		Scanner pp = new Scanner(System.in);
		System.out.print("How Many Customer You Want to Create : ");
		int n = pp.nextInt();
		Customer C[] = new Customer[n];

		for(int i=0;i<C.length;i++)
		{
			C[i] = new Customer();
			C[i].addCustomer();
		}

		int ch;
		do
		{
			System.out.println("Main Menu :");
			System.out.println("1.Add new Customer");
			System.out.println("2.Delete Customer");
			System.out.println("3.Edit Customer");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice :");
			ch = pp.nextInt();
			switch(ch)
			{
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i] = new Customer();
						C[i].addCustomer();
					}
					break;

				case 2:
					System.out.print("Enter Account Number You Want to Delete : ");
					int acn = pp.nextInt();
					boolean found = false;
					for(int i=0;i<C.length;i++)
					{
						found = C[i].find(acn);
						if(found)
						{
							C[i].deleteCustomer();
							System.out.printl("Account Deleted");
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Does Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account Number You Want to Edit : ");
					acn = pp.nextInt();
					found=false;
					for(int i=0;i<C.length;i++)
					{
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 4:
					System.out.print("--THANK YOU FOR BANKING--");
					break;
			}
		}
		while(ch!=4);
	}
}
