package controller;

import javax.swing.Timer;

import factory.BoardInitializer;
import model.Board;
import view.SimulationFrame;

public class SimulationManager {
    private static final int tickInterval = 500;
    private final Timer timer;
    private final SimulationFrame simulationFrame;

    public SimulationManager(int height, int width) {
        this.simulationFrame = new SimulationFrame(height, width, this);
        this.timer = new Timer(tickInterval, e -> tick());
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    public void init() {
        Board board = simulationFrame.getSimulationPanel().getBoard();
        BoardInitializer.initialize(board);
        simulationFrame.refresh();
    }

    private void tick() {
        Board board = simulationFrame.getSimulationPanel().getBoard();
        board.update();
        simulationFrame.refresh();
    }
}
