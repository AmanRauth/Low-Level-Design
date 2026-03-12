package ObserverPattern.Observables;

import ObserverPattern.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WSObservableImpl implements Observable{
    List<Observer>observers=new ArrayList<>();
    int currentTemperature;
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    @Override
    public void setObservers(int data) {
        currentTemperature=data;
        notifyObservers();
    }

    @Override
    public int getData(){
         return currentTemperature;
    }
}
