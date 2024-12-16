import Observer.CurrentConditionObserver;
import Subject.WeatherORamaSubject;
import Observer.TemperatureStatisticsObserver;

public class Main {
    public static void main(String[] args) {

        WeatherORamaSubject weatherData = new WeatherORamaSubject();

        CurrentConditionObserver currentConditionObserver = new CurrentConditionObserver(weatherData);
        TemperatureStatisticsObserver temperatureStatisticsObserver = new TemperatureStatisticsObserver(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        currentConditionObserver.unsubscribe();

        weatherData.setMeasurements(62, 90, 28.1f);
    }
}