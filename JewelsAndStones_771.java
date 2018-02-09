package helloworld;

public class JewelsAndStones_771 {
	
	public static void main(String args[])
	{
		//LinkedList list = new LinkedList();
		
		String J = "aA";
		String S = "aAABB";
		char[] arrayJ = J.toCharArray();
		char[] arrayS = S.toCharArray();
		int count =0;
		for(int i=0;i<arrayJ.length;i++)
		{
			for(int j=0;j<arrayS.length;j++)
			{
				if(arrayJ[i]==arrayS[j])
				{
					count++;
				}
				
			}
		}
		System.out.println(count);
	}

}
