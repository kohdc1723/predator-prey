package factory;

import java.util.Random;

import model.Board;
import model.Organism;

public class BoardInitializer {
    private static final Random rand = new Random();

    public static void initialize(Board board) {
        board.clear();

        for (int y = 0; y < board.getHeight(); ++y) {
            for (int x = 0; x < board.getWidth(); ++x) {
                int randomValue = rand.nextInt(100);

                OrganismFactory.OrganismType type =
                    OrganismFactory.getOrganismTypeByProbability(randomValue);

                if (type != null) {
                    Organism organism = OrganismFactory.createOrganism(type);
                    board.getCell(x, y).setOrganism(organism);
                }
            }
        }
    }
}
