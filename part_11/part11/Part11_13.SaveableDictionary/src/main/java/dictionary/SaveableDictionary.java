package dictionary;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        for(String s:dictionary.keySet()){
            if(dictionary.get(s).equals(word)) {
                return s;
            }
        }
        return null;
    }

    public void delete(String word){
        dictionary.remove(word);
        dictionary.entrySet().removeIf(entry -> (word.equals(entry.getValue())));
    }

    public boolean load(){
        Scanner reader = null;
        try {
            reader = new Scanner(Paths.get(file));
        } catch (IOException e) {
            return false;
        }
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            String[] parts = line.split(":");
            dictionary.putIfAbsent(parts[0], parts[1]);
        }
        return true;
    }

}


