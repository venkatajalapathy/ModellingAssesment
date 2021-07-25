package singtel.service;

import singtel.Features.AnimalFeatures;
import singtel.models.*;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class Solution {

    private List<Animal> animals;

    @PostConstruct
    void init() {
        animals = new ArrayList<>();
        Animal[] animalTypes = new Animal[]{
                new Cat(),
                new Dog(),
                new Butterfly(),
                new Caterpillar(),
                new Chicken(),
                new Rooster(),
                new ClownFish(),
                new Dolphin(),
                new Duck(),
                new Parrot(new Dog()),
                new Parrot(new Cat()),
                new Parrot(new Rooster()),
                new Shark()
        };
        animals.addAll(Arrays.asList(animalTypes));
    }

    public int count(Class<? extends AnimalFeatures> feature) {
        return (int) animals.stream().filter(feature::isInstance).count();
    }

    public List<String> listAnimals(Class<? extends AnimalFeatures> feature) {
        return animals.stream().filter(feature::isInstance).map(Animal::getName)
                .collect(Collectors.toList());
    }

    public List<String> listAnimals() {
        return animals.stream().map(Animal::getName).collect(Collectors.toList());
    }


}
