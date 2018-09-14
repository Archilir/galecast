package galecast.data;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Clouds {
    @JsonProperty(JsonVariables._CLOUDS_PERCENTAGE)
    private int cloudiness;
    
    public Clouds() {
        cloudiness = 0;
    }
    
    @JsonGetter(JsonVariables._CLOUDS_PERCENTAGE)
    public int getCloudiness() {
        return cloudiness;
    }
    
    @JsonSetter(JsonVariables._CLOUDS_PERCENTAGE)
    public void setCloudiness(int cloudiness) {
        this.cloudiness = cloudiness;
    }
    
    public String toString() {
        String result = "\nClouds" + 
                        "\nCloudiness: " + cloudiness;
        return result;
    }
}
