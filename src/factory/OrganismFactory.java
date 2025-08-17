package factory;

import model.Carnivore;
import model.Herbivore;
import model.Organism;
import model.Plant;

public class OrganismFactory {
    public enum OrganismType {
        PLANT, HERBIVORE, CARNIVORE
    }

    public static Organism createOrganism(OrganismType type) {
        return switch (type) {
            case PLANT -> new Plant(1);
            case HERBIVORE -> new Herbivore(2);
            case CARNIVORE -> new Carnivore(4);
        };
    }

    public static OrganismType getOrganismTypeByProbability(int randomValue) {
        if (randomValue < 40) {
            return OrganismType.PLANT;
        } else if (randomValue < 60) {
            return OrganismType.HERBIVORE;
        } else if (randomValue < 70) {
            return OrganismType.CARNIVORE;
        } else {
            return null;
        }
    }
}
