
public class Main {

    public static void main(String[] args) {

        Person mike = new Person("Mike", 20, 180, 80);
        HealthStation childrenHospital = new HealthStation();

        System.out.println(mike.getName()+"'s weight: "+childrenHospital.weigh(mike)+" kilos");

        childrenHospital.feed(mike);
        childrenHospital.feed(mike);

        System.out.println(mike.getName()+"'s weight: "+childrenHospital.weigh(mike)+" kilos");

        System.out.println("weighings performed: "+childrenHospital.weighings());
    }
}
