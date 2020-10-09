public class Dog extends Animal{

    private String name;

    public Dog(String name){
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark(){
        System.out.println(super.getName()+" barks");
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
