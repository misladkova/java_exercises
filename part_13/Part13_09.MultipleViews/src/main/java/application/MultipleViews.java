package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label first = new Label("First view!");
        Button button = new Button("To the second view!");

        BorderPane bp = new BorderPane();
        bp.setTop(first);
        bp.setCenter(button);

        Button b = new Button("To the third view!");
        Label second = new Label("Second view!");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(b, second);

        Button but = new Button("To the first view!");

        GridPane gp = new GridPane();
        gp.add(new Label("Third view!"), 0, 0);
        gp.add(but, 1, 1);

        Scene scene1 = new Scene(bp);
        Scene scene2 = new Scene(vBox);
        Scene scene3 = new Scene(gp);

        button.setOnAction(actionEvent -> stage.setScene(scene2));
        b.setOnAction(actionEvent -> stage.setScene(scene3));
        but.setOnAction(actionEvent -> stage.setScene(scene1));

        stage.setScene(scene1);
        stage.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        launch(MultipleViews.class);
    }

}


