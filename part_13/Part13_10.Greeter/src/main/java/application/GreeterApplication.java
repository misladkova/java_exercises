package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class GreeterApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label("Enter your name and start.");
        PasswordField password = new PasswordField();
        GridPane gp = new GridPane();
        gp.getChildren().addAll(label, password);
        gp.setAlignment(Pos.CENTER);

        Label greeting = new Label("Welcome"+password.getText()+"!");
        StackPane sp = new StackPane();
        sp.getChildren().add(label);

        Scene scene1 = new Scene(gp);
        Scene scene2 = new Scene(sp);

        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world! :3");
    }
}

//    In the exercise template there is a class called GreeterApplication. Create in it an application with two views.
//        The first view should have a text field that's used to ask for the user's name.
//        The second view then shows the user a greeting text.
//        The greeting should be of the form "Welcome name!" where the user's name is inserted in place of 'name'.
