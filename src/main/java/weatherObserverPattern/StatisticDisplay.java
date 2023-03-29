package main.java.weatherObserverPattern;

public class StatisticDisplay implements Display, UpdateObserve {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	
	private int numReadings;
	
	private WeatherData weatherData;
	
	public StatisticDisplay(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
		
	}
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

	@Override
	public void display() {
		System.out.println("Avg / Max / Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);

	}
	public WeatherData getWeatherData() {
		return weatherData;
	}
	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

}
