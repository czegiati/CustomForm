import Forms.MyRadioFormOption;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;


public class main extends Application {
    public void start(Stage stage) throws Exception {

       new Button();

        stage.setWidth(300);
        stage.setHeight(500);
       //MyRadioFormOption o=new MyRadioFormOption();
        Group g=new Group();
        Scene scene=new Scene(g);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
