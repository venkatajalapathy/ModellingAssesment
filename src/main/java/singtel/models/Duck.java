package singtel.models;

import singtel.Features.CanMakeSound;
import singtel.Features.CanSwim;

public class Duck extends FlyingBird implements CanMakeSound, CanSwim {

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }
}
