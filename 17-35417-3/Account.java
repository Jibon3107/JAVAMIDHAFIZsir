import java.lang.*;
import java.util.Date;

class Account
{
	protected String name;
	protected String ID;
	Date DOB;
	protected String nominee;
	protected double mbalance=100000;
	protected double balance;
	protected int datetrac=0;
	protected int prevdatetrac=0;
	
	protected int transtrac=0;
	
	
	public Account()
	{
		
		
	}
	
	public Account(String ID,String name,Date b,String nominee,double balance)
	{
		this.ID=ID;
		this.name=name;
		
		DOB=b;
		this.nominee=nominee;
		this.balance=balance;
		
	}
	
	public boolean deposite(double amount)
	{
		Date db=new Date();
		datetrac=db.getDate();
		
		if(prevdatetrac!=datetrac)
		{    
	         transtrac=0;
			if(amount<=20000 && (mbalance-balance)>=amount)
			{
				if(balance<mbalance)
				{
					balance+=amount;
					transtrac+=amount;
					prevdatetrac=datetrac;
					
					return true;
				}
				else
				{
				    return false;	
				}
			}
			
			else
			{
				
				return false;
			}
		
		
		
	}
	
	else if(prevdatetrac==datetrac)
		{    
	         
			if((transtrac+amount)<=20000)
			{
				if(amount<=20000 && (mbalance-balance)>=amount)
				{
				if(balance<mbalance)
				{
					balance+=amount;
					transtrac+=amount;
					prevdatetrac=datetrac;
					return true;
				}
				else
				{
				    return false;	
				}
			}
			else 
			{
				
				return false;
			}
			}
			else
			{
				
				return false;
			}
		}
			
			else
			{
				
				return false;
			}
		
		
		
	
	
	}
	
	
	
	
	public boolean withdraw(double amount)
	{
		Date db=new Date();
		datetrac=db.getDate();
		if(prevdatetrac!=datetrac)
		{    
	         transtrac=0;
			if(amount<=20000 )
			{
				if(balance>=amount)
				{
					balance-=amount;
					transtrac+=amount;
					prevdatetrac=datetrac;
					return true;
				}
				else
				{
				    return false;	
				}
			}
			
			else
			{
				
				return false;
			}
		
		
		
	}
	
	else if(prevdatetrac==datetrac)
		{    
	         
			if((transtrac+amount)<=20000)
			{
				if(amount<=20000 )
				{
				if(balance>=amount)
				{
					balance-=amount;
					transtrac+=amount;
					prevdatetrac=datetrac;
					return true;
				}
				else
				{
				    return false;	
				}
			}
			else 
			{
				
				return false;
			}
			}
			else
			{
				
				return false;
			}
		}
			
			else
			{
				
				return false;
			}
		
		
		
	
	
	}
	public void printAccount()
	{
		System.out.println(name);
		System.out.println(ID);
		System.out.println(DOB.getDate()+"-"+DOB.getMonth()+"-"+DOB.getYear());
		System.out.println(nominee);
		System.out.println(balance);
		
		
		
		
	}
	
	
	
	
	
}