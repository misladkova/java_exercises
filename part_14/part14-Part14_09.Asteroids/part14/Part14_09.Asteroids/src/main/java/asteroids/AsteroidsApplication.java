package asteroids;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        SpaceShip ship = new SpaceShip(0, 0);

        Pane pane = new Pane();
        pane.setPrefSize(600, 500);
        pane.getChildren().add(ship.getShape());

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Asteroids!");
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        launch(AsteroidsApplication.class);
    }

    public static int partsCompleted() {
        return 1;
    }

}
