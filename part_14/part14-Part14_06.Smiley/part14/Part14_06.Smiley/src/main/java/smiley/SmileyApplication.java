package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Canvas c = new Canvas(400, 400);
        GraphicsContext gc = c.getGraphicsContext2D();

        BorderPane bp = new BorderPane();
        bp.setCenter(c);

        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 400, 400);

        gc.setFill(Color.BLACK);
        gc.fillRect(100, 50, 50, 50);
        gc.fillRect(250, 50, 50, 50);
        for(int i = 100; i<=250; i+=50){
            gc.fillRect(i, 250, 50, 50);
        }
        gc.fillRect(50, 200, 50, 50);
        gc.fillRect(300, 200, 50, 50);

        Scene scene = new Scene(bp);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(SmileyApplication.class);
    }

}

