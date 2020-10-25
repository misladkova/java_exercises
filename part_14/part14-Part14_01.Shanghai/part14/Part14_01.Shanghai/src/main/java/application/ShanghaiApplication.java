package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();

        x.setLabel("Year");
        y.setLabel("Ranking");

        LineChart<Number, Number> chart = new LineChart<>(x, y);

        chart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series data = new XYChart.Series();

        Scene scene = new Scene(chart, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(ShanghaiApplication.class);
    }

}
