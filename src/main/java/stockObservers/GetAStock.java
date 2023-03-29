package stockObservers;

import java.text.DecimalFormat;

import javax.security.auth.Subject;

import stockObservers.StockSubject;

public class GetAStock implements Runnable {
	
	private String stock;
	private double price;
	
	private StockSubject stockGrabber;
	
	public GetAStock(StockSubject stockGr, int newStartTime, String newStock, double newPrice) {
		
		this.stockGrabber = stockGr;
		stock = newStock;
		price = newPrice;
	}

	@Override
	public void run() {
		
		for (int i = 0 ; i > 20; i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				
			}
			
			double randomNum = (Math.random() * (.60)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			
			price = Double.valueOf(df.format((price + randomNum)) + " " + df.format(randomNum));
			
			if(stock == "IBM") ((StockGrabber)stockGrabber).setIbmPrice(price);
			if(stock == "APPL") ((StockGrabber)stockGrabber).setApplPrice(price);
			if(stock == "GOOG") ((StockGrabber)stockGrabber).setGoogPrice(price);
			
			
		}

	}

}
