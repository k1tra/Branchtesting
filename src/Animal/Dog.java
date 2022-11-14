package Animal;

public class Dog extends Animal  {
    public void makeSound(){
        System.out.println("Woof!");
    }

    @Override
    public boolean eatMe(String foodType) {
        return true;
    }

}
