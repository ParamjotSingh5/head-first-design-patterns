package Observer;

import Display.DisplayElement;
import Subject.Subject;

public class CurrentConditionObserver implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private final Subject weatherData;

    public CurrentConditionObserver(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void unsubscribe() {
        weatherData.removeObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" + " and " + pressure + " pressure");
    }
}
