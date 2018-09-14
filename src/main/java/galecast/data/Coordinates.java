package galecast.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinates {
    
    @JsonProperty(JsonVariables._LONGITUDE)
    private double longitude;
    @JsonProperty(JsonVariables._LATITUDE)
    private double latitude;
    
    public Coordinates() {
        longitude = 0;
        latitude  = 0;
    }
    
    @JsonProperty(JsonVariables._LONGITUDE)
    public double getLongitude() {
        return longitude;
    }
    
    @JsonProperty(JsonVariables._LONGITUDE)
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    @JsonProperty(JsonVariables._LATITUDE)
    public double getLatitude() {
        return latitude;
    }
    
    @JsonProperty(JsonVariables._LATITUDE)
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public String toString() {
        String result = "\nCoordinates" +
                        "\nLongitude: " + longitude +
                        "\nLatitude: "  + latitude;
        return result;
    }
}
