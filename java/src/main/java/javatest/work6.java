package javatest;

public class work6 {
    public static void main(String[] args) {
    	int[] prices = {2000, 3000, 1500, 2300, 3200, 1100, 3300, 4200, 6100, 4300};
        int[] quantities = {2, 1, 1, 2, 3, 2, 1, 1, 2, 3};
        
        FinalPriceCalculator calculator = new FinalPriceCalculator(prices, quantities);
        Thread t = new Thread(calculator);
        t.start();
    }
}

class FinalPriceCalculator implements Runnable {
	private int[] prices;
	private int[] quantities;
	
	public FinalPriceCalculator(int[] prices, int[] quantities) {
		this.prices = prices;
		this.quantities = quantities;
		
		for(int i = 0; i < prices.length; i++) {
			int finalPrice = prices[i] * quantities[i];
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < prices.length; i++) {
			int finalPrice = prices[i] * quantities[i];
			System.out.println("최종금액 " + (i + 1) + ": " + finalPrice);
		}
	}
}