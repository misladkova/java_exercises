
import com.sun.org.apache.xpath.internal.operations.String;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {

    }

    public static ArrayList<Literacy> register(String file){
        ArrayList<Literacy> register = new ArrayList<>();
        try{
            Files.lines(Paths.get(file))
                    .map(line->line.split(","))
                    .filter(line->line.length>=6)
                    .map(line->
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
