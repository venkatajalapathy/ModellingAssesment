package singtel.models;

import singtel.Features.CanSwim;
import singtel.Features.FishAction;

public abstract class Fish implements Animal, CanSwim, FishAction {
    private String size;
    private String colour;

    public Fish(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }
}

