import java.util.ArrayList;


public class BestBet {

	public static ArrayList<Integer> predictions = new ArrayList<Integer>();
	
	
	public static void solve()
	{
		
		int i=0;
		int min = 0;
		int buy = 0;
		int sell =0;
		int profit = 0;
		
		
		while(i<predictions.size())
		{
			if(predictions.get(i)<predictions.get(min))
			{
				min = i;
			}
			else if((predictions.get(i)-predictions.get(min))>profit)
			{
				buy = min;
				sell = i;
				profit = predictions.get(i)-predictions.get(min);
				
			}
			
			
			i++;
		}
		
		System.out.println("Buy @ "+predictions.get(buy)+" Sell @ "+predictions.get(sell)+" Profit ="+profit);
	}
	
}
