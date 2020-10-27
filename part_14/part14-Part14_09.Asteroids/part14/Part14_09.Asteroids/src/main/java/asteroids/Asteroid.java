package asteroids;

import java.util.Random;

public class Asteroid extends DrawPolygon{

    private double rotation;

    public Asteroid(int x, int y) {
        super(new Pentagon().createPentagon(), x, y);

        Random r = new Random();
        super.getShape().setRotate(r.nextInt(360));
        int acceleration = 1+r.nextInt(5);
        for (int i=0; i<acceleration; i++){
            accelerate();
        }
        rotation = 0.5-r.nextDouble();
    }

    public void move() {
        super.move();
        super.getShape().setRotate(super.getShape().getRotate() + rotation);
    }
}
