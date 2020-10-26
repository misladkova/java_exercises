package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    Slider firstSlider = new Slider(25, 250, 25);
    Slider secondSlider = new Slider(0, 10, 0);
    Label savingsValue = new Label(Double.toString(firstSlider.getValue()));
    Label interestRateValue = new Label(Double.toString(secondSlider.getValue()));
    NumberAxis x = new NumberAxis(0, 30, 1);
    NumberAxis y = new NumberAxis();
    LineChart<Number, Number> lineChart = new LineChart<>(x, y);

    public void updateData(double sav, double rate) {
        savingsValue.setText(String.format("%.1f", sav));
        interestRateValue.setText(String.format("%.1f", rate));
        XYChart.Series<Number, Number> data1 = new XYChart.Series<>();
        for (int years = 0; years < 31; years++) {
            data1.getData().add(new XYChart.Data<>(years, (years * 12 * sav)));
        }

        XYChart.Series<Number, Number> data2 = new XYChart.Series<>();
        double sum = 0;
        for (int years = 0; years < 31; years++) {
            double a = ((sum + sav * 12) / 100 * rate);
            sum += a + (sav * 12);
            data2.getData().add(new XYChart.Data<>(years, sum));
        }

        lineChart.getData().clear();
        lineChart.getData().add(data1);
        lineChart.getData().add(data2);
    }

    @Override
    public void start(Stage stage) throws Exception {

        lineChart.setTitle("Savings Calculator");

        Label savings = new Label("Monthly savings");
        Label interestRate = new Label("Yearly interest rate");
        //Slider firstSlider = new Slider(25, 250, 25);
        firstSlider.setShowTickLabels(true);
        firstSlider.setShowTickMarks(true);

        XYChart.Series<Number, Number> data = new XYChart.Series<>();

        firstSlider.valueProperty().addListener((ov, old_val, new_val) -> {
            double sav = (double) new_val;
            double rate = secondSlider.getValue();
            updateData(sav, rate);
        });

        secondSlider.valueProperty().addListener((ov, old_val, new_val) -> {
            double sav = firstSlider.getValue();
            double rate = (double) new_val;
            updateData(sav, rate);
        });

        for (int years = 0; years < 31; years++) {
            data.getData().add(new XYChart.Data<>(years, (years * 12 * firstSlider.getValue())));
        }
        lineChart.getData().add(data);

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

