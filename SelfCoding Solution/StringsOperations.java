import java.util.ArrayList;

public class StringsOperations {

	
	public void operation1()
	{
		
		ArrayList <String> strarray=new ArrayList<String>();
		strarray.add("aaacodebbb");
		strarray.add("codexxcode");
		strarray.add("cozexxcope");
		
		for(String str : strarray)
		{
			int i=countcode(str);
			System.out.println("Result:" +str+ "->"+ i);
			
		}
		
	}
	
	public void operation2() {
		
	
		endOther("Hiabc", "abc");
		endOther("AbC", "HiaBc");
		endOther("abc", "abXabc");
		
	}
	
	public void operation3()
	{
		String result;
		 result=firsthalf("WooHoo");
		System.out.println("WooHoo"+"->"+ result);
	
		 result=firsthalf("HelloThere");
		System.out.println("HelloThere"+"->"+ result);
		
		 result=firsthalf("abcdef");
		System.out.println("abcdef"+"->"+ result);
			
		
	}
	
	public void operation4()
	{
		 String reverse = "";
		 reverse=reverseString("hello There");
		 System.out.println("hello There"+"->"+ reverse);
		 
		 reverse=reverseString("Seattle is cool");
		 System.out.println("Seattle is cool"+"->"+ reverse);
		 reverse=reverseString("I love Java");
		 System.out.println("I love Java"+"->"+ reverse);
		 
		 
		 
		
	}
	
	public String reverseString(String str )
	{
		int length =str.length();
		String temp="";
		 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         temp = temp + str.charAt(i);
	      return temp;
		
	}
	
	public String firsthalf(String str)
	{
		return str.substring(0, str.length()/2);
	}
	
	
	public void endOther(String a, String b)
	{
		int aLen = a.length();
		int bLen = b.length();
		String end;
		String temp;
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(aLen >= bLen)
		{
			end = a.substring(aLen - bLen);
			temp = b;
		}
		else
		{
			end = b.substring(bLen - aLen);
			temp = a;
		}
		//return (end.equals(temp));
		
		System.out.println("Result:" +a+ "," +b +"->"+end.equals(temp));
	}
	
	public int countcode(String str)
	
	
	{
		

		int times = 0;
		int i = 0;
		int len = str.length()-3;
		while(i <  len)
		{
			if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e')
			{
				times++;
				i += 4;
			}
			else
				i++;
		}
		return times;

		
		
	}
	
public static void main(String[] args) {
	
	StringsOperations so = new StringsOperations();
	so.operation1();
	System.out.println();
	so.operation2();
	System.out.println();
	so.operation3();
	System.out.println();
	so.operation4();
	
		
		

	}

}
