package singtel.models;

public interface Animal {

    default String getName() {
        return this.getClass().getSimpleName();
    }
}
