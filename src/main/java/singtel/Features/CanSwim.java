package singtel.Features;

public interface CanSwim extends AnimalFeatures {
    default void swim() {
        System.out.println("I am swimming");
    }
}
