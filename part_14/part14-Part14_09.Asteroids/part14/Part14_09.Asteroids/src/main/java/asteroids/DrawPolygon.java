package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public abstract class DrawPolygon {

    private Polygon shape;
    private Point2D location;
    private boolean alive;

    public DrawPolygon(Polygon shape, int x, int y){
        this.shape = shape;
        this.shape.setFill(Color.BLACK);
        this.shape.setTranslateX(x);
        this.shape.setTranslateY(y);
        this.location = new Point2D(0, 0);
        this.alive = true;
    }

    public Polygon getShape(){
        return shape;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public Point2D getLocation(){
        return location;
    }

    public void setAlive(boolean alive1){
        alive = alive1;
    }

    public boolean isAlive(){
        return alive;
    }

    public void turnRight(){
        shape.setRotate(shape.getRotate()+3);
    }

    public void turnLeft(){
        shape.setRotate(shape.getRotate()-3);
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
        shape.setTranslateX(shape.getTranslateX()+location.getX());
        shape.setTranslateY(shape.getTranslateY()+location.getY());
    }

    public void accelerate(){
        double changeX = Math.cos(Math.toRadians(shape.getRotate()));
        double changeY = Math.sin(Math.toRadians(shape.getRotate()));
        location = location.add((changeX)*0.005, (changeY)*0.005);
    }

    public boolean collide(Polygon s){
        Shape collision = Shape.intersect(shape, s);
        return collision.getBoundsInLocal().getWidth() != -1;
    }
}
