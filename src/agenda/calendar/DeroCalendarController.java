package agenda.calendar;

import agenda.day.DeroDayModel;
import task.DeroTaskModel;

import java.util.List;

public class DeroCalendarController {
    private DeroCalendarModel model;

    public Boolean addDay(DeroDayModel day) {
        this.model.getDays().add(day);
        return true;
    }

    public Boolean addDays(List<DeroDayModel> days) {
        days.forEach(day ->
                addDay(day));
        return true;
    }

    public Boolean addTask(DeroTaskModel task, DeroDayModel day) {
        if(this.model.getDays().contains(day)) {
            //this.model.getDays().get(this.model.getDays().indexOf(day)).addTask(task);
            return true;
        }
        return false;
    }
}
