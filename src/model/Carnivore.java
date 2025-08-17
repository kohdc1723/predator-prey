package model;

import java.util.Random;

public class Carnivore extends Organism {
    private static final Random rand = new Random();

    public Carnivore(int breedInterval) {
        super(breedInterval);
    }

    @Override
    void move() {

    }

    @Override
    Organism breed() {
        return null;
    }
}
