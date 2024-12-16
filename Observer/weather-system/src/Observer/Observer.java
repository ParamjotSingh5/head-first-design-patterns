package Observer;

public interface Observer {

    public void unsubscribe();

    public void update(float temp, float humidity, float pressure);
    // These are the state values that the observer gets from the subject when a weather measurement changes
}
