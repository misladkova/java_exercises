package ticTacToe;


import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {

    private String player;
    private boolean boo;
    private GridPane gp;

    public TicTacToeApplication() {
        this.player = "X";
        this.boo = false;
        this.gp = new GridPane();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label turn = new Label("Turn: " + player());

        BorderPane bp = new BorderPane();
        bp.setTop(turn);

        gp.setVgap(10);
        gp.setHgap(10);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 30));
                gp.add(button, row, col);
                button.setOnAction(actionEvent -> {
                    if (button.getText().equals(" ")) {
                        button.setText(player());
                        boo = !boo;
                    }
                    boolean isOver = endOfGame();
                    if (isOver == true) {
                        turn.setText("The end!");
                        for (Node b : gp.getChildren()) {
                            b.setDisable(true);
                        }
                    } else {
                        turn.setText("Turn: " + player());
                    }
                });
            }
        }

        bp.setCenter(gp);

        Scene scene = new Scene(bp);
        stage.setScene(scene);
        stage.show();
    }

    public boolean whichPlayer() {
        return boo;
    }

    public String player() {
        if (boo == false) {
            player = "X";
        } else {
            player = "O";
        }
        return player;
    }

    public boolean checkRow(int row) {
        Button a = (Button) getNode(row, 0);
        Button b = (Button) getNode(row, 1);
        Button c = (Button) getNode(row, 2);
        if ((a.getText().equals(b.getText()) && b.getText().equals(c.getText()))&&(!(a.getText().equals(" ")))) {
            return true;
        }
        return false;
    }


    public boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            boolean a = checkRow(i);
            if (a) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCol(int col) {
        Button a = (Button) getNode(0, col);
        Button b = (Button) getNode(1, col);
        Button c = (Button) getNode(2, col);
        if ((a.getText().equals(b.getText()) && b.getText().equals(c.getText()))&&(!(a.getText().equals(" ")))) {
            return true;
        }
        return false;
    }

    public boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            boolean a = checkCol(i);
            if (a) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalR() {
        Button a = (Button) getNode(0, 2);
        Button b = (Button) getNode(1, 1);
        Button c = (Button) getNode(2, 0);
        if ((a.getText().equals(b.getText()) && b.getText().equals(c.getText()))&&(!(a.getText().equals(" ")))) {

            return true;
        }
        return false;
    }

    public boolean checkDiagonalL() {
        Button a = (Button) getNode(0, 0);
        Button b = (Button) getNode(1, 1);
        Button c = (Button) getNode(2, 2);
        if ((a.getText().equals(b.getText()) && b.getText().equals(c.getText()))&&(!(a.getText().equals(" ")))) {

            return true;
        }
        return false;
    }

    public boolean endOfGame() {
        boolean a = checkRows();
        boolean b = checkColumns();
        boolean c = checkDiagonalR();
        boolean d = checkDiagonalL();
        if (a || b || c || d) {
            return true;
        }
        return false;
    }

    public Node getNode(int x, int y) {
        for (Node node : gp.getChildren()) {
            if (GridPane.getColumnIndex(node) == y && GridPane.getRowIndex(node) == x) {
                return node;
            }
        }
        return new Button(" ");
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(TicTacToeApplication.class);
    }
}
