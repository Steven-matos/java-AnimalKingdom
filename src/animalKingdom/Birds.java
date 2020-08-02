package animalKingdom;

public class Birds extends AbstractAnimal {

    public Birds(String name, int year) {
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
        return "Fly";
    }

    @Override
    public String breath() {
        return "Lungs";
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