package main.java.weatherObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastObserver implements Display, Observer {
	
	private Observable observable;
	private float lastPressure;
	private float currentPressure;
	
	public ForecastObserver(Observable observable) {
		this.setObservable(observable);
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherObservableData) {
			WeatherObservableData weatherObData = (WeatherObservableData) obs;
			currentPressure = weatherObData.getPressure();
			display();
		}

	}

	@Override
	public void display() {
		System.out.print("Forecast : " );
		if(currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure < lastPressure) {
			System.out.println("More of the same!");
		} else {System.out.println("watch out for cooler rainy weather!");
			
		}

	}

	public Observable getObservable() {
		return observable;
	}

	public void setObservable(Observable observable) {
		this.observable = observable;
	}

}
