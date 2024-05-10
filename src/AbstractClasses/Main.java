package AbstractClasses;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Yorkie", "small", 13));
        animals.add(new Fish("Goldfish", "small", 1.1));
        animals.add(new Fish("Shark", "medium", 125));
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
