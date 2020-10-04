import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        suitcases.add(suitcase);
        int zvysok = maximumWeight-suitcase.totalWeight();
        maximumWeight = zvysok;
        if (zvysok<0){
            maximumWeight = zvysok+suitcase.totalWeight();
            suitcases.remove(suitcase);
        }
    }

    public String toString(){
        int vaha = 0;
        for (Suitcase suitcase: suitcases){
            vaha+=suitcase.totalWeight();
        }
        if (suitcases.isEmpty()){
            return "no suitcases ("+vaha + " kg)";
        }
        if (suitcases.size()==1){
            return "1 suitcase ("+vaha+" kg)";
        }
        return this.suitcases.size() + " suitcases (" + vaha + " kg)";
    }

    public void printItems(){
        for (Suitcase suitcase: suitcases){
            suitcase.printItems();
        }
    }

}

