package animalKingdom;

public class Mammals extends AbstractAnimal {

    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String reproduce() {
        return "Live Births";
    }

    @Override
    public String breath() {
        return "Lungs";
    }

    @Override
    public String move() {
        return "Walks";
    }

    @Override
    public String toString() {
        return "Animals{id=" + id + ", name=\'" + name + "\', yearNamed=" + year;
    }
}