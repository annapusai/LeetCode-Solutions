package helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//import List;

public class ArrayPartitionI_561 {
	static int partition(int[] nums)
	{
		
		Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<nums.length;i=i+2)
		{
			sum+=Math.min(nums[i],nums[i+1]);	
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		int[] numbers = new int[]{1,3,4,2};
		int sum = partition(numbers);
		System.out.println(sum);
		
	}

}
