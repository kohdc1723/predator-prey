package view;

import javax.swing.*;

import controller.SimulationManager;

public class SimulationFrame {
    private final SimulationPanel simulationPanel;
    private final ControlPanel controlPanel;

    public SimulationFrame(int height, int width, SimulationManager manager) {
        JFrame frame = new JFrame("Predator-Prey Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        simulationPanel = new SimulationPanel(height, width);
        controlPanel = new ControlPanel(manager);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(simulationPanel);
        frame.add(controlPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public void refresh() {
        simulationPanel.repaint();
    }

    public SimulationPanel getSimulationPanel() {
        return simulationPanel;
    }
}
