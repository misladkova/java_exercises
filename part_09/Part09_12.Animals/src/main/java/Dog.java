public class Dog extends Animal implements NoiseCapable{

    private String name;

    public Dog(String name){
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark() {
        System.out.println(super.getName()+" barks");
    }

    @Override
    public void makeNoise() {
        bark();
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
