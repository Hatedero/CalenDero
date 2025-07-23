package task;

public class DeroTaskController {
    private DeroTaskModel model;

    public DeroTaskController(DeroTaskModel model) {
        this.model = model;
    }

    public void changeTitle(String title) {
        this.model.setTitle(title);
    }

    public void changeDescription(String description) {
        this.model.setDescription(description);
    }

    public void validate() {
        this.model.setCompleted(true);
    }
}
