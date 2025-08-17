package model;

public class Cell {
    private int x;
    private int y;
    private Organism organism;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.organism = null;
    }

    public void clear() {
        organism = null;
    }

    public boolean isEmpty() {
        return organism == null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Organism getOrganism() {
        return organism;
    }

    public void setOrganism(Organism organism) {
        this.organism = organism;
    }
}
