package interviewcake;

//Writing programming interview questions hasn't made me rich. Maybe trading Apple stocks will.
//Suppose we could access yesterday's stock prices as an array, where:
//
//The indices are the time in minutes past trade opening time, which was 9:30am local time.
//The values are the price in dollars of Apple stock at that time.
//So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500;.
//
//Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

public class InterviewCake1 {
	public static void main(String[] args) {
		int[] stockPricesYesterday = new int[]{10, 7, 5, 112, 11, 9};


		System.out.println("Maximum profit can be: "+getMaxProfit(stockPricesYesterday));

	}

	private static int getMaxProfit(int[] a) {
		int min = a[0], max = a[0], index = 0;
		
		// Find chepest stock
		for(int i=0; i<a.length;i++){
			if(i+2 < a.length && a[i] < min){
				min = a[i];
				index = i;
			}
		}
		
		// Find highest stock available after one min of purchased stock
		for(int j = index+2; j<a.length; j++){
			if(a[j]>max) max  = a[j];
		}
		
		System.out.println("Cheapest stock: "+min+", Highest stock: "+max);
		
		return (max - min);
	}
}
