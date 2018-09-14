package galecast.data;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Weather {
    @JsonProperty(JsonVariables._WEATHER_ID)
    private int id;
    @JsonProperty(JsonVariables._WEATHER_STATUS)
    private String type;
    @JsonProperty(JsonVariables._WEATHER_DESCRIPTION)
    private String description;
    @JsonProperty(JsonVariables._WEATHER_ICON)
    private String iconId;
    
    public Weather() {
        id          =   0;
        type        = "-";
        description = "-";
        iconId      = "-";
    }
    
    @JsonGetter(JsonVariables._WEATHER_ID)
    public int getId() {
        return id;
    }

    @JsonGetter(JsonVariables._WEATHER_STATUS)
    public String getType() {
        return type;
    }
    
    @JsonGetter(JsonVariables._WEATHER_DESCRIPTION)
    public String getDescription() {
        return description;
    }
    
    @JsonGetter(JsonVariables._WEATHER_ICON)
    public String getIconId() {
        return iconId;
    }
    
    @JsonSetter(JsonVariables._WEATHER_ID)
    public void setId(int id) {
        this.id = id;
    }
    
    @JsonSetter(JsonVariables._WEATHER_STATUS)
    public void setType(String type) {
        this.type = type;
    }
    
    
    @JsonSetter(JsonVariables._WEATHER_DESCRIPTION)
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    @JsonSetter(JsonVariables._WEATHER_ICON)
    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    public String toString() {
        String result = "\nWeather"  +
                        "\nID: "          + id +
                        "\nStatus: "      + type +
                        "\nDescription: " + description +
                        "\nIcon code: "   + iconId;
        return result;
    }
}
