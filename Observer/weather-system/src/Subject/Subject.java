package Subject;

import Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // These are the methods the WeatherData object uses to register, remove observers.

    public void notifyObservers();
    // This method is called to notify all observers when the Subject's state has changed
}
