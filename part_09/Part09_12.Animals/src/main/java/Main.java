
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        NoiseCapable dogs = new Dog();
        dogs.makeNoise();

        NoiseCapable cats = new Cat("Garfield");
        cats.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }

}
