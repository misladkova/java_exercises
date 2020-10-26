package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        NumberAxis x = new NumberAxis(1968, 2008, 4);
        NumberAxis y = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> chart = new LineChart<>(x, y);

        chart.setTitle("Relative support of the parties");

        Map<String, Map<Integer, Double>> lines = readFile("partiesdata.tsv");
        lines.keySet().stream().forEach(party->{
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            lines.get(party).entrySet().stream().forEach(pair->{
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            chart.getData().add(data);
        });


        Scene scene = new Scene(chart, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public Map<String, Map<Integer, Double>> readFile(String file){
        Map<String, Map<Integer, Double>> lines = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get(file))){
            int count = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split("\t");
                if(count==0){
                    for(int i=1; i< parts.length; i++){
                        years.add(Integer.valueOf(parts[i]));
                    }
                }else{
                    Map<Integer, Double> pairs = new HashMap<>();
                    for(int i=1; i< parts.length; i++){
                        if(!(parts[i].equals("-"))) {
                            pairs.put(years.get(i - 1), Double.valueOf(parts[i]));
                        }
                    }
                    lines.put(parts[0], pairs);
                }
                count++;
            }

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return lines;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch(PartiesApplication.class);
    }

}
