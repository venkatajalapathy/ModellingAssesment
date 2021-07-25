package singtel.models;

import singtel.Features.CanMakeSound;

public class Cat extends WalkingAnimal implements CanMakeSound {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
