package controller;

import model.Board;
import view.ControlPanel;
import view.SimulationPanel;

import javax.swing.*;

public class SimulationController {
    private final SimulationPanel simulationPanel;
    private final ControlPanel controlPanel;
    private final Timer timer;

    public SimulationController(int height, int width) {
        JFrame frame = new JFrame("Predator-Prey Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board board = new Board(height, width);
        simulationPanel = new SimulationPanel(board);
        controlPanel = new ControlPanel(this);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(simulationPanel);
        frame.add(controlPanel);
        frame.pack();
        frame.setVisible(true);

        timer = new Timer(500, e -> tick());
    }

    private void tick() {
        simulationPanel.getBoard().update();
        simulationPanel.repaint();
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    public void initBoard() {
        simulationPanel.getBoard().fillCells();
        simulationPanel.repaint();
    }
}
