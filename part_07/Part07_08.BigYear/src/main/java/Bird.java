public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird(String name1, String latinName1, int observation1) {
        this.name = name1;
        this.latinName = latinName1;
        this.observation = observation1;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }

    public void addObservation() {
        observation++;

    }

    public String toString() {
        if (getObservation() == 1) {
            return getName() + " (" + getLatinName() + "): " + getObservation() + " observation";
        }
        return getName() + " (" + getLatinName() + "): " + getObservation() + " observations";
    }

}
