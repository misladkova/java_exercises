public abstract class Animal{

    private String animalName;

    public Animal(String name){
        this.animalName = name;
    }

    public void eat(){
        System.out.println(animalName+" eats");
    }

    public void sleep(){
        System.out.println(animalName+" sleeps");
    }

    public String getName(){
        return animalName;
    }
}
