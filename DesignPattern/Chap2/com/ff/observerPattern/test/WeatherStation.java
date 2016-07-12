package com.ff.observerPattern.test;

import com.ff.observerPattern.CurrentConditionsDisplay;
import com.ff.observerPattern.StatisticsDisplay;
import com.ff.observerPattern.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 92.4f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
