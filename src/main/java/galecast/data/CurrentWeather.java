package galecast.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {
    
    @JsonProperty(JsonVariables._COORDINATES)
    private Coordinates coordinates;
    @JsonProperty(JsonVariables._WEATHER_DATA)
    private List<Weather> weather;
    @JsonProperty(JsonVariables._BASE_PARAMETER)
    private String baseType;
    @JsonProperty(JsonVariables._ATMOSPHERIC_DATA)
    private Atmospheric atmospheric;
    @JsonProperty(JsonVariables._VISIBILITY) 
    private int visibility;
    @JsonProperty(JsonVariables._WIND_DATA) 
    private Wind windData;
    @JsonProperty(JsonVariables._CLOUDS_DATA)
    private Clouds cloudsData;
    @JsonProperty(JsonVariables._TIME)
    private int utcTime;
    @JsonProperty(JsonVariables._STATION_DATA)
    private Station stationData;
    @JsonProperty(JsonVariables._CITY_ID)
    private int cityId;
    @JsonProperty(JsonVariables._CITY_NAME)
    private String cityName;
    @JsonProperty(JsonVariables._COD)
    private int cod;
    
    public CurrentWeather() {
        coordinates = new Coordinates();
        baseType    = "-";
        atmospheric = new Atmospheric();
        visibility  = 0;
        windData    = new Wind();
        cloudsData  = new Clouds();
        utcTime     = 0;
        stationData = new Station();
        cityId      = 0;
        cityName    = "-";
        cod         = 0;
    }   
    
    public Weather getWeatherData() {
        try {
            return weather.get(0);
        } catch (NullPointerException e) {
            return new Weather();
        }
    }
    
    public String toString() {
        String result = coordinates.toString()        + "\n" +
                        getWeatherData().toString()   + "\n" + 
                        "\nBase type: " + baseType    + "\n" +
                        atmospheric.toString()        + "\n" +
                        "\nVisibility: " + visibility + "\n" +
                        windData.toString()           + "\n" +
                        cloudsData.toString()         + "\n" +
                        "\nTime: "    + utcTime       + "\n" +
                        stationData.toString()        + "\n" +
                        "\nCity ID: " + cityId        + "\n" +
                        "\nCity: "    + cityName      + "\n" +
                        "\nCOD: "     + cod;
        return result;
    }
    
    
    @JsonGetter(JsonVariables._COORDINATES)
    public Coordinates getCoordinates() {
        return coordinates;
    }
    
    @JsonGetter(JsonVariables._WEATHER_DATA)
    public List<Weather> getWeatherList() {
        return weather;
    }

    @JsonGetter(JsonVariables._BASE_PARAMETER)
    public String getBaseType() {
        return baseType;
    }

    @JsonGetter(JsonVariables._ATMOSPHERIC_DATA)
    public Atmospheric getAtmosphericData() {
        return atmospheric;
    }
    
    @JsonGetter(JsonVariables._VISIBILITY)
    public int getVisibility() {
        return visibility;
    }
    
    @JsonGetter(JsonVariables._WIND_DATA)
    public Wind getWindData() {
        return windData;
    }
    
    @JsonGetter(JsonVariables._CLOUDS_DATA)
    public Clouds getCloudsData() {
        return cloudsData;
    }
 
    @JsonGetter(JsonVariables._STATION_DATA)
    public Station getStationData() {
        return stationData;
    }
    
    @JsonGetter(JsonVariables._CITY_NAME)
    public String getCityName() {
        return cityName;
    }
    
    @JsonSetter(JsonVariables._COORDINATES)
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    
    @JsonSetter(JsonVariables._WEATHER_DATA)
    public void setWeatherList(List<Weather> weather) {
        this.weather = weather;
    }
    
    @JsonSetter(JsonVariables._BASE_PARAMETER)
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }
    
    @JsonSetter(JsonVariables._ATMOSPHERIC_DATA)
    public void setAtmosphericData(Atmospheric atmospheric) {
        this.atmospheric = atmospheric;
    }
    
    @JsonSetter(JsonVariables._VISIBILITY)
    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
    
    @JsonSetter(JsonVariables._WIND_DATA)
    public void setWindData(Wind windData) {
        this.windData = windData;
    }
    
    @JsonSetter(JsonVariables._CLOUDS_DATA)
    public void setCloudsData(Clouds cloudsData) {
        this.cloudsData = cloudsData;
    }
    
    @JsonSetter(JsonVariables._STATION_DATA)
    public void setStationData(Station stationData) {
        this.stationData = stationData;
    }
    
    public void show() {
        System.out.println(this.toString());
    }
}
