package model;

public class Board {
    private int height;
    private int width;
    private final Cell[][] grid;

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
