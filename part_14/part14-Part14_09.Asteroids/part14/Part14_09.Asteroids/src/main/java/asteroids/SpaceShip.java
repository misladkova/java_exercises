package asteroids;

import javafx.scene.shape.Polygon;

public class SpaceShip extends DrawPolygon{

    public SpaceShip(int x, int y){
        super(new Polygon(250, 250, 250, 260, 230, 255), x, y);
    }

}
