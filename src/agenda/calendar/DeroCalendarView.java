package agenda.calendar;

import observer.Observer;

public class DeroCalendarView implements Observer {
    private DeroCalendarModel model;
    private DeroCalendarController controller;

    public String askData() {
        String data = model.getTitle() + "\n\n" + model.getDescription()
                + "\n";
        for(int i = 0; i < model.getDays().size(); i++)
            data = data + "\n" + model.getDays().get(i).toString();
        return data;
    }

    @Override
    public void update() {
        System.out.println(askData());
    }
}
