package view;

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.SimulationController;

public class ControlPanel extends JPanel {
    private JButton startButton;
    private JButton stopButton;
    private JButton initButton;
    private SimulationController simulationController;

    public ControlPanel(SimulationController simulationController) {
        this.simulationController = simulationController;

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        initButton = new JButton("Init");

        add(initButton);
        add(startButton);
        add(stopButton);

        startButton.addActionListener(e -> this.simulationController.start());
        stopButton.addActionListener(e -> this.simulationController.stop());
        initButton.addActionListener(e -> this.simulationController.initBoard());
    }
}
