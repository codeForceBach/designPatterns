package main.java.weatherObserverPattern;

public class ForecastDisplay implements Display, UpdateObserve {
	
	private float currentPressure = 29.92f;
	
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humid, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
		
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

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}
	
}
