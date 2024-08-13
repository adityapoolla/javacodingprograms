package apoolla.gfg.programs;

public class BestTimeToBuySellStock {

	public static void main(String[] args) {
		int[] stockPrices = new int[] {1, 2, 10, 9, 27};
		System.out.println(findMaxProfit(stockPrices));
	}
	
	public static int findMaxProfit(int[] stockPrices) {
		int currentMin = stockPrices[0];
		int profit = 0;
		for(int price : stockPrices) {
			if(price < currentMin) {
				currentMin = price;
			}
			if(price - currentMin > profit) {
				profit = price - currentMin;
			}
		}
		return profit;
	}
}

