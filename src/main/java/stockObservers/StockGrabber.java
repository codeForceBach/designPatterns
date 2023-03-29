package stockObservers;

import java.util.ArrayList;

public class StockGrabber implements StockSubject {
	
	private ArrayList<UpdateObserver> observers;
	private double ibmPrice;
	private double applPrice;
	private double googPrice;

	public StockGrabber () {
		observers = new ArrayList<UpdateObserver>();
	}
	
	@Override
	public void registerStocks(UpdateObserver newStockObsv) {
		observers.add(newStockObsv);

	}

	@Override
	public void removeStocks(UpdateObserver removeStockObsv) {
		int index = observers.indexOf(removeStockObsv);
		System.out.println("Observers " + (index + 1) + "removed");
		observers.remove(index);

	}

	@Override
	public void notifyStocks() {
		for(UpdateObserver stock : observers) {
			stock.update(ibmPrice, applPrice, googPrice);
		}
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public double getApplPrice() {
		return applPrice;
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyStocks();
	}

	public void setApplPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyStocks();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyStocks();
	}

}
