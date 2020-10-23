package application;

import java.util.*;

public class Dictionary {

    private List<String> words;
    private Map<String, String> translations;

    public Dictionary(){
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        addTranslation("word", "slovo");
    }

    public void addTranslation(String word, String translation){
        if(!(translations.containsKey(word))){
            words.add(word);
        }
        translations.put(word, translation);
    }

    public String getTranslation(String word){
        return translations.get(word);
    }

    public String getRandomWord(){
        Random randomWord = new Random();
        return words.get(randomWord.nextInt(words.size()));
    }

}
