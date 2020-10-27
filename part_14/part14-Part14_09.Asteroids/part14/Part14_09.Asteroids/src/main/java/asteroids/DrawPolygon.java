package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public abstract class DrawPolygon {

    private Polygon shape;
    private Point2D location;

    public DrawPolygon(Polygon shape, int x, int y){
        this.shape = shape;
        this.shape.setFill(Color.BLACK);
        this.shape.setTranslateX(x);
        this.shape.setTranslateY(y);
        this.location = new Point2D(0, 0);
    }

    public Polygon getShape(){
        return shape;
    }

    public void turnRight(){
        shape.setRotate(shape.getRotate()+5);
    }

    public void turnLeft(){
        shape.setRotate(shape.getRotate()-5);
    }

    public void move(){
        shape.setTranslateX(shape.getTranslateX()+location.getX());
        shape.setTranslateY(shape.getTranslateY()+location.getY());
        if(shape.getTranslateX()<0){
            shape.setTranslateX(shape.getTranslateX()+AsteroidsApplication.WIDTH);
        }
        if(shape.getTranslateX()>AsteroidsApplication.WIDTH){
            shape.setTranslateX(shape.getTranslateX()%AsteroidsApplication.WIDTH);
        }
        if(shape.getTranslateY()<0){
            shape.setTranslateY(shape.getTranslateY()+AsteroidsApplication.HEIGHT);
        }
        if(shape.getTranslateY()>AsteroidsApplication.HEIGHT){
            shape.setTranslateY(shape.getTranslateY()%AsteroidsApplication.HEIGHT);
        }
    }

    public void accelerate(){
        double changeX = Math.cos(Math.toRadians(shape.getRotate()));
        double changeY = Math.sin(Math.toRadians(shape.getRotate()));
        location = location.add((-changeX)*0.01, (-changeY)*0.01);
    }

    public boolean collide(Polygon s){
        Shape collision = Shape.intersect(shape, s);
        return collision.getBoundsInLocal().getWidth() != -1;
    }
}
