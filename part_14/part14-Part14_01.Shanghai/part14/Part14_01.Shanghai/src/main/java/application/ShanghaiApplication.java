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

        XYChart.Series<Number, Number> data = new XYChart.Series<>();

        data.setName("ShanghaiRank");

        data.getData().add(new XYChart.Data(2007, 73));
        data.getData().add(new XYChart.Data(2008, 68));
        data.getData().add(new XYChart.Data(2009, 72));
        data.getData().add(new XYChart.Data(2010, 72));
        data.getData().add(new XYChart.Data(2011, 74));
        data.getData().add(new XYChart.Data(2012, 73));
        data.getData().add(new XYChart.Data(2013, 76));
        data.getData().add(new XYChart.Data(2014, 73));
        data.getData().add(new XYChart.Data(2015, 67));
        data.getData().add(new XYChart.Data(2016, 56));
        data.getData().add(new XYChart.Data(2017, 56));

        chart.getData().add(data);


        Scene scene = new Scene(chart, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(ShanghaiApplication.class);
    }

}
