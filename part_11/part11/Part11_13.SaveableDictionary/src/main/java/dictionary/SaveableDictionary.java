package dictionary;

import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
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

}


