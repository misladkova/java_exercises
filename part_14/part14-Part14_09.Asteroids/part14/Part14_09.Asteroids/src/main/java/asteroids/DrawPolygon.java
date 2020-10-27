package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public abstract class DrawPolygon {

    private Polygon shape;
    private Point2D location;

    public DrawPolygon(Polygon shape, int x, int y){
        this.shape = shape;
        this.shape.setFill(Color.BLACK);
        this.shape.setTranslateX(x);
        this.shape.setTranslateY(y);
        this.location = new Point2D(x, y);
    }

    public void turnRight(){
        shape.setRotate(shape.getRotate()+5);
    }

    public void turnLeft(){
        shape.setRotate(shape.getRotate()-5);
    }
}
