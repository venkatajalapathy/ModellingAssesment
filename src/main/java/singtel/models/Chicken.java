package singtel.models;

import singtel.Features.CanMakeSound;
import singtel.models.WalkingAnimal;

public class Chicken extends WalkingAnimal implements CanMakeSound {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

}
