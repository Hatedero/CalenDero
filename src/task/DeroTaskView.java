package task;

import Observer.Observer;
import user.DeroUserController;
import user.DeroUserModel;

public class DeroTaskView implements Observer {
    private DeroTaskModel model;
    private DeroTaskController controller;

    public DeroTaskView(DeroTaskModel model, DeroTaskController controller){
        this.model = model;
        this.controller = controller;
        model.addObserver(this);
    }

    public String askData() {
        return this.model.getTitle() + " : " + (this.model.getCompleted() ? "v" : "x")
        + "\n" + this.model.getDescription();
    }

    public void changeTitle(String title) {
        this.controller.changeTitle(title);
    }

    public void changeDescription(String description) {
        this.controller.changeDescription(description);
    }

    public void validate() {
        this.controller.validate();
    }

    @Override
    public void update() {
        System.out.println(askData());
    }
}
