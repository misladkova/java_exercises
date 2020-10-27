package asteroids;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class AsteroidsApplication extends Application {

    public static int HEIGHT = 400;
    public static int WIDTH = 600;

    @Override
    public void start(Stage stage) throws Exception {

        SpaceShip ship = new SpaceShip(WIDTH / 2, HEIGHT / 2);
        Text points = new Text(10, 20, "Points: ");
        List<Asteroid> asteroids = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            Asteroid asteroid = new Asteroid(r.nextInt(WIDTH / 4), r.nextInt(HEIGHT / 5));
            asteroids.add(asteroid);
        }

        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        pane.getChildren().add(ship.getShape());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getShape()));
        pane.getChildren().add(points);

        Scene scene = new Scene(pane);

        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
        scene.setOnKeyPressed(keyEvent -> {
            pressedKeys.put(keyEvent.getCode(), Boolean.TRUE);
        });
        scene.setOnKeyReleased(keyEvent -> {
            pressedKeys.put(keyEvent.getCode(), Boolean.FALSE);
        });

        List<Projectile> projectiles = new ArrayList<>();

        stage.setScene(scene);
        stage.setTitle("Asteroids!");
        stage.show();

        new AnimationTimer() {
            @Override
            public void handle(long l) {
                if (pressedKeys.getOrDefault(KeyCode.RIGHT, Boolean.FALSE)) {
                    ship.turnRight();
                }
                if (pressedKeys.getOrDefault(KeyCode.LEFT, Boolean.FALSE)) {
                    ship.turnLeft();
                }
                if (pressedKeys.getOrDefault(KeyCode.UP, Boolean.FALSE)) {
                    ship.accelerate();
                }
                if (pressedKeys.getOrDefault(KeyCode.SPACE, Boolean.FALSE) && projectiles.size() < 3) {
                    Projectile projectile = new Projectile((int) ship.getShape().getTranslateX(),
                            (int) ship.getShape().getTranslateY());
                    projectile.getShape().setRotate(ship.getShape().getRotate());
                    projectiles.add(projectile);
                    projectile.accelerate();
                    projectile.setLocation(projectile.getLocation().normalize().multiply(2));
                    pane.getChildren().add(projectile.getShape());
                }
                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                asteroids.forEach(asteroid -> {
                    if (ship.collide(asteroid.getShape())) {
                        stop();
                    }
                });
                projectiles.forEach(projectile -> projectile.move());
                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (projectile.collide(asteroid.getShape())) {
                            projectile.setAlive(false);
                            asteroid.setAlive(false);
                        }
                    });
                });
                projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .forEach(projectile -> pane.getChildren().remove(projectile.getShape()));
                projectiles.removeAll(projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .collect(Collectors.toList()));

                asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .forEach(asteroid -> pane.getChildren().remove(asteroid.getShape()));
                asteroids.removeAll(asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .collect(Collectors.toList()));
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
