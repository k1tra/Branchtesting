package Animal;

public class Cat extends Animal {

public void makeSound(){
    System.out.println("Miawwwww");
}

    @Override
    public boolean eatMe(String foodType) {
        return true;
    }

    public void showMood(boolean mood){
        if(mood){
            System.out.println("Kattemand er glad nu spinner hale helt vildt");
        }else{
            System.out.println("Kattemand sur nu helt vildt helt vildt");
        }
    }

}
