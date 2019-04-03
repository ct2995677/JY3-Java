public class BuyDrink
{
	public static void main(String[] args) 
	{
		System.out.print(buy(0,6));
	}

	/*
		买饮料的方法	
		0杯不卖 1杯以上 第2杯半价
		          6        9
	*/
	public static double buy(int count,double price)
	{
		if(count < 1)
		{
			System.out.print("不卖");
			return 0.0;
		}else
		{
			//price = price + (count -1) * price/2; 
			price += (count -1) * price/2;
			return price;
		}
	}
}
