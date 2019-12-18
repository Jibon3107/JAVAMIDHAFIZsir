import java.lang.*;
import java.util.Date;

class DebitAccount extends Account
{
	
		public DebitAccount()
	{
		
		
	}
	
	public DebitAccount(String ID,String name,Date b,String nominee,double balance)
	{
		
		this.ID=ID;
		this.name=name;
		DOB=b;
		this.nominee=nominee;
		this.balance=balance;
		
	}
	
	
	public String id2()
	{
		return ID;
		
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
		
	    System.out.println("name:"+name);
		System.out.println("id:"+ID);
		System.out.println("Date of birth:"+DOB.getDate()+"-"+DOB.getMonth()+"-"+DOB.getYear());
		System.out.println("nominee name:"+nominee);
		System.out.println("balance:"+balance);
		
	}
	
	
}