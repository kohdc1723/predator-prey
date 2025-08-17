package view;

import javax.swing.JPanel;
import javax.swing.JButton;

import controller.SimulationManager;

public class ControlPanel extends JPanel {
    public ControlPanel(SimulationManager manager) {
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton initButton = new JButton("Init");

        add(initButton);
        add(startButton);
        add(stopButton);

        startButton.addActionListener(e -> manager.start());
        stopButton.addActionListener(e -> manager.stop());
        initButton.addActionListener(e -> manager.init());
    }
}
