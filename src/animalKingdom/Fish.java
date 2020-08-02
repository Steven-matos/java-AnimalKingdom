package animalKingdom;

public class Fish extends AbstractAnimal {

    public Fish(String name, int year) {
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
    public String move() {
        return "Swim";
    }

    @Override
    public String breath() {
        return "Gills";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }

    @Override
    public String toString() {
        return "Animals{id=" + id + ", name=\'" + name + "\', yearNamed=" + year;
    }
}