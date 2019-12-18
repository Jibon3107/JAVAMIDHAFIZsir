import java.lang.*;
import java.util.Date;

class Start
{

public static void main(String args[])
	{
		
		Bank b=new Bank();
		
		
		String s=b.CreateAccount();
		String k=b.CreateAccount();
		b.Deposite();
		b.Withdraw();
		b.Print(s);
		b.Print(k);
		
		
		
	}
	
}