public class Cat extends Animal implements NoiseCapable{

    private String name;

    public Cat(String name){
        super(name);
    }

    public Cat(){
        super("Cat");
    }

    public void purr() {
        System.out.println(super.getName()+" purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }

    @Override
    public void eat(){
        super.eat();
    }

    @Override
    public void sleep(){
        super.sleep();
    }


}



