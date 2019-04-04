import java.util.*;
public class Maopao
{
	public static void main(String[] args)
	{
		int[] nums = {
			1,323,54,576,76,88,78,79,6354,42
		};
		int[] newArr = maopao(nums);
		System.out.print(Arrays.toString(newArr));
	}
	public static int[] maopao(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}
