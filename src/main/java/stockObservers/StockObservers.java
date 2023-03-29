package stockObservers;


public class StockObservers implements UpdateObserver {
	
	private double ibmPrice;
	private double applPrice;
	private double googPrice;

	private static int observerIdTracker = 0;
	private int observerId;
	private StockSubject stockGrabber;
	
	public StockObservers(StockSubject stockGrabber) {
		
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIdTracker;
		System.out.println("New Observer " + this.observerId);
		
		stockGrabber.registerStocks(this);
	}
	
	@Override
	public void update(double ibmPrice, double applPrice, double googPrice) {
		this.ibmPrice= ibmPrice;
		this.applPrice = applPrice;
		this.googPrice = googPrice;
		
		displayPrice();
	}
	
	private void displayPrice() {
		System.out.println(observerId + " \nIBM: " + ibmPrice + "\nApple : " + applPrice + "\nGoogle : " + googPrice + "\n");
		
	}

	public void setStockGrabber(StockSubject stockGrabber) {
		this.stockGrabber = stockGrabber;
	}

}
