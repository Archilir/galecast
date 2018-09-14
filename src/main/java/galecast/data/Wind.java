package galecast.data;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Wind {
    @JsonProperty(JsonVariables._WIND_SPEED)
    private double speed;  
    @JsonProperty(JsonVariables._WIND_DIRECTION)
    private int    direction;
    
    public Wind() {
        speed     = 0;
        direction = 0;
    }
    
    @JsonGetter(JsonVariables._WIND_SPEED)
    public double getSpeed() {
        return speed;
    }
    
    @JsonGetter(JsonVariables._WIND_DIRECTION)
    public int getDirection() {
        return direction;
    }
    
    @JsonSetter(JsonVariables._WIND_SPEED)
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    @JsonSetter(JsonVariables._WIND_DIRECTION)
    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    public String toString() {
        String result = "\nWind"  +
                        "\nSpeed: " + speed +
                        "\nDirection: " + direction;
        return result;
    }
}
