package Animal;

public class Dog extends Animal  {
    public void makeSound(){
        System.out.println("Woof!");
    }

    @Override
    public boolean eatMe(String foodType) {
        return true;
    }
    public void showMood(boolean mood){
        if(mood){
            System.out.println("Hundemand er glad nu logrer hale helt vildt");
        }else{
            System.out.println("Hundemand sur nu helt vildt helt vildt");
        }
    }

}
