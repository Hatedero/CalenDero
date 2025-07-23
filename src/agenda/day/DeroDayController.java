package agenda.day;

import task.DeroTaskModel;

import java.util.Collections;
import java.util.List;

public class DeroDayController {
    private String title;
    private String date;
    private List<DeroTaskModel> tasks;

    public DeroDayController(String title, String date, List<DeroTaskModel> tasks) {
        this.title = title;
        this.date = date;
        this.tasks = tasks;
    }

    public DeroDayController(String title, String date) {
        this.title = title;
        this.date = date;
        this.tasks = Collections.emptyList();
    }

    public Boolean addTask(DeroTaskModel task) {
        this.tasks.add(task);
        return true;
    }

    public Boolean addTasks(List<DeroTaskModel> tasks) {
        tasks.forEach(task ->
                addTask(task));
        return true;
    }
}
