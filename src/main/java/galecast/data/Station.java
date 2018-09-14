package galecast.data;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Station {
    @JsonProperty(JsonVariables._STATION_TYPE)
    private int type;
    @JsonProperty(JsonVariables._STATION_ID)
    private String id;
    @JsonProperty(JsonVariables._STATION_MESSAGE)
    private double message;
    @JsonProperty(JsonVariables._STATION_COUNTRY)
    private String country;
    @JsonProperty(JsonVariables._STATION_SUNRISE)
    private long sunriseTime;
    @JsonProperty(JsonVariables._STATION_SUNSET)
    private long sunsetTime;
    
    public Station() {
        type        =   0;
        id          = "-";
        message     =   0;
        country     = "-";
        sunriseTime =   0;
        sunsetTime  =   0;
    }
    
    @JsonGetter(JsonVariables._STATION_TYPE)
    public int getType() {
        return type;
    }
    
    @JsonSetter(JsonVariables._STATION_TYPE)
    public void setType(int type) {
        this.type = type;
    }
    
    @JsonGetter(JsonVariables._STATION_ID)
    public String getId() {
        return id;
    }
    
    @JsonSetter(JsonVariables._STATION_ID)
    public void setId(String id) {
        this.id = id;
    }
    
    @JsonGetter(JsonVariables._STATION_MESSAGE)
    public double getMessageCode() {
        return message;
    }
    
    @JsonSetter(JsonVariables._STATION_MESSAGE)
    public void setMessageCode(double message) {
        this.message = message;
    }
    
    @JsonGetter(JsonVariables._STATION_COUNTRY)
    public String getCountryCode() {
        return country;
    }
    
    @JsonSetter(JsonVariables._STATION_COUNTRY)
    public void setCountryCode(String country) {
        this.country = country;
    }
    
    @JsonGetter(JsonVariables._STATION_SUNRISE)
    public long getSunriseTime() {
        return sunriseTime;
    }
    
    @JsonSetter(JsonVariables._STATION_SUNRISE)
    public void setSunriseTime(long sunriseTime) {
        this.sunriseTime = sunriseTime;
    }
    
    @JsonGetter(JsonVariables._STATION_SUNSET)
    public long getSunsetTime() {
        return sunsetTime;
    }
    
    @JsonSetter(JsonVariables._STATION_SUNSET)
    public void setSunsetTime(long sunsetTime) {
        this.sunsetTime = sunsetTime;
    }
    
    public String toString() {
        String result = "\nStation"  +
                        "\nType: "         + type +
                        "\nID: "           + id +
                        "\nMessage code: " + message +
                        "\nCountry code: " + country +
                        "\nSunrise time: " + sunriseTime +
                        "\nSunset time: "  + sunsetTime;
        return result;
    }
}
