package singtel.models;

import singtel.Features.CanChangeTo;

public class Caterpillar extends WalkingAnimal implements CanChangeTo {

    @Override
    public Animal changeTo() {
        return new Butterfly();
    }
}