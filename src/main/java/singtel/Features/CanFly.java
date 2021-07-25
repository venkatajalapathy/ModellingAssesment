package singtel.Features;

public interface CanFly extends AnimalFeatures {

    default void fly() {
        System.out.println("I am flying");
    }
}
