package stockObservers;

import stockObservers.GetAStock;
import stockObservers.StockGrabber;
import stockObservers.StockObservers;

public class StockUpdateSimulator {

	public static void main(String[] args) {


		//create subject object and it would handle all observers to add, remove and update
		StockGrabber stockGrabber = new StockGrabber();
		
		//create an Observer that sent update from subject
		StockObservers stockObservers1 = new StockObservers(stockGrabber);
		
		stockGrabber.setApplPrice(197.23);
		stockGrabber.setGoogPrice(215.35);
		stockGrabber.setIbmPrice(150.12);
		
		StockObservers stockObservers2 = new StockObservers(stockGrabber);
		stockGrabber.setApplPrice(181.61);
		stockGrabber.setGoogPrice(207.78);
		stockGrabber.setIbmPrice(156.48);
		
		StockObservers stockObservers3 = new StockObservers(stockGrabber);
		stockGrabber.setApplPrice(193.81);
		stockGrabber.setGoogPrice(187.00);
		stockGrabber.setIbmPrice(177.72);
		
		Runnable getIBM = new GetAStock(stockGrabber, 2, "IBM", 189.47);
		Runnable getAPPL = new GetAStock(stockGrabber, 2, "APPL", 169.49);
		Runnable getGOOG = new GetAStock(stockGrabber, 2, "GOOG", 149.12);
		
		new Thread(getIBM).start();
		new Thread(getAPPL).start();
		new Thread(getGOOG).start();
		

	}

}
