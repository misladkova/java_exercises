package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class NotifierApplication extends Application {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();

        button.setOnAction(actionEvent -> label.setText(textField.getText()));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField, button, label);

        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }
}



