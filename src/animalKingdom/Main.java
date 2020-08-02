package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static List<AbstractAnimal> filteredAnimals = new ArrayList<>();

    public static void filteredAnimal(List<AbstractAnimal> animal, CheckAnimal tester) {
        filteredAnimals.clear();
        for (AbstractAnimal a : animal) {
            if (tester.test(a)) {
                filteredAnimals.add(a);
            }
        }
    }

    public static void main(String[] args) {

        List<AbstractAnimal> animals = new ArrayList<>();

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigFoot = new Mammals("Big Foot", 2021);

        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigFoot);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Tocan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("CatFish", 1817);
        Fish perch = new Fish("Perch", 1758);

        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("*** List all the animals in decending order by year named ***");
        animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println(animals);

        System.out.println("\n*** List all the animals aplhaetically ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animals);

        System.out.println("\n*** List all the animals order by how they move ***");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animals);

        System.out.println("\n*** List only those animals that breath with lungs ***");
        filteredAnimal(animals, (animal -> animal.breath() == "Lungs"));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " "
                + animal.move() + " " + animal.breath() + " " + animal.getYear()));

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filteredAnimal(animals, (animal -> animal.breath() == "Lungs" && animal.getYear() == 1758));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " "
                + animal.move() + " " + animal.breath() + " " + animal.getYear()));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        filteredAnimal(animals, (animal -> animal.reproduce() == "Eggs" && animal.breath() == "Lungs"));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " "
                + animal.move() + " " + animal.breath() + " " + animal.getYear()));

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        filteredAnimal(animals, animal -> animal.getYear() == 1758);
        filteredAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " "
                + animal.move() + " " + animal.breath() + " " + animal.getYear()));

        System.out.println(
                "\n*** Stretch Goal for the list of animals, list aplabetically those animals that are mammals ***");
        filteredAnimal(animals, animal -> animal.reproduce() == "Live Births");
        filteredAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " "
                + animal.move() + " " + animal.breath() + " " + animal.getYear()));
    }

}