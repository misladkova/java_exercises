public class Literacy implements Comparable<Literacy>{

    private String country;
    private  int year;
    private String gender;
    private int literacyPercentage;

    public Literacy(String country, int year, String gender, int literacyPercentage){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyPercentage = literacyPercentage;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public int getLiteracyPercentage() {
        return literacyPercentage;
    }

    @Override
    public String toString(){
        return getCountry()+" ("+getYear()+"), "+getGender()+", "+getLiteracyPercentage();
    }

    @Override
    public int compareTo(Literacy literacy){
        return this.literacyPercentage-literacy.getLiteracyPercentage();
    }
}
