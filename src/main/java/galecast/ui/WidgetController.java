package galecast.ui;

import galecast.GaleCast;
import galecast.data.CurrentWeather;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class WidgetController {
	private GaleCast galeCast = new GaleCast();
	
	@FXML 
	private TextField cityInput;
	@FXML 
	private Label temperatureLabel;
	@FXML 
	private Label locationLabel;
	@FXML 
	private Label windSpeedLabel;
	@FXML 
	private Label humidityLabel;
	@FXML 
	private Label cloudinessLabel;
	@FXML 
	private Label weatherTypeLabel;
	@FXML
	private ImageView weatherIconView;
	@FXML
	private ImageView closeIconView;
	@FXML
	private ImageView refreshIconView;
	

	
	@FXML
	public void initialize() {
		String defaultCity = "Gothenburg";
		getWeatherFrom(defaultCity);
		closeIconView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

		     @Override
		     public void handle(MouseEvent event) {
		         System.exit(0);
		         event.consume();
		     }
		});
		
		refreshIconView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

		     @Override
		     public void handle(MouseEvent event) {
		    	 getWeatherUpdate();
		         event.consume();
		     }
		});
	}
	
	@FXML
	public void onEnter(ActionEvent ae) {
		String targetCity = cityInput.getText();
		getWeatherFrom(targetCity);
		cityInput.clear();
	}
	
	@FXML
	public void onMouseClicked(ActionEvent ae) {
		System.out.println(ae.toString());
	}
	
	public void getWeatherUpdate() {
        galeCast.updateCurrentWeather();
        CurrentWeather result = galeCast.getCurrentWeather();
        setInterfaceElements(result);
	}
	
	public void getWeatherFrom(String targetCity) {
		CurrentWeather result = galeCast.getNewWeatherFrom(targetCity);
		setInterfaceElements(result);
	}
	
	public void setInterfaceElements(CurrentWeather currentWeather) {
		String city        = currentWeather.getCityName();
		String countryCode = currentWeather.getStationData().getCountryCode();
		String weatherType = currentWeather.getWeatherData().getType();
		int    temperature = currentWeather.getAtmosphericData().getTemperature();
		int    humidity    = currentWeather.getAtmosphericData().getHumidity();
		int    cloudiness  = currentWeather.getCloudsData().getCloudiness();
		double windSpeed   = currentWeather.getWindData().getSpeed();
		Image icon;
		try {
			String currentIcon = "http://openweathermap.org/img/w/" + currentWeather.getWeatherData().getIconId() + ".png";
			icon = new Image(currentIcon);
			weatherIconView.setImage(icon);
		} catch (Exception e) {
			icon = new Image("@assets/noConnection.png");
			weatherIconView.setImage(icon);
			e.printStackTrace();
		}

		cloudinessLabel .setText(String.valueOf(humidity) + "%");
		humidityLabel   .setText(String.valueOf(cloudiness) + "%");
		locationLabel   .setText(city + ", " + countryCode);	
		temperatureLabel.setText(temperature + "°");
		weatherTypeLabel.setText(weatherType);
		windSpeedLabel  .setText(String.valueOf(windSpeed));
	}
	
}
