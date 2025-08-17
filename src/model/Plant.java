package model;

import java.util.Random;

public class Plant extends Organism {
    private static final Random rand = new Random();

    public Plant(int x, int y, int breedInterval) {
        super(x, y, breedInterval);
    }

    @Override
    void move() {
        ++age;
    }

    @Override
    Organism breed() {
        return null;
    }
}
