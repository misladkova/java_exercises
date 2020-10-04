
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String vypis = "";
        for (int i=0; i< elements.size(); i++){
            if (i== elements.size()-1){
                vypis = vypis+elements.get(i);
            }else {
                vypis = vypis + elements.get(i) + "\n";
            }
        }
        if (this.elements.size()==0){
            return "The collection "+this.name+" is empty.";
        }
        if (this.elements.size()==1){
            return "The collection "+this.name+" has 1 element:\n"+vypis;
        }else{
            return "The collection "+this.name+" has "+this.elements.size()+" elements:\n"+vypis;
        }
    }
    
}
