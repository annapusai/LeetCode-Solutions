package helloworld;

public class HammingDistance_461 {
	
	public static void main(String args[])
	{
		int  x=14;
		int  y=2;
		String x1 = Long.toBinaryString(x);
		String x2 = Long.toBinaryString(y);
		
		System.out.println(x1+" "+x2);
		System.out.println(x1.length()+" "+x2.length());
		if(x1.length()==x2.length())
		{
			
		}
		else if(x1.length()>x2.length())
		{
			int s =x1.length()-x2.length();
			for(int i=0;i<s;i++)
			{
				x2 = "0"+x2;
			}
		}
		else
		{
			int s =x2.length()-x1.length();
			for(int i=0;i<s;i++)
			{
				x1 = "0"+x1;
			}
		}
		
//		x1 = x1.substring(x1.length()-4, x1.length());
//		x2 = x2.substring(x2.length()-4, x2.length());
		System.out.println(x1+" "+x2);
		char[] a = x1.toCharArray();
		char[] b = x2.toCharArray();
		System.out.println(a.length+" "+b.length);
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]!=b[i])
				{
					count++;
				}
		}
        System.out.println(count);
		
	}

}
