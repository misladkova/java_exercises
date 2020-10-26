package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        NumberAxis x = new NumberAxis(0, 30, 1);
        NumberAxis y = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(x, y);
        lineChart.setTitle("Savings Calculator");

        Label savings = new Label("Monthly savings");
        Label interestRate = new Label("Yearly interest rate");
        Slider firstSlider = new Slider(25, 250, 25);
        firstSlider.setShowTickLabels(true);
        firstSlider.setShowTickMarks(true);
        Slider secondSlider = new Slider(0, 10, 0);
        Label savingsValue = new Label(Double.toString(firstSlider.getValue()));
        Label interestRateValue = new Label(Double.toString(secondSlider.getValue()));

        BorderPane slider1 = new BorderPane();
        slider1.setLeft(savings);
        slider1.setCenter(firstSlider);
        slider1.setRight(savingsValue);

        BorderPane slider2 = new BorderPane();
        slider2.setLeft(interestRate);
        slider2.setCenter(secondSlider);
        slider2.setRight(interestRateValue);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(slider1, slider2);
        vBox.setSpacing(10);

        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(15, 15, 15, 15));
        bp.setCenter(lineChart);
        bp.setTop(vBox);

        Scene scene = new Scene(bp, 650, 400);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(SavingsCalculatorApplication.class);
    }

}

