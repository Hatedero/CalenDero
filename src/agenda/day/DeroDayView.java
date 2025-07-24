package agenda.day;

import observer.Observer;
import task.DeroTaskModel;

import java.util.Collections;
import java.util.List;

public class DeroDayView implements Observer {
    private DeroDayModel model;
    private DeroDayController controller;

    public String askData() {
        String data = model.getTitle() + " " + model.getDate()
                + "\n Tasks : ";
        for(int i = 0; i < model.getTasks().size(); i++)
            data = data + "\n" + model.getTasks().get(i).toString();
        return data;
    }

    @Override
    public void update() {
        System.out.println(askData());
    }
}
