package user;

public class DeroUserController {
    private DeroUserModel model;

    public DeroUserController(DeroUserModel model) {
        this.model = model;
    }

    public Boolean changeUserName(String name) {
        this.model.setName(name);
        return true;
    }
}
