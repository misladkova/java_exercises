
import java.util.Objects;

public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public boolean equals(Object compared){
        if (this==compared){
            return true;
        }
        if (compared==null || this.getClass() !=compared.getClass()){
            return false;
        }
        LicensePlate licensePlate = (LicensePlate) compared;
        return this.liNumber.equals(((LicensePlate) compared).liNumber) && this.country.equals(((LicensePlate) compared).country);
    }

    public int hashCode(){
        return liNumber.hashCode()+country.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
