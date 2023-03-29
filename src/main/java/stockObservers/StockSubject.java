package stockObservers;

public interface StockSubject {
	
	public void registerStocks(UpdateObserver newStockObsv);
	public void removeStocks(UpdateObserver removeStockObsv);
	public void notifyStocks();
}
