package com.neuedu;
public class Demo
{
	int[] num = {-1,999,100,500};
	public static int[] xuanZe(int[] nums)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
	
}


public class Demo
{
	public static int[] xuanZe(int[] nums)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					int temp = nums[i];
					nums[i] = nums [j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
}