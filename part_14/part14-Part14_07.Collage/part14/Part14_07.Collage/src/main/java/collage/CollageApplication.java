package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class    CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);
                xCoordinate++;
            }
            yCoordinate++;
        }

        WritableImage smallerImage = new WritableImage(width/2, height/2);
        PixelWriter pixelWriter = smallerImage.getPixelWriter();

        int yCoord = 0;
        while (yCoord < height/2) {
            int xCoordinate = 0;
            while (xCoordinate < width / 2) {

                Color color = imageReader.getColor(xCoordinate*2, yCoord*2);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(1.0-red, 1.0-green, 1.0-blue, opacity);

                pixelWriter.setColor(xCoordinate, yCoord, newColor);
                xCoordinate++;
            }
            yCoord++;
        }

        ImageView image = new ImageView(smallerImage);
        ImageView image2 = new ImageView(smallerImage);
        ImageView image3 = new ImageView(smallerImage);
        ImageView image4 = new ImageView(smallerImage);
        image2.setTranslateX(width/2);
        image3.setTranslateY(height/2);
        image4.setTranslateY(height/2);
        image4.setTranslateX(width/2);
        ImageView origImage = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().addAll(origImage, image, image2, image3, image4);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}