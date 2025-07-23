package user;

import Observer.Observer;

public class DeroUserView implements Observer {
    private DeroUserModel model;
    private DeroUserController controller;

    public DeroUserView(DeroUserModel model, DeroUserController controller) {
        this.model = model;
        this.controller = controller;
        model.addObserver(this);
    }

    public String askData() {
        return this.model.getName();
    }

    public void changeName(String name) {
        this.controller.changeUserName(name);
    }

    @Override
    public void update() {
        System.out.println(askData());
    }
}