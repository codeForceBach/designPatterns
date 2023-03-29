package main.java.weatherObserverPattern;

import java.util.ArrayList;

public class WeatherData implements WeatherSubject {
	
	private ArrayList<UpdateObserve> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData () {
		observers = new ArrayList<UpdateObserve> ();
	}
	
	@Override
	public void registerObserver(UpdateObserve ob) {
		observers.add(ob);
		
	}

	@Override
	public void removeObserver(UpdateObserve ob) {
		int i = observers.indexOf(ob);
		if (i >= 0) {
			observers.remove(ob);
		}
	}

	@Override
	public void notifyObserver() {
		for(UpdateObserve ob : observers) {
			ob.update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementChanged () {
		notifyObserver();	
	}

	public void setMeasurements(float temp, float humid, float pressure) {
		temperature = temp;
		humidity = humid;
		this.pressure = pressure;
		measurementChanged();
		
	}

}
