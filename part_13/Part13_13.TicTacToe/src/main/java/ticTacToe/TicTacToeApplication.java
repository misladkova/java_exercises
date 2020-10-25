package ticTacToe;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {

    private String player;

    public TicTacToeApplication(){
        this.player = "X";
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label turn = new Label("Turn: "+player);
        //Button b = new Button(" ");
        //b.setFont(Font.font("Monospaced", 40));

        BorderPane bp = new BorderPane();
        bp.setTop(turn);


        GridPane gp = new GridPane();
        gp.setVgap(10);
        gp.setHgap(10);
        //gp.add(new Button(" "), 0, 0);
        for(int row = 0; row<3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 30));
                gp.add(button, row, col);
            }
        }

        bp.setCenter(gp);

        Scene scene = new Scene(bp);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(TicTacToeApplication.class);
    }

}
