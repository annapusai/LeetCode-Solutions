package helloworld;

import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumbers_728 {
	public static List<Integer> selfDividing(int left,int right)
	{
		List<Integer> list = new LinkedList<Integer>();
		outerloop:
		for(int i= left;i<=right;i++)
		{
			int temp1 = i;
			try{
			while(i>0)
			{
				int temp = i%10;
					if( temp1%temp==0)
				{
					i=i/10;
				}
				else
				{
					i=temp1;
					continue outerloop;	
				}
			}
			list.add(temp1);
			i=temp1;
		}
			catch(ArithmeticException e)
			{
				i=temp1;
				continue outerloop;
			}
		}
		return list;
	}
	
	public static void main(String args[])
	{
	
	int left = 1;
	int right = 22;
	List<Integer> l = new LinkedList<Integer>();
	l = selfDividing(left,right);
	System.out.println(l);
	
	}
	

}
