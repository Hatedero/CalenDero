package Observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if(this.observers.contains(observer))
            this.observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update();
        });
    }
}