package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class GreeterApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label("Enter your name and start.");
        TextField password = new TextField();
        Button start = new Button("Start");

        GridPane gp = new GridPane();

        gp.add(label, 0, 0);
        gp.add(password, 0, 1);
        gp.add(start, 0, 2);
        gp.setPrefSize(300, 200);
        gp.setAlignment(Pos.CENTER);
        GridPane.setHalignment(start, HPos.CENTER);
        GridPane.setHalignment(label, HPos.CENTER);
        GridPane.setHalignment(password, HPos.CENTER);
        gp.setVgap(10);

        Label greeting = new Label("Welcome"+password.getText()+"!");
        StackPane sp = new StackPane();
        sp.getChildren().add(greeting);
        sp.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(gp);
        Scene scene2 = new Scene(sp);

        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println("Hello world! :3");

        launch(GreeterApplication.class);
    }
}

//    In the exercise template there is a class called GreeterApplication. Create in it an application with two views.
//        The first view should have a text field that's used to ask for the user's name.
//        The second view then shows the user a greeting text.
//        The greeting should be of the form "Welcome name!" where the user's name is inserted in place of 'name'.
