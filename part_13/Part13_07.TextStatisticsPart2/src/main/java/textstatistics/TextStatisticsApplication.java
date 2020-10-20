package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(TextStatisticsApplication.class);
    }


    @Override
    public void start(Stage stage) throws Exception {

        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea("");

        layout.setCenter(textArea);

        Label l1 = new Label("Letters: ");
        Label l2 = new Label("Words: ");
        Label l3 = new Label("The longest word is: ");

        textArea.textProperty().addListener((change, oldValue, newValue)->{
            int chars = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            String a = "Letters: " +chars;
            l1.setText(a);
            String b = "Words: " +words;
            l2.setText(b);
            String c = "The longest word is: "+longestWord;
            l3.setText(c);
                });

        HBox hb = new HBox();
        hb.setSpacing(10);
        hb.getChildren().add(l1);
        hb.getChildren().add(l2);
        hb.getChildren().add(l3);

        layout.setBottom(hb);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();

    }
}



