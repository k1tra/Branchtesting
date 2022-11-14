package Animal;

public class Cat extends Animal {

public void makeSound(){
    System.out.println("Miawwwww");
}

    @Override
    public boolean eatMe(String foodType) {
        return true;
    }
}
