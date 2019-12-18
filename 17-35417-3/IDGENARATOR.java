import java.lang.*;
import java.util.Date;

class IDGENARATOR
{
	private static int serial_no=00001;
	private  static int month;
	private  static int prev_mon=1;

	
	
	public static String id1()
	{
		if(serial_no<10)
		{
			String b="0000"+serial_no;
			return b;
		
		
		}
		
		if(serial_no>=10 && serial_no<99 )
		{
			String b="000"+serial_no;
			return b;
		
		
		}
		
		if(serial_no>=100 && serial_no<999 )
		{
			String b="00"+serial_no;
			return b;
		
		
		}
		
		if(serial_no>=1000 && serial_no<9999 )
		{
			String b="0"+serial_no;
			return b;
		
		
		}
		if(serial_no>=10000 && serial_no<99999 )
		{
			String b=""+serial_no;
			return b;
		
		
		}
		return null;
	}
	
	public static String mon()
	{
		if(month<10)
		{
			String b="0"+month;
			return b;
		}
		
		if(month>10)
		{
			String b=""+month;
			return b;
		}
		
	return null;
		
	}
	
	public static String generate()
	{
		Date now=new Date();
		int year=now.getYear()+1900;
		String id=year+"";
		int a=now.getMonth()+1;
		month=a;
		id+="-"+mon();
	    
		id+="-"+id1();
		
		if(prev_mon!=month)
		{
			serial_no=00001;
		}
		
		
		serial_no+=1;
		prev_mon=month;
		System.out.println("Id:"+id);
	   return (id);
		
		
		
	}
	
	
	
	
}


