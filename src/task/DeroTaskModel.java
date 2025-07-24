package task;

import observer.Observable;

public class DeroTaskModel extends Observable {
    protected String title;
    protected String description;
    protected Boolean completed;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyObservers();
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
        notifyObservers();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyObservers();
    }

    public DeroTaskModel(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }
}
