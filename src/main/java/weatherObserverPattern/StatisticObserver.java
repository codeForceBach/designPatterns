package main.java.weatherObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class StatisticObserver implements Display, Observer {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	
	private int numReadings;
	
	//private WeatherData weatherData;
	private WeatherObservableData weatherObsData;
	
	public StatisticObserver(WeatherObservableData weatherObData) {
		//this.setWeatherData(weatherObData);
		//weatherData.registerObserver(this);
		weatherObsData = weatherObData;
		weatherObsData.addObserver(this);
		
	}
	/*
	@Override
	public void update(float temp, float humid, float pressure) {
		tempSum += temp;
		numReadings++;
		
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		if(temp < maxTemp) {
			minTemp = temp;
		}
		
		display();
	}
	*/

	@Override
	public void display() {
		System.out.println("Avg / Max / Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);

	}
	
	@Override
	public void update(Observable obsv, Object arg) {
		if(obsv instanceof WeatherObservableData) {
			WeatherObservableData weatherObsData = (WeatherObservableData) obsv;
			float temp = weatherObsData.getTemperature();
			
			tempSum += temp;
			numReadings++;
			
			if (temp > maxTemp) {
				maxTemp = temp;
			}
			if(temp < maxTemp) {
				minTemp = temp;
			}
			
			display();
		}
		
	}

}
