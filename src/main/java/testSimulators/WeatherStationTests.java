package main.java.testSimulators;

import main.java.weatherObserverPattern.CurrentCondition;
import main.java.weatherObserverPattern.ForecastDisplay;
import main.java.weatherObserverPattern.StatisticDisplay;
import main.java.weatherObserverPattern.WeatherData;

public class WeatherStationTests {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		
		new CurrentCondition(weatherData);
		new StatisticDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(90, 40, 43.6f);
		weatherData.setMeasurements(84, 69, 30.1f);
		weatherData.setMeasurements(87, 53, 39.2f);
	}

}
