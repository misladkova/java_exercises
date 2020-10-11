public class Literacy implements Comparable<Literacy>{

    private String country;
    private  int year;
    private String gender;
    private double literacyPercentage;

    public Literacy(String country, int year, String gender, double literacyPercentage){
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

    public double getLiteracyPercentage() {
        return literacyPercentage;
    }

    @Override
    public String toString(){
        return getCountry()+" ("+getYear()+"), "+getGender()+", "+getLiteracyPercentage();
    }

    @Override
    public int compareTo(Literacy literacy){
        if(literacyPercentage-literacy.getLiteracyPercentage()==0){
            return 0;
        }
        if(literacyPercentage-literacy.getLiteracyPercentage()<0){
            return -1;
        }
        return 1;
    }
}
