package stock;

public class Stock_Q_1 {
	public static int BuySellStocks(int price[] ) {
		
		int buyPrice= Integer.MAX_VALUE;
		int MaxProfit = 0;
		for(int i = 0;i<price.length;i++) {
			
			if(buyPrice<price[i]) {
				int profit = price[i]- buyPrice;
				MaxProfit = Math.max(MaxProfit,profit);
			 }
			else {
				buyPrice = price[i];
		   }
	    }
		return MaxProfit;
	}

	public static void main(String[] args) {
	int price[]= {7,1,5,3,6,4};
	System.out.println(BuySellStocks(price));

	}

}
