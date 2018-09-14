package galecast.data;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Atmospheric {
    
    @JsonProperty(JsonVariables._TEMPERATURE)
    private int temperature;
    @JsonProperty(JsonVariables._PRESSURE)
    private int pressure;
    @JsonProperty(JsonVariables._HUMIDITY)
    private int humidity;
    @JsonProperty(JsonVariables._MIN_TEMPERATURE)
    private int minTemperature;
    @JsonProperty(JsonVariables._MAX_TEMPERATURE)
    private int maxTemperature; 
    
    public Atmospheric() {
        temperature    = 0;
        pressure       = 0;
        humidity       = 0;
        minTemperature = 0;
        maxTemperature = 0;
    }
    
    // Getters for weather variables
    @JsonGetter(JsonVariables._TEMPERATURE)
    public int getTemperature() {
        return temperature;
    }
    
    @JsonGetter(JsonVariables._PRESSURE)
    public int getPressure() {
        return pressure;
    }
    
    @JsonGetter(JsonVariables._HUMIDITY)
    public int getHumidity() {
        return humidity;
    }
    
    @JsonGetter(JsonVariables._MIN_TEMPERATURE)
    public int getMinTemperature() {
        return minTemperature;
    }
    
    @JsonGetter(JsonVariables._MAX_TEMPERATURE)
    public int getMaxTemperature() {
        return maxTemperature;
    }
    
    // Setters for weather variables
    
    @JsonSetter(JsonVariables._TEMPERATURE)
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }    
    
    @JsonSetter(JsonVariables._PRESSURE)
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    
    @JsonSetter(JsonVariables._HUMIDITY)
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    
    @JsonSetter(JsonVariables._MIN_TEMPERATURE)
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
    
    @JsonSetter(JsonVariables._MAX_TEMPERATURE)
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
    
    public String toString() {
        String result = "\nWeather" +
                        "\nTemperature: "     + temperature +
                        "\nPressure: "        + pressure +
                        "\nHumidity: "        + humidity +
                        "\nMin Temperature: " + minTemperature +
                        "\nMax Temperature: " + maxTemperature;
        return result;
    }
}
