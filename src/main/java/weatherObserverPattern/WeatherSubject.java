package main.java.weatherObserverPattern;

public interface WeatherSubject {
	
	public void registerObserver (UpdateObserve uo);
	public void removeObserver (UpdateObserve uo);
	public void notifyObserver ();

}
