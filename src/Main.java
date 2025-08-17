import controller.SimulationController;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimulationController simulationController = new SimulationController(25, 25);
            simulationController.initBoard();
        });
    }
}
