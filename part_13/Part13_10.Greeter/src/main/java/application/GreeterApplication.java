package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
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

        Label greeting = new Label();
        StackPane sp = new StackPane();
        sp.getChildren().add(greeting);
        sp.setAlignment(Pos.CENTER);
        sp.setPrefSize(300, 200);

        Scene scene1 = new Scene(gp);
        Scene scene2 = new Scene(sp);

        start.setOnAction(actionEvent -> {
            greeting.setText("Welcome "+password.getText()+"!");
            stage.setScene(scene2);
        });

        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println("Hello world! :3");

        launch(GreeterApplication.class);
    }
}

