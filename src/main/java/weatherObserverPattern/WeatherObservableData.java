package main.java.weatherObserverPattern;

import java.util.Observable;

public class WeatherObservableData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherObservableData() {}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humid, float pressure) {
		temperature = temp;
		humidity = humid;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
