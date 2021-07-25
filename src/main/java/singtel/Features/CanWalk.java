package singtel.Features;

public interface CanWalk extends AnimalFeatures {
    default void walk() {
        System.out.println("I am walking");
    }
}
