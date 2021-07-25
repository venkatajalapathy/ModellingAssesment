package singtel.models;

import singtel.Features.CanMakeSound;

public class Dog extends WalkingAnimal implements CanMakeSound {

    @Override
    public void makeSound() {
        System.out.println("Woof, woof");
    }
}
