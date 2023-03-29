package main.java.weatherObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class HealthIndexObserver implements Display, Observer{
	
	private float heatIndex = 0.0f;
	private WeatherObservableData weatherobserveData;
	
	public HealthIndexObserver(Observable obs) {
		this.setObservable(obs);
		obs.addObserver(this);
	}

	/*
	@Override
	public void update(float temp, float humidity, float pressure) {
		heatIndex = computeHeatIndex(temp, humidity);
		display();
		
	}
	*/

	private void setObservable(Observable obs) {
		this.setObservable(obs);
		
	}

	private float computeHeatIndex(float temp, float humidity) {
		float index = (float)((16.923 + (0.185212 * temp) + (5.37941 * humidity) - (0.100254 * temp * humidity) 
				+ (0.00941695 * (temp * temp)) + (0.00728898 * (humidity * humidity)) 
				+ (0.000345372 * (temp * temp * humidity)) - (0.000814971 * (temp * humidity * humidity)) +
				(0.0000102102 * (temp * temp * humidity * humidity)) - (0.000038646 * (temp * temp * temp)) + (0.0000291583 * 
				(humidity * humidity * humidity)) + (0.00000142721 * (temp * temp * temp * humidity)) + 
				(0.000000197483 * (temp * humidity * humidity * humidity)) - (0.0000000218429 * (temp * temp * temp * humidity * humidity)) +
				0.000000000843296 * (temp * temp * humidity * humidity * humidity)) -
				(0.0000000000481975 * (temp * temp * temp * humidity * humidity * humidity)));
			return index;
	}

	@Override
	public void display() {
		System.out.println("Heat Index is " + heatIndex);
		
	}


	@Override
	public void update(Observable obsv, Object ob) {

		if (obsv instanceof WeatherObservableData) {
			WeatherObservableData weatherObData = (WeatherObservableData) ob;
			heatIndex = computeHeatIndex(weatherObData.getTemperature(), weatherObData.getHumidity());
		}
		display();
		
	}
	
	public WeatherObservableData getWeatherData() {
		return weatherobserveData;
	}

	public void setWeatherData(WeatherObservableData weatherObData) {
		this.weatherobserveData = weatherObData;
	}

}
