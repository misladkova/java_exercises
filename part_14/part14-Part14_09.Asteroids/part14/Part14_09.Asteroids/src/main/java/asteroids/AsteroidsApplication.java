package asteroids;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class AsteroidsApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        SpaceShip ship = new SpaceShip(0, 0);

        Pane pane = new Pane();
        pane.setPrefSize(600, 500);
        pane.getChildren().add(ship.getShape());

        Scene scene = new Scene(pane);

        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
        scene.setOnKeyPressed(keyEvent -> {
            pressedKeys.put(keyEvent.getCode(), Boolean.TRUE);
        });
        scene.setOnKeyReleased(keyEvent -> {
            pressedKeys.put(keyEvent.getCode(), Boolean.FALSE);
        });

        stage.setScene(scene);
        stage.setTitle("Asteroids!");
        stage.show();

        new AnimationTimer(){
            @Override
            public void handle(long l) {
                if (pressedKeys.getOrDefault(KeyCode.RIGHT, Boolean.FALSE)){
                    ship.turnRight();
                }
                if (pressedKeys.getOrDefault(KeyCode.LEFT, Boolean.FALSE)){
                    ship.turnLeft();
                }
                ship.move();
            }
        }.start();
    }

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        launch(AsteroidsApplication.class);
    }

    public static int partsCompleted() {
        return 1;
    }

}
