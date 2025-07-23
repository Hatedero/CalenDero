import task.DeroTaskController;
import task.DeroTaskModel;
import task.DeroTaskView;
import user.DeroUserController;
import user.DeroUserModel;
import user.DeroUserView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DeroUserModel hatedero = new DeroUserModel("Hatedero");

        DeroUserController hatederoController = new DeroUserController(hatedero);

        DeroUserView hatederoView = new DeroUserView(hatedero, hatederoController);

        System.out.println(hatederoView.askData());

        hatederoView.changeName("ExaT- Hatedero");



        DeroTaskModel taskOne = new DeroTaskModel("Birthday", "it's X's Birthday");

        DeroTaskController taskOneController = new DeroTaskController(taskOne);

        DeroTaskView taskOneView = new DeroTaskView(taskOne, taskOneController);

        System.out.println(taskOneView.askData());

        taskOneView.changeTitle("X's Birthday");
        taskOneView.changeDescription("Remember his birthday");
        taskOneView.validate();

    }
}