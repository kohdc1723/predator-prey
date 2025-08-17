package view;

import model.Board;
import model.Carnivore;
import model.Cell;
import model.Herbivore;
import model.Organism;
import model.Plant;

import javax.swing.*;
import java.awt.*;

public class SimulationPanel extends JPanel {
    private static final int CELL_SIZE = 20;
    private static final int PADDING = 20;
    private final Board board;

    public SimulationPanel(Board board) {
        this.board = board;

        Dimension preferredSize = new Dimension(
            board.getWidth() * CELL_SIZE + PADDING * 2,
            board.getHeight() * CELL_SIZE + PADDING * 2
        );
        setPreferredSize(preferredSize);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int y = 0; y < board.getHeight(); ++y) {
            for (int x = 0; x < board.getWidth(); ++x) {
                Cell cell = board.getCell(x, y);

                int drawX = x * CELL_SIZE + PADDING;
                int drawY = y * CELL_SIZE + PADDING;

                if (!cell.isEmpty()) {
                    Organism organism = cell.getOrganism();

                    if (organism instanceof Plant) {
                        g.setColor(Color.GREEN);
                    } else if (organism instanceof Herbivore) {
                        g.setColor(Color.YELLOW);
                    } else if (organism instanceof Carnivore) {
                        g.setColor(Color.RED);
                    }

                    g.fillRect(drawX, drawY, CELL_SIZE, CELL_SIZE);
                }

                g.setColor(Color.GRAY);
                g.drawRect(drawX, drawY, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    public Board getBoard() {
        return board;
    }
}
