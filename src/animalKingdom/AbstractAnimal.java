package animalKingdom;

abstract class AbstractAnimal {
    protected static int uniqueId = -1;
    protected int id;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year) {
        uniqueId++;
        id = uniqueId;
        this.name = name;
        this.year = year;
    }

    abstract String getName();

    abstract int getYear();

    abstract String move();

    abstract String reproduce();

    abstract String breath();
}