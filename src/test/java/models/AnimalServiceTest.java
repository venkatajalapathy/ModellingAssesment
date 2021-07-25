package models;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import singtel.Features.*;
import singtel.service.Solution;

@SpringBootTest(classes = Solution.class)
public class AnimalServiceTest {

    @Autowired
    private Solution animalService;

    @Test
    public void test_animals_which_can_walk() {
        List<String> walkingAnimals = animalService.listAnimals(CanWalk.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"Cat", "Caterpillar", "Chicken", "Dog",
                "Duck", "Parrot living with Cat", "Parrot living with Dog",
                "Parrot living with Rooster", "Rooster",};

        Assertions.assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }

    @Test
    public void test_count_animals_which_can_walk() {
        int count = animalService.count(CanWalk.class);
        Assertions.assertEquals(9, count);
    }

    @Test
    public void test_animals_which_can_swim() {
        List<String> walkingAnimals = animalService.listAnimals(CanSwim.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"ClownFish", "Dolphin", "Duck", "Shark"};

        Assertions.assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }

    @Test
    public void test_animals_which_can_sing() {
        List<String> walkingAnimals = animalService.listAnimals(CanSing.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"Parrot living with Cat", "Parrot living with Dog",
                "Parrot living with Rooster"};

        Assertions.assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }
}