package user;

import observer.Observable;
import agenda.calendar.DeroCalendarModel;

import java.util.Collections;
import java.util.List;

public class DeroUserModel extends Observable {
    private String name;
    private List<DeroCalendarModel> calendars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public List<DeroCalendarModel> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<DeroCalendarModel> calendars) {
        this.calendars = calendars;
        notifyObservers();
    }

    public DeroUserModel(String name) {
        this.name = name;
        this.calendars = Collections.emptyList();
    }
}