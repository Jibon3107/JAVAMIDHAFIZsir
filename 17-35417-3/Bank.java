import java.lang.*;
import java.util.Date;
import java.util.Scanner;

class Bank
{
	
	DebitAccount list[]=new DebitAccount[100];
	private int count;
	
	public String CreateAccount()
	{
		
		String ID=IDGENARATOR.generate();
		
		Scanner myobj=new Scanner(System.in);
	   System.out.println("input user name:");
	   
	  String name=myobj.nextLine();
	  
	  
	  System.out.println("input nominee name:");
	   
	  String nominee=myobj.nextLine();
	  
	  System.out.println("enter date of your Birthday:");
	  int date=myobj.nextInt();
	  
	  System.out.println("enter month of your Birthday:");
	  int month=myobj.nextInt();
	  
	  System.out.println("enter year of your Birthday:");
	  int year=myobj.nextInt();
	  
	  
	 double balance;
	 System.out.println("please input balance:"); 
	 balance=myobj.nextDouble();
	 
	for(int i=1;i>0;i++)
	{
	  
	  if(balance<=100000)
	  {
		  break;
	  }
	  else
	  {
		  System.out.println("account balance is more than 100000.so please re input the balance:");
		  balance=myobj.nextDouble();
	  }
	}
	  
	  DebitAccount d=new DebitAccount(ID,name,new Date(year,month,date),nominee,balance);
	  addAccount(d);
	  
	  count++;
	  
	  return ID;
	  
	  
	  
	  
	  
		
		
		
		
	}
	
	public void addAccount(DebitAccount m)
	{
		int i;
		for(i=0;i<=count;i++)
		{
			if(list[i]==null)
			{
				list[i]=m;
				break;
				
			}
			
		}
		
	}
	
	public void Deposite()
	{
		
		Scanner myobj1=new Scanner(System.in);
	   System.out.println("input Account id:");
	   
	  String id=myobj1.nextLine();
	  
	  System.out.println("enter the amount:");
	  double amount=myobj1.nextDouble();
	  
	  
	  
	  
	  
	   if(searchAccount(id)!=null)
	  {
		  boolean n=searchAccount(id).deposite(amount);
		  if(n==true)
		  {
			 System.out.println("transaction successfull"); 
		  }
		  else
		  {
			   System.out.println("transaction failed becuase daily transaction limit exceeded"); 
			  
		  }
		  
	  }
	  
	  else if(searchAccount(id)==null)
	  {
		  
		  
		  System.out.println("acccount not found");
		  
		  
	  }
	  
	  
		
		
	}
	
	public void Withdraw()
	{
		
		Scanner myobj1=new Scanner(System.in);
	   System.out.println("input Account id:");
	   
	  String id=myobj1.nextLine();
	  
	  System.out.println("enter the amount:");
	  double amount=myobj1.nextDouble();
	  
	  
	  DebitAccount x=searchAccount(id);
	  
	  if(x==null)
	  {
		  
		  System.out.println("acccount not found");
		  
	  }
	  else if(x!=null)
	  {
		  boolean n=x.withdraw(amount);
		  if(n==true)
		  {
			 System.out.println("transaction successfull"); 
		  }
		  else
		  {
			  System.out.println("transaction failed becuase daily transaction limit exceeded"); 
			  
		  }
		  
	  }
	  
	  
		
		
	}
	
	public DebitAccount searchAccount(String id)
	{
	
		for(int i=0;i<count;i++)
		{
			if(list[i].id2().equals(id))
			{
				return list[i];
			}
			
			
		}
		
		
		return null;
		
		
		
	}
	
	public void Print(String id)
	{
		
		
		DebitAccount x=searchAccount(id);
	  
	  if(x!=null)
	  {
		  
		x.printAccount();
		  
	  }
	  
	  
	  
		
		
	    
		
	}
	
	
	
}