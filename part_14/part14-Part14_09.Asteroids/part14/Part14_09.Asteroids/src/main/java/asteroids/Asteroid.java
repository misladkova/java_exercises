package asteroids;

import javafx.scene.shape.Polygon;

public class Asteroid extends DrawPolygon{

    public Asteroid(int x, int y){
        super(new Polygon(100, 100, 200, 100, 200, 200, 100, 200), x, y);
    }
}
