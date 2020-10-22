package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button question = new Button("Joke");
        Button answer = new Button("Answer");
        Button explan = new Button("Explanation");

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(20, 20, 20, 20));
        hBox.getChildren().addAll(question, answer, explan);


        BorderPane layout = new BorderPane();
        layout.setTop(hBox);

        StackPane qLayout = createView("What do you call a bear with no teeth?");
        StackPane aLayout = createView("A gummy bear.");
        StackPane eLayout = createView("Blah bhcedvhco rewjvh revvbvbovb.");

        layout.setCenter(qLayout);

        question.setOnAction(actionEvent -> layout.setCenter(qLayout));
        answer.setOnAction(actionEvent -> layout.setCenter(aLayout));
        explan.setOnAction(actionEvent -> layout.setCenter(eLayout));

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public StackPane createView(String text){
        StackPane sp = new StackPane();
        sp.getChildren().add(new Label(text));
        sp.setPrefSize(300, 200);
        sp.setAlignment(Pos.CENTER);
        return sp;
    }
}

