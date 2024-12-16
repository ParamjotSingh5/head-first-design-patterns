package Observer;

import Display.DisplayElement;
import Subject.Subject;

public class TemperatureStatisticsObserver implements Observer, DisplayElement {
    private float temperature;
    private final Subject weatherData;

    public TemperatureStatisticsObserver(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void unsubscribe() {
        weatherData.removeObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Temperature statistics: Average temp: " + temperature + " min temp: " + ( temperature - 10 ) + " max temp: " + ( temperature + 10));
    }
}
