package galecast;

import galecast.data.CurrentWeather;
import galecast.data.MeasurementSystem;

public class GaleCast {
    private String                     lastCity;
    private Connector                 connector;
    private CurrentWeather       currentWeather;
    private MeasurementSystem measurementSystem;
    final static String _API_KEY = "c9206607eabb6c9cdd2db256ea1fc7eb";
    
    public GaleCast() {
        lastCity          = "Gothenburg";
        currentWeather    = new CurrentWeather();
        connector         = new Connector();
        measurementSystem = MeasurementSystem.METRIC;
    }
    
    public CurrentWeather getCurrentWeather() {
    	return currentWeather;
    }
    
    public void updateCurrentWeather() {
    	currentWeather = getNewWeatherFrom(lastCity);
    }
    
    public CurrentWeather getNewWeatherFrom(String city) {
    	lastCity = city;
    	currentWeather = connector.getCurrentWeatherByCity(city, measurementSystem);
    	return currentWeather;
    }
}
