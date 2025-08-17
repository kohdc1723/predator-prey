package model;

public abstract class Organism {
    protected int x;
    protected int y;
    protected int age;
    protected boolean alive;
    protected int breedInterval;

    protected Organism(int x, int y, int breedInterval) {
        this.x = x;
        this.y = y;
        this.alive = true;
        this.age = 0;
        this.breedInterval = breedInterval;
    }

    abstract void move();
    abstract Organism breed();
}
