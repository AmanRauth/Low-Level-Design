package ObserverPattern.Observables;

import ObserverPattern.Observers.Observer;

import java.util.ArrayDeque;
import java.util.ArrayList;

public interface Observable {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    void setObservers(int data);
    int getData();
}
