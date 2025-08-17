package model;

public abstract class Organism {
    protected int age;
    protected boolean alive;
    protected int breedInterval;

    protected Organism(int breedInterval) {
        this.alive = true;
        this.age = 0;
        this.breedInterval = breedInterval;
    }

    abstract void move();
    abstract Organism breed();
}
