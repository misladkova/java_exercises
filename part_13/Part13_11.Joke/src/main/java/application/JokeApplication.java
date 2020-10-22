package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        hBox.getChildren().addAll(question, answer, explan);

        BorderPane layout = new BorderPane();
        layout.setTop(hBox);

        Scene sceneQ = new Scene(layout);
        stage.setScene(sceneQ);
        stage.show();
    }

    public StackPane createView(String text){
        StackPane sp = new StackPane();

    }
}

//        The application offers a menu consisting of three buttons,
//        and the contents that can be changed by clicking on these buttons.
//        The first button (containing the text "Joke") shows a question that is related to a joke.
//        The second button (text "Answer") show the related answer.
//        The third and the final button ("Explanation") brings up the explanation for the joke.
//        By default (when it starts) the program should show a joke-related question.
//        Use the following string as the question: "What do you call a bear with no teeth?".
//        The answer should be "A gummy bear." You can come up with a suitable explanation by yourself.
