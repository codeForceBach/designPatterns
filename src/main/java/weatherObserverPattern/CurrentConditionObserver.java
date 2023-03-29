package main.java.weatherObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionObserver implements Observer, Display {
	
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionObserver (Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature  + " F degrees and " + humidity + " % humidity");
	}

	@Override
	public void update(Observable obs, Object arg) {

			if(obs instanceof WeatherObservableData) {
				WeatherObservableData weatherObservableData = (WeatherObservableData) obs;
				this.temperature = weatherObservableData.getTemperature();
				this.humidity = weatherObservableData.getHumidity();
				display();
			}
		
	}

}
