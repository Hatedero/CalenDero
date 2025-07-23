package agenda.calendar;

import agenda.day.DeroDayModel;

import java.util.Collections;
import java.util.List;

public class DeroCalendarModel {
    private String title;
    private String description;
    private List<DeroDayModel> days;

    public List<DeroDayModel> getDays() {
        return days;
    }

    public void setDays(List<DeroDayModel> days) {
        this.days = days;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DeroCalendarModel(String title, String description, List<DeroDayModel> days) {
        this.title = title;
        this.description = description;
        this.days = days;
    }

    public DeroCalendarModel(String title, String description) {
        this.title = title;
        this.description = description;
        this.days = Collections.emptyList();
    }


}
