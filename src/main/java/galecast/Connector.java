package galecast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import galecast.data.CurrentWeather;
import galecast.data.MeasurementSystem;

public class Connector {
    private final String apiWeatherCall = "http://api.openweathermap.org/data/2.5/weather?";
    private String apiKey;
    
    private ObjectMapper mapper;
            
    public Connector() {
        this(GaleCast._API_KEY);
    }
    
    public Connector(String key) {
        mapper = new ObjectMapper();
        apiKey = key;
    }
    
    public CurrentWeather getCurrentWeatherByCity(String city, MeasurementSystem option) {
        String apiCall = apiWeatherCall + "q=" + city + "&units=" + option.toString();
        return getCurrentWeather(apiCall);
    }
    
    public CurrentWeather getCurrentWeather(String apiCall) {
    	// In case of an error, the method will return an empty object without crashing application.
        CurrentWeather result = new CurrentWeather();        
        try {
            result = mapper.readValue(new URL(apiCall + "&appid=" + apiKey), CurrentWeather.class);
            return result;
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Connector: City wasn't not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
