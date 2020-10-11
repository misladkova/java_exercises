
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        System.out.println(readRegister("literacy.csv"));
    }

    public static ArrayList<Literacy> readRegister(String file){
        ArrayList<Literacy> register = new ArrayList<>();
        try{
            Files.lines(Paths.get(file))
                    .map(line->line.split(","))
                    .filter(line->line.length>=6)
                    .map(line->new Literacy(line[3], Integer.valueOf(line[4]), line[2], Integer.valueOf(line[5])))
                    .forEach(literacy->register.add(literacy));
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return register;
    }

}
