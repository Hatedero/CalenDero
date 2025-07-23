package agenda.day;

import Observer.Observable;
import task.DeroTaskModel;

import java.util.Collections;
import java.util.List;

public class DeroDayModel extends Observable {
    private String title;
    private String date;
    private List<DeroTaskModel> tasks;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<DeroTaskModel> getTasks() {
        return tasks;
    }

    public void setTasks(List<DeroTaskModel> tasks) {
        this.tasks = tasks;
    }

    public DeroDayModel(String title, String date, List<DeroTaskModel> tasks) {
        this.title = title;
        this.date = date;
        this.tasks = tasks;
    }

    public DeroDayModel(String title, String date) {
        this.title = title;
        this.date = date;
        this.tasks = Collections.emptyList();
    }


}
