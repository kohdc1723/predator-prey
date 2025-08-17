package model;

import java.util.Random;

public class Board {
    private static final Random rand = new Random();
    private int height;
    private int width;
    private Cell[][] grid;

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        this.grid = new Cell[height][width];

        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                grid[y][x] = new Cell(x, y);
            }
        }
    }

    public void update() {
        // TODO: Organism actions
    }

    public void clear() {
        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                grid[y][x].clear();
            }
        }
    }

    public void fillCells() {
        clear();

        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                int random = rand.nextInt(100);

                if (random < 40) {
                    grid[y][x].setOrganism(new Plant(x, y, 1));
                } else if (random < 60) {
                    grid[y][x].setOrganism(new Herbivore(x, y, 3));
                } else if (random < 70) {
                    grid[y][x].setOrganism(new Carnivore(x, y, 5));
                }
            }
        }
    }

    public Cell getCell(int x, int y) {
        return grid[y][x];
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
