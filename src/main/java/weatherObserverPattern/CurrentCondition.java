package main.java.weatherObserverPattern;

public class CurrentCondition implements Display, UpdateObserve {
	
	private float temperature;
	private float humidity;
	
	//The constructor is passed the weatherData and we use it to register the display as an observer.
	public CurrentCondition(WeatherData weatherData) {
		weatherData.registerObserver(this);
	}
	
	// override from UpdateObserve to save value and call display method.
	@Override
	public void update(float temp, float humidity, float pressure) {
		temperature = temp;
		this.humidity = humidity;
		display();

	}

	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature  + " F degrees and " + humidity + " % humidity");

	}

}
