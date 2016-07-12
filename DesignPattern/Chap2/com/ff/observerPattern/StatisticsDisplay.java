package com.ff.observerPattern;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {

	private ArrayList<Float> tempsArray;
	private Subject weatherData;
	private float maxTemp;
	private float minTemp;
	private float avgTemp;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.tempsArray = new ArrayList<Float>();
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Max Temperature: " + this.maxTemp + "|Min Temperature: " + minTemp + "|Avg Temperature: " + avgTemp);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.tempsArray.add(temp);
		this.maxTemp = findMax(this.tempsArray);
		this.minTemp = findMin(this.tempsArray);
		this.avgTemp = findAvg(this.tempsArray);
		display();// redesign in MVC pattern
	}

	private static float findMax(ArrayList<Float> tempsArray){
		if (tempsArray != null){
			float max = tempsArray.get(0);
			
			for(float temp : tempsArray){
				if(temp > max){
					max = temp;
				}
			}
			
			return max;
		} else {
			throw new NullPointerException("No available temperature records");
		}
	}
	
	private static float findMin(ArrayList<Float> tempsArray){
		if (tempsArray != null){
			float min = tempsArray.get(0);
			
			for(float temp : tempsArray){
				if(temp < min){
					min = temp;
				}
			}
			
			return min;
		} else {
			throw new NullPointerException("No available temperature records");
		}
	}
	
	private static float findAvg(ArrayList<Float> tempsArray){
		if (tempsArray != null){
			float total = 0;
			
			for(float temp : tempsArray){
				total += temp;
			}
			
			return total/tempsArray.size();
		} else {
			throw new NullPointerException("No available temperature records");
		}
	}
}
