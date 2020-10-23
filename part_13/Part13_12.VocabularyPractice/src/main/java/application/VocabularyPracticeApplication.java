package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class VocabularyPracticeApplication extends Application {


    public static void main(String[] args) {

        launch(VocabularyPracticeApplication.class);
    }

    private Dictionary dictionary;

    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button enter = new Button("Enter");
        Button practice = new Button("Practice");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(enter, practice);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(15, 15, 15, 15));

        BorderPane bp = new BorderPane();
        bp.setTop(hBox);

        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);

        enter.setOnAction(actionEvent -> bp.setCenter(inputView.getView()));
        practice.setOnAction(actionEvent -> bp.setCenter(practiceView.getView()));

        bp.setCenter(inputView.getView());

        Scene scene = new Scene(bp);
        stage.setScene(scene);
        stage.show();
    }
}
