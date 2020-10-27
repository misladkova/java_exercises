package asteroids;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.*;

public class AsteroidsApplication extends Application{

    public static int HEIGHT = 400;
    public static int WIDTH = 600;

    @Override
    public void start(Stage stage) throws Exception {

        SpaceShip ship = new SpaceShip(WIDTH/2, HEIGHT/2);
        List<Asteroid> asteroids = new ArrayList<>();
        for(int i = 0; i<5; i++){
            Random r = new Random();
            Asteroid asteroid = new Asteroid(r.nextInt(WIDTH/4), r.nextInt(HEIGHT/5));
            asteroids.add(asteroid);
        }

        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        pane.getChildren().add(ship.getShape());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getShape()));

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
                if(pressedKeys.getOrDefault(KeyCode.UP, Boolean.FALSE)){
                    ship.accelerate();
                }
                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                asteroids.forEach(asteroid -> {
                    if(ship.collide(asteroid.getShape())){
                        stop();
                    }
                });
            }
        }.start();
    }

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        launch(AsteroidsApplication.class);
    }

    public static int partsCompleted() {
        return 3;
    }

}
