package singtel.controller;

import singtel.Features.*;

public class AnimalActivityFectory {

    public static Class<? extends AnimalFeatures> getActivity(String activity) {
        switch (activity) {
            case "fly":
                return CanFly.class;
            case "walk":
                return CanWalk.class;
            case "swim":
                return CanSwim.class;
            case "sing":
                return CanSing.class;
            case "talk":
                return CanMakeSound.class;
            default:
                throw new RuntimeException("Invalid animal activity");
        }
    }
}
