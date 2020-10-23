package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary){
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }

    public Parent getView(){

        Label askTranslation = new Label("Translate the word '" +word+ "'");
        TextField translation = new TextField();
        Button check = new Button("Check");

        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setPrefSize(400, 300);
        gp.setHgap(10);
        gp.setVgap(10);

        gp.add(askTranslation, 0, 0);
        gp.add(translation, 0, 1);
        gp.add(check, 0, 2);

        Label result = new Label();
        gp.add(result, 0, 3);

        check.setOnAction(actionEvent -> {
            if(dictionary.getTranslation(word).equals(translation.getText())){
                result.setText("Correct!");
            }else {
                result.setText("Incorrect! The translation of the word '" + word +"' is '" +
                        dictionary.getTranslation(word) + "'.");
            }
            word = dictionary.getRandomWord();
            askTranslation.setText("Translate the word '" +word+ "'");
            translation.clear();
        });
        return gp;
    }
}
