package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {

    private Dictionary dictionary;

    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public Parent getView(){

        Label wordText = new Label("Word");
        Label translationText = new Label("Translation");
        TextField wordField = new TextField();
        TextField translationField = new TextField();
        Button b = new Button("Add the word pair");

        GridPane gp = new GridPane();
        gp.add(wordText, 0, 0);
        gp.add(wordField, 0, 1);
        gp.add(translationText, 0, 2);
        gp.add(translationField, 0, 3);

        gp.setPrefSize(400, 300);
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(10, 10, 10, 10));

        b.setOnAction(actionEvent -> {
                String word = wordField.getText();
                String translation = translationField.getText();
                dictionary.addTranslation(word, translation);
                wordField.clear();
                translationField.clear();
        });
        return gp;
    }
}
