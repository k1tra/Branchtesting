import Animal.Cat;
import Animal.Dog;

public class Main {
    public static void main(String[] args) {
        Dog doggo = new Dog();
        Cat catto = new Cat();

        doggo.makeSound();
        catto.makeSound();

        doggo.showMood(true);
        doggo.showMood(false);
        catto.showMood(true);
        catto.showMood(false);
    }
}
